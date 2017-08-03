package edu.acc.java;

/**
 * Rectangle class
 * 
 * - Create a Rectangle class with instance variables (attributes, state) for
 * the length and width, both floating point numbers.
 * 
 * - The class should have at least two constructors. The default constructor,
 * Rectangle(), should initialize the instance variables to 1.0.
 * 
 * - The class should have methods that return the perimeter and the area of the
 * shape.
 * 
 * - Create an main() that instantiates at least as many objects as constructors
 * in Rectangle i.e. uses all the constructors, and exercises all methods of
 * Rectangle.
 * 
 * @author pi
 *
 */

public class Rectangle {

	// instance variables 
	
	float length;
	float width;

	// constructors

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float new_length, float new_width) {
		// save the length and width in class for use by methods
			length = new_length;
			width = new_width;
	}

	public Rectangle(float side) {
		// save the side as both length and width
			length = side;
			width = side;
	}

	// instance methods 
	
	float area() {
		return length * width;
	}

	float perimeter() {
		return length * 2 + width * 2;
	}

	void printSides() {
		System.out.println("Length: " + length + " Width: " + width);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // default constructor
		System.out.println("No arg constructor makes [1,1] Rectangle");
		rect.printSides();
		System.out.println("[Area] " + rect.area());
		System.out.println("[Perimeter] " + rect.perimeter());
		System.out.println();

		rect = new Rectangle(2, 3); // length and width constructor
		System.out.println("Length, width constructor makes [2,3] Rectangle");
		rect.printSides();
		System.out.println("Using getters, Length: " 
		+ rect.length 
				+ " Width: "
		   + rect.width);
		System.out.println("[Area] " + rect.area());
		System.out.println("[Perimeter] " + rect.perimeter());
		System.out.println();

		System.out.println("Single side constructor makes [3,3] Rectangle");
		rect = new Rectangle(3); // one side constructor
		rect.printSides();
		System.out.println("[Area] " + rect.area());
		System.out.println("[Perimeter] " + rect.perimeter());
	}

}
