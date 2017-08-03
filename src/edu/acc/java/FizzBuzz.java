package edu.acc.java;

/**
 * Create a class called FizzBuzz that counts from 1 to 100 and:
 *   1) if the count is a multiple of 3, prints "fizz"
 *   2) if the count is a multiple of 5, prints "buzz"
 *   3) if the count is a multiple of 3 and 5, prints "fizzbuzz"
 *   
 * @author pi
 *
 */

public class FizzBuzz {

	public static void main(String[] args) {
		for (int n=1; n <= 100; n++) {
			String result = "";
			if (n%3 == 0) {
				result += "fizz";
			}
			if (n%5 == 0) {
				result += "buzz";
			}
		    System.out.println(n + result);	
		}

	}

}
