package edu.acc.java;

/**
 * Used for in class demo 
 * @author pi
 *
 */

public class Trees {

	public static void main(String[] args) {
		int j =25;
		int k = 7;
		System.out.println(j+=k);
		boolean b = ++j/5*3%2>2 || 2*4/3<1;
		System.out.println(b);
		System.out.println(j);
		
		do {
    		System.out.println(j + " " + k);
		    j--;	
		    if (j == 17) {
		    	break;
		    }
		}
		while (true) ;

		String[] trees = new String[5];
		trees[0] = "pecan";
		trees[1] = "pine";
		trees[2] = "banyan";
		trees[3] = "cypress";
		trees[4] = "apple";
		
    	System.out.println("print tress array with conventional for loop");
		for (int i = 0; i < trees.length; i++) {
			System.out.println("next tree is " + trees[i]);
		}
		
    	System.out.println("print tress array with enhanced for loop");
		for (String tree : trees) {
			System.out.println("next tree is " + tree);
		}
		
		
		
	}

}
