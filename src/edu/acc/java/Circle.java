package edu.acc.java;


public class Circle implements ShapeOps, ShapeBase {

	 private float radius;  // my radius
	 
	 public Circle() {
		 // default constructor override
		 radius = random_z().getZ(); // use RandZ for radius
		 System.out.println("Set random radius to " + radius);
	 }
	 
	 public Circle(float r) {
		 // the real constructor must have a radius
		 radius = r;
		 System.out.println("Set radius to " + radius);
	 }

	/* (non-Javadoc)
	 * @see com.acc.java.ShapeBase#type()
	 */
	@Override
	public SHAPE type() {
		// what type am I?
		return SHAPE.CIRCLE;
	}

	/* (non-Javadoc)
	 * @see com.acc.java.ShapeOps#area()
	 */
	@Override
	public float area() {
		return PI * this.radius * this.radius;  // area of circle
	}

	@Override
	public RandZ random_z() {
		return new RandZ().random_z();
	}

	/* (non-Javadoc)
	 * @see com.acc.java.ShapeOps#circumference()
	 */
	@Override
	public float circumference() {
		return PI * 2 * this.radius;  // circumference of circle
	}

	/* (non-Javadoc)
	 * @see com.acc.java.ShapeOps#random_z()
	 */

	public static void main(String[] args) {
		// test Circle class
		Circle c = new Circle();  // default constructor test
		c = new Circle(8);  // now set with a radius
		//SHAPE my_type = c.type();  // could do this...
	    System.out.println("Radius is: " + c.radius);
	    System.out.println("Type is: " + c.type());
	    System.out.println("Area is: " + c.area());
	    System.out.println("Circumference is: " + c.circumference());

	}

}
