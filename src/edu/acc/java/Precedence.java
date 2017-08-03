package edu.acc.java;

/**
 * Create a class called Precedence that allocates a bolean array of
 * 10 elements, then:
 * 1) Fills up the array with boolean results using the rules of 
 *    precedence only (no parentheses) and your imagination. Try
 *    to maximize number of operators used
 * 2) Prints the array
 *  
 * @author pi
 *
 */
public class Precedence {

	public static void main(String[] args) {

		boolean[] bools = new boolean[10];
		int x = 8, n = 7, m = 3;
		bools[0] = 2/7 + x++ - 63%8 * 2 > 4 || 7 == 7; // after x == 9
		bools[1] = n++%++m == 3;  // after n == 8, m == 4
        bools[2] = n++/m-- == 2;  // after n == 9, m == 3 
        bools[3] = 5.5 + 9/2*3%8 >5 && x == 9; 
        bools[4] = 2.1/7/2 <= 0 || ++x%9 == 1;  //after x == 10
        bools[5] = 1 == --x || --m == 2; // after x == 9, m == 2
        bools[6] = x-6 > ++m || n != 9 || 12 < x+10; // after m == 3
        bools[7] = 6/5+11/3*2%33 == 7 && m*4-x == 3;
        bools[8] = x == m + 18 / 7%4*3 && x >= n ;
        bools[9] = --x /9%3+2*m+2 == x && m%n+5 == x; // x == 8
        
        for (boolean b : bools) {
        	System.out.println(b);
        }
	}

}
