package edu.acc.java;
/**
 * Grid class prints a square grid of characters on the console using
 * user specified parameters
 * 
 * @author pi
 *
 */
public class Grid {

	public static void main(String[] args) {
		String corner = "+";  // box corner symbol
		String edge = "|";  // box vertical edge symbol
		String inner = "-";  // box horizontal edge symbol
		String space = " ";  // box horizontal edge symbol
	    int vertBoxes = 8;  // how many boxes high?  // could use args[] for these...
	    int boxHeight = 2;  // height of each box?
	    int horizBoxes = 6;  // how many boxes wide?
	    int boxWidth = 5;  // width of each box?
	    
	    // loop to create each horizontal line
        for (int lineNum=0; lineNum <= vertBoxes*boxHeight; lineNum++) {
        	if (lineNum % boxHeight == 0) {  // box top or bottom?
        		System.out.println(  // yes
        				edgeLine(boxWidth, horizBoxes, corner, inner)
        				);
        	}
        	else {  // no, just an interior thank you
        		System.out.println(
        				edgeLine(boxWidth, horizBoxes, edge, space) 
        				);
        	}
        }
	}
	
	/**
	 * Prints a box top or bottom of the specified number of boxes
	 * @param boxWidth is width of each box
	 * @param horizBoxes is number of boxes horizontally
	 * @param corner is box corner symbol
	 * @param inner is box inner line symbol
	 * @return a String of correct number of boxes
	 */
	static String edgeLine(int boxWidth, int horizBoxes, 
			               String corner, String inner) {
		
		String resultLine = "";  // start with empty String to concatenate
		for (int i=0; i <= boxWidth*horizBoxes; i++) {
		    if (i % boxWidth == 0) {  // at a box corner?
		    	resultLine += corner;  // yes, add a corner
		    }
		    else {
		        resultLine += inner;  // no, add an horizontal edge
		    }
		}
		return resultLine;  // all done so return for printing
	}
	
}
