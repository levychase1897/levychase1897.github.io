package edu.acc.java;

/**
 * 
 ##ITSE 1003 Intro To Programming Final Project
 
 * The class project is a problem that should exercise most of what you have learned in class
 * The project must be completed and submitted to the instructor to pass the course
 * You can work on the project in class or at home 
 
 ###Instructions
 You are building a "shape calculator" which:
 * Has a class name of ShapeCalc
 * Calculates the area of a shape based on command line arguments and prints result
 * Uses the first argument as the name of the shape: "rectangle", "triangle", "circle", “annulus”
 * Uses remaining arguments as numbers describing the shape i.e. 
   * rectangle would take two additional arguments (length and width)
   * triangle (equilateral) would only take one (length of a side)
   * circle only one (radius) 
   * annulus would take two (outer diameter and inner diameter) 
   * Example command line arguments would be: 
 
     rectangle 7 62 
     triangle 16 
     circle 5 
     annulus 7 6
 
 * There is no need to catch exceptions (an advanced topic), but you should sanity check the 
   args array to make sure the number of parameters is correct
 * Use a switch statement which has case keyword for each shape and a default which says "Shape not supported"
 * Please include your pseudocode in block comments 
 * Hint: the Math class has a method to do powers e.g. squared
 * Email your solution to peter.isburgh@austincc.edu by last class
 
 * @author pi
 *
 */

public class ShapeCalc {
	
	public static void main(String[] args) {

		if (args.length == 0) die("No arguments found"); 

		double area = 0;
		ShapeCalc sc = new ShapeCalc();

		switch (args[0].toLowerCase()) {
		case "rectangle":
			if (args.length != 3) die(
					"rectangle arguments: length width");
			double length = Double.parseDouble(args[1]);
			double width = Double.parseDouble(args[2]);
			area = length * width;
			break;

		case "circle":
			if (args.length != 2) die(
					"circle argument: radius");
			double circle_radius = Double.parseDouble(args[1]);
			area = Math.PI*Math.pow(circle_radius, 2);
			break;

		case "annulus":
			if (args.length != 3) die(
					"annulus arguments: inner_radius outer_radius");
			double inner_radius = Double.parseDouble(args[1]);
			double outer_radius = Double.parseDouble(args[2]);
			if (outer_radius - inner_radius < 0) die(
					"annulus arguments: inner_radius outer_radius");
			area = Math.PI*(Math.pow(outer_radius, 2) - 
					   Math.pow(inner_radius, 2));
			break;

		case "triangle":
			if (args.length != 2) die(
					"triangle argument: side_length");
			double side_length = Double.parseDouble(args[1]);
			area = (Math.pow(side_length, 2)*Math.sqrt(3))/4;
			break;

		default: 
			die("Shape '" + args[0] + "' not supported");
		}

		System.out.printf("Area of %s: %.2f units\n" , args[0], area);
	}


	@Override
	public String toString() {
		return "bumblebee in Acapulco";
	}

	/**
	 * Utility methods to print error msg and exit
	 * @param msg is error msg
	 */
	public static void die(String msg) {
		System.out.println(msg);
		System.exit(1);
	}

}
















