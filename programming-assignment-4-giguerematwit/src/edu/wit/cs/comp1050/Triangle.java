package edu.wit.cs.comp1050;

//TODO: document this class
public class Triangle extends Shape2D {

	private Point2D p1;
	private Point2D p2;
	private Point2D p3;
	/**
	 * Constructs a triangle given
	 * three points
	 * 
	 * @param color color
	 * @param p1 point 1
	 * @param p2 point 2
	 * @param p3 point 3
	 */
	public Triangle(String color, Point2D p1, Point2D p2, Point2D p3) {
		super(color, ""); // replace with your code
		
		color = getColor();

		p1 = this.p1;
		p2 = this.p2;
		p3 = this.p3;
		
		
		
	}
	
	/**
	 * Returns the axis-aligned
	 * bounding box for this
	 * triangle
	 * 
	 * @return axis-aligned bounding box
	 */
	public Rectangle getAxisAlignedBoundingBox() {
	//	this(p1.x, p1.y, p2.x, p2.y);
		return null;
		
	}

	@Override
	public double getArea() {
		//p2 and p1 base points 
		double base = p2.getX() - p1.getX();
		
		//p3 top point ? // y value doesn't matter for p1 or p2
		double height = p3.getY() - p1.getY();
		
		double area = ( 0.5 * (base * height) );
		
		return area; // replace with your code
	}

	@Override
	public double getPerimeter() {
		//need to add hypotenuse's of left side and right side then add base 
		
				// LEFT SIDE OF TRIANGLE p3x - p1x gives base; p3y - p1y gives hight;
				double hypotenusA = Math.sqrt( (p3.getX() - p1.getX() ) + ( p1.getY() - p1.getY() ));
				
				//BASE
				double base = (p3.getX() - p1.getX());
				
				//RIGHT SIDE OF TRIANGLE p2x - p3x gives base; p3y - p1y give sheight 
				double hypotenusC = Math.sqrt( (p2.getX() - p3.getX() ) + ( p3.getY() - p3.getY() ));
		 
				//ans
				double perimeter = hypotenusA + base + hypotenusC;
			
				
				return perimeter; 
	}

	@Override
	public Point2D getCenter() {
		// a+b+c / 3
				double Ox = ( p3.getX() + p2.getX() + p1.getX() ) /3 ;
				double Oy = ( p3.getY() + p2.getY() + p1.getY() ) /3 ;
				
				Point2D center = new Point2D(Ox,Oy);
				
				return center; // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
		Point2D obj[] = new Point2D[3];
		
		
		
		//refrences 
		/*
		Point2D verticie1 = new Point2D(p1.getX(),p1.getY());
		Point2D verticie2 = new Point2D(p2.getX(),p2.getY());
		Point2D verticie3 = new Point2D(p3.getX(),p3.getY());
		*/
		
		Point2D verticie2 = new Point2D(p1.getX(),p3.getY());
		Point2D verticie1 = new Point2D(p2.getX(),p1.getY());
		Point2D verticie3 = new Point2D(p3.getX(),p3.getY());
		
		//White Rectangle @ ((0.000, 9.000), (0.000, 0.000), (12.000, 0.000), (12.000, 9.000)): center=(6.000, 4.500), perimeter=6.000, area=-108.000

		
		//putting my refrence into object array
		//point1
		obj[0] = verticie1;
		//point 2
		obj[1] = verticie2;
		//point 3
		obj[2] = verticie3;

		
		return obj; // replace with your code
	}

}
