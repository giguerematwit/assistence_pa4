package edu.wit.cs.comp1050;

//TODO: document this class
public class Rectangle extends Shape2D {
	private Point2D p1;
	private Point2D p2;
	/**
	 * Constructs a rectangle given two points
	 * 
	 * @param color rectangle color
	 * @param p1 point 1
	 * @param p2 point 2
	 */
	public Rectangle(String color, Point2D p1, Point2D p2) {
		
		super(color, "Rectangle"); // replace with your code
		
		this.p1 = p1;
		this.p2 = p2;

	}
	
	/**
	 * Returns true if provided
	 * another rectangle whose 
	 * lower-left and upper-right
	 * points are equal to this
	 * rectangle
	 * 
	 * @param o another object
	 * @return true if the same rectangle
	 */
	@Override
	public boolean equals(Object o) {
		
		Point2D lowerLeft = getLowerLeft();
		Point2D upperRight = getUpperRight();

		
		if ( lowerLeft.equals(o) && upperRight.equals(o)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the lower-left corner
	 * 
	 * @return lower-left corner
	 */
	public Point2D getLowerLeft() {
		
		Point2D lowerLeft = new Point2D(p1.getX(),p1.getY());

		return lowerLeft; // replace with your code
	}
	
	/**
	 * Gets the upper-right corner
	 * 
	 * @return upper-right corner
	 */
	public Point2D getUpperRight() {
		
		Point2D upperRight = new Point2D(p2.getX(),p2.getY());

		return upperRight; // replace with your code
	}

	@Override
	public double getArea() {
		double base = p2.getX() - p1.getX();
		double height = p2.getY() - p1.getY();
		//a = b*h
		return (base * height); // replace with your code
	}

	@Override
	public double getPerimeter() {
		double base = (p2.getX() - p1.getX());
		double height = (p2.getY() - p1.getY());
		//p = 2b+2h
		return base + base + height + height; // replace with your code
	}

	@Override
	public Point2D getCenter() {
		 double xCenter = ( p1.getX() + p2.getX() ) / 2 ;
		 double yCenter = ( p1.getY() + p2.getY() ) / 2;
		 
		 Point2D center = new Point2D(xCenter,yCenter);
          
		return center; // replace with your code
	}

	@Override
	public Point2D[] getVertices() {

		Point2D obj[] = new Point2D[4];
		
		
		//door frame
		//correct
		Point2D verticie1 = new Point2D(p1.getX(),p1.getY());
		//correct
		Point2D verticie2 = new Point2D(p1.getX(),p2.getY());
		//correct
		Point2D verticie3 = new Point2D(p2.getX(),p2.getY());
		
		//incorret //1.000)
		Point2D verticie4 = new Point2D(p2.getX(),p2.getY());
		
		//putting my refrence into object array0
		//point1
		obj[0] = verticie1;
		//point 2
		obj[1] = verticie2;
		//third
		obj[2] = verticie3;
		//fourth
		obj[3] = verticie4;
		
		
		return obj;
	}

}
