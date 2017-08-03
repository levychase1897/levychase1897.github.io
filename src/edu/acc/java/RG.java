package edu.acc.java;
import java.util.Random;

public class RG {
	// Take the sample code below and make the changes indicated
	public static void main(String[] x) {
		int numsLength = 100;
		int randMax = 1000;
		Integer[] nums = new Integer[numsLength];
		Random rand = new Random();

		// TODO change to use a for loop
		for (int i=0; i < nums.length; i++) {
		    nums[i] = rand.nextInt(randMax);
		}
		// TODO create a new int variable called sum
		int sum = 0;
		// TODO use for loop to sum elements of nums 
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		// TODO print the sum to the console
		System.out.println("sum=" + sum);
		RG rg = new RG();
		System.out.printf("my rg is %s and the value of pi is %20.3f " +
				"and %d is the age I will retire" ,
				rg, 3.14159, 66);
		System.out.print(" hey, I'm also here");
		int j1 = 8;
		int j2 = 10;
	    if (j1 > j2) {
	    	System.out.println("j1 > j2");
	    } else {
	    	System.out.println("j1 < j2");
	    }
	}

	@Override
	public String toString() {
		return "I'm a hamburger";
	}
	
}















