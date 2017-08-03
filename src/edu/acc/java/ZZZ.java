package edu.acc.java;

import java.util.Random;

/**
 * This class does ....
 * 
 * @author pi
 * @version 2.1
 *
 */
public class ZZZ {

	

	/**
	 * Method to return a random integer less than 5312
	 */
	static int getFrob() {
		//
		return new Random().nextInt(5312);
	}

	/**
	 * Entry point method so JVM can run this class
	 * 
	 * @param args are the command line arguments
	 */
	public static void main(String[] args) {

		byte b = (byte) 2000;
		char c = 'n';
		short s = 1000;
		int i = 8;
		long l = 2000L;
		float f = 2000.f;
		double d = 123.9;
		boolean bb = true;
		
		// TODO print the variables
		System.out.println(b);
		System.out.println("\n"+bb+d+f+"\n"+(l+i+s)+c+b);
		
for (int loopi = 0; loopi < 20; loopi++) {
			System.out.println("next frob=" + getFrob());
		}

	}

}
