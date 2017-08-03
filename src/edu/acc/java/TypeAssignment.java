package edu.acc.java;

/**
 * Write a class call TypeAssignment that creates all of the 
 * primitive types and tries to assign them to all the other primitives. 
 * 
 * Print all the successful assignments. Is there a pattern?
 * 
 * @author pi
 */

public class TypeAssignment {
	
	static byte b = 1;
	static char c = '2';
	static short s = 3;
	static int i = 4;
	static long l = 555L;
	static float f = 6f;
	static double d = 7.;
	static boolean o = true;
	
	public static void main(String[] args) {
        
		// doesn't work: b = c: b = s; b = i; b = l; b = f; b = d; b = o;
        System.out.println("byte -> byte"); 
        
		// doesn't work: c = b: c = s; c = i; c = l; c = f; c = d; c = o;
        System.out.println("char -> char"); 
		
		s = b; // doesn't work: s = c; s = i; s = l; s = f; s = d; s = o;
        System.out.println("byte -> short"); 
        
        i = b; i = s; i = c; // doesn't work: i = l; i = f; i = d; i = o;
        System.out.println("byte -> int"); 
        System.out.println("char -> int"); 
        System.out.println("short -> int"); 
        
        l = b; l = c; l = s; l = i; // doesn't work: l = f; l = d; l = o; 
        System.out.println("byte -> long"); 
        System.out.println("char -> long"); 
        System.out.println("short -> long"); 
        System.out.println("int -> long"); 

        f = b; f = c; f = s; f = i; f = l; // doesn't work: f = d; f = o;
        System.out.println("byte -> float"); 
        System.out.println("char -> float"); 
        System.out.println("short -> float"); 
        System.out.println("int -> float"); 
        System.out.println("long -> float"); 
        
        d = b; d = c; d = s; d = i; d = l; d = f; // doesn't work: d = o;
        System.out.println("byte -> double"); 
        System.out.println("char -> double"); 
        System.out.println("short -> double"); 
        System.out.println("int -> double"); 
        System.out.println("long -> double"); 
        System.out.println("float -> double"); 

		// doesn't work: o = c: o = s; o = i; o = l; o = f; o = d; o = b;
        System.out.println("boolean -> boolean"); 

	}
	
	

}
