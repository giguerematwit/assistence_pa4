package edu.wit.cs.comp1050;

//TODO: document this class
public class TriangleObject extends GeometricObject {
   
   //Create variables: side1 side2, side3
	private double side1;
	private double side2;
	private double side3;
	private String color;

   /**
    * Constructs a triangle given three sides
    * 
    * @param side1 length of side1
    * @param side2 length of side2
    * @param side3 length of side3
    */   
   public TriangleObject(double side1, double side2, double side3) {
  //set the sides to given values, only if they are greater than 0. 
	  this.side1 = side1;
	  this.side2 = side2;
	  this.side3 = side3;
   }
   
   /**
    * Constructs a triangle
    */
   public TriangleObject() {
	   String color = getColor();
        //set the color and filled value to default
   }

   /** If given a valid length, set the value for side
    * 
    * @param side1
    */
     public void setSide1(double side1) {
   	  this.side1 = side1;
    	
    	 //public Point2D[] getVertices() {

      }

     /** If given a valid length, set the value for side
      * 
      * @param side2
      */
     public void setSide2(double side2) {
   	  this.side2 = side2;
      }
   
     /** If given a valid length, set the value for side
      * 
      * @param side3
      */
     public void setSide3(double side3) {
    	  this.side3 = side3;
      }

      
   public double getSide1() {
      return side1;
   }

   public double getSide2() {
      return side2;
   }

   public double getSide3() {
      return side3;
   }

   @Override 
   // Override method findArea in GeometricObject 
   public double getArea() {
	   
	   //herons formula
	   //add links up and divide by 2
	   
	   double s = ( (side1+side2+side3) / 2 ) ;
   
	   double area  = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	   
	   return area; // replace with your code
	}

   

   @Override 
   // Override method findPerimeter in GeometricObject
   public double getPerimeter() {
      return side1+side2+side3;

   }

   //Add another method here. 
}
   
   
