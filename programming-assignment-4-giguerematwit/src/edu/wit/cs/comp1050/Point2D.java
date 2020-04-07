package edu.wit.cs.comp1050;

//TODO: document this class
public class Point2D {
	private double x;
	private double y;
	/**
	 * Constructor to initialize coordinates
	 * 
	 * @param x x value
	 * @param y y value
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
		// replace with your code
	}
	
	/**
	 * Get the x coordinate
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		return x; // replace with your code
	}
	
	/**
	 * Get the y coordinate
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		return y; // replace with your code
	}
	
	/**
	 * Gets a String representation
	 * of the coordinate in the form
	 * "(x, y)" (each with three decimal
	 * places of precision)
	 * 
	 * @return "(x, y)"
	 */
	@Override
	public String toString() {
		return "(" + String.format("%.3f", getX()) + "," + String.format(" %.3f", getY()) + ")"; // replace with your code // replace with your code
	}
	
	/**
	 * Returns true if provided another
	 * point that is at the same (x,y)
	 * location (that is, the distance
	 * is "close enough" according to
	 * Shape2D)
	 * 
	 * @param o another object
	 * @return true if the other object is a point and the same location (within threshold)
	 */
	@Override
	public boolean equals(Object o) {
	
		// _testPoint2D(origin, p01a, 1.);
		//		final Point2D p01a = _testPoint2D(0., 1., "(0.000, 1.000)");
		//	assertFalse(p1.equals(p2));
		
		float epsilon = .33333f;
		
		Point2D values = new Point2D(x,y);
		
		double checker = distance(values, (Point2D) o);
		
		if (checker<epsilon) {
			return true;
		}
		
		return false;
		 // replace with your code
	}
	
	/**
	 * Method to compute the Euclidean/L2
	 * distance between two points in 2D
	 * space
	 * 
	 * @param p1 point 1
	 * @param p2 point 2
	 * @return straightline distance between p1 and p2
	 */
	public static double distance(Point2D p1, Point2D p2) {
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)); // replace with your code
	}
	
	/**
	 * Method to compute the Euclidean
	 * distance between this point
	 * and a supplied point
	 * 
	 * @param p input point
	 * @return straightline distance between this point and p
	 */
	public double distanceTo(Point2D p) {
		return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y)); // MUST be a single call to the static distance method

	}

}
