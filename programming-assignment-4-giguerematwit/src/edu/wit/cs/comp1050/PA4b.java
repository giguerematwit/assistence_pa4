package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4b {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: color x1 y1 x2 y2 x3 y3";
	
	/**
	 * Number of command-line arguments
	 */
	public static final int NUM_ARGS = 7;
	
	/**
	 * Produces a string representing
	 * all vertex information in CSV
	 * format:
	 * "color",x,y
	 * 
	 * For all shape vertices,
	 * including axis-aligned bounding
	 * boxes for any included triangles
	 * 
	 * @param shapes array of shapes
	 * @return string of CSV information
	 */ 
	public static String shapeVertices(Shape2D[] shapes) {
		
		StringBuilder csv = new StringBuilder(); 
		//"Red Rectangle @ ((0.000, 0.000), (0.000, 1.000), (1.000, 1.000), (1.000, 0.000)): center=(0.000, 0.000), perimeter=4.000, area=1.000"	

		String info = shapes.toString();
		info.replaceAll("(", "");
		//removed ( //"Red Rectangle @ 0.000, 0.000), 0.000, 1.000), 1.000, 1.000), 1.000, 0.000)): center=0.000, 0.000), perimeter=4.000, area=1.000"
		info.replaceAll(")", "");
		//removed ) //"Red Rectangle @ 0.000, 0.000, 0.000, 1.000, 1.000, 1.000, 1.000, 0.000: center=0.000, 0.000, perimeter=4.000, area=1.000"
		info.replace("@", ",");
		//changed @ to , //"Red Rectangle , 0.000, 0.000, 0.000, 1.000, 1.000, 1.000, 1.000, 0.000: center=0.000, 0.000, perimeter=4.000, area=1.000"
		csv = new StringBuilder(info); 
		
		int tempIndex1 = csv.indexOf(" "); 
		int tempIndex2 = csv.indexOf(","); 
		
		csv.delete(tempIndex1, tempIndex2 - 1 );
		//deletes word between first space and first comma //-1 to go before the comma
		//"Red,0.000,0.000,0.000,1.000,1.000,1.000,1.000,0.000:center=0.000,0.000,perimeter=4.000,area=1.000"
		
		info = csv.toString();
		
		info.replaceAll(" ", "");
		//"Red,0.000,0.000,0.000,1.000,1.000,1.000,1.000,0.000:center=0.000,0.000,perimeter=4.000,area=1.000"
		
		csv = new StringBuilder(info); 
		
		tempIndex1 = csv.indexOf(":"); 
		tempIndex2 = csv.length(); 
		
		csv.delete(tempIndex1, tempIndex2);
		//"Red,0.000,0.000,0.000,1.000,1.000,1.000,1.000,0.000"
		
		info = csv.toString();

		return info;
	
	}

	/**
	 * Outputs vertex information in CSV
	 * format about the triangle supplied
	 * via command-line arguments, including
	 * its axis-aligned bounding box
	 * 
	 * @param args command-line arguments: color x1 y1 x2 y2 x3 y3
	 */
	public static void main(String[] args) {
		// replace with your code
		
		
		if( args.length != NUM_ARGS) {
			System.out.print(ERR_USAGE);
		}
		
		else {
		String[] shapes = args;
		
		String csv = shapeVertices(null);
		
		System.out.print(csv);
	
		
		}
	}

}
