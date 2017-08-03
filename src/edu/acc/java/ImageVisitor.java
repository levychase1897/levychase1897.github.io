package edu.acc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * FileVisitor implementation to make a List<Path> of files matching given pattern
 * 
 * @author pi
 *
 */
public class ImageVisitor implements FileVisitor<Path> {

	PrintWriter out; // servlet PrintStream
	PathMatcher globber; // defines files we're into
	List<Path> collection = new ArrayList<>(); 

	public ImageVisitor(String pattern, String root) {
		this.globber = FileSystems.getDefault().getPathMatcher("glob:*.{" + pattern + "}");
		Path rootPath = Paths.get(root);
		Set<FileVisitOption> options = new HashSet<>();
		options.add(FileVisitOption.FOLLOW_LINKS);
		try {
		    Files.walkFileTree(rootPath, options, Integer.MAX_VALUE, this);
		}
		catch (Exception ex) {}
	}
	
	/**
	 * Get the resulting collection of Paths
	 * 
	 * @return the Path list
	 */
	public List<Path> getCollection() {
		return collection;
	}

	@Override
	/**
	 * See FileVisitor interface
	 */
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	/**
	 * See FileVisitor interface
	 */
	public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {

		// do we want this file?
		if (!globber.matches(path.getFileName())) {
			return FileVisitResult.CONTINUE;
		}

		collection.add(path);
		return FileVisitResult.CONTINUE;
	}

	@Override
	/**
	 * See FileVisitor interface
	 */
	public FileVisitResult visitFileFailed(Path path, IOException exc) throws IOException {
		out.print("<br>-- failed to process: " + path.toAbsolutePath() + "[" + exc + "]");
		return FileVisitResult.CONTINUE;
	}

	@Override
	/**
	 * See FileVisitor interface
	 */
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

}
