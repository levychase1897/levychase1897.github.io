package edu.acc.java;

/**
 * try/catch/finally Lab
 *
 * 1) In a class called Xception add a try block in main() that invokes instance methods void x() and void y().
 * 2) Add a catch block to handle a custom exception MyX that is a subclass of Exception, and prints a message that
 *    it's in the catch block.
 * 3) Add a catch block to handle another customer exception that is a subclass of RuntimeException, prints a
 *    message that it's in the catch block, then thows a java.io.IOError. Catch the IOError within the catch block
 *    as a Throwable and print a message that you caught it. Also print a stack trace
 * 4) Add a finally block that prints a message "Finally here"
 * 5) x() will print a message that it's in x() then throw a MyX exception
 * 5) y() will print a message that it's there then throw a MyY exception 
 * 6) Test your code. How can you run both x() and y()? What happens when you try to use x() outside of the try block?
 *
 * @author pi
 *
 */
public class Xception {

	public static void main(String[] args) {
		Xception me = new Xception();

		try {
			me.x();
			me.y();

		} catch (MyX ex) {
			System.out.println("MyX caught");

		} catch (MyY ex) {
			System.out.println("MyY caught");
			try {
				throw new java.io.IOError(new Error("new error"));
			} catch (Throwable ex1) {
				System.out.println("Caught IOError -- stack trace follows");
				ex1.printStackTrace();
			}

		} finally {
			System.out.println("Finally here");
		}
		// me.x();

	}

	void x() throws MyX {
		System.out.println("In x()");
		throw new MyX("hi, I'm from x()");
	}

	void y() {
		System.out.println("In y()");
		throw new MyY("hi, I'm from y()");
	}

}
