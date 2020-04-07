package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4a {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: <encrypted string> <substring>";
	
	/**
	 * Error if shift could not be found
	 */
	public static final String ERR_NONE = "No valid shifts found.";

	/**
	 * Outputs all shifts of the encrypted string
	 * that contain the supplied substring
	 * 
	 * @param args command-line arguments: <encrypted string> <substring>
	 */
	public static void main(String[] args) {
		//we need 2 inputs for a the chepher to make sense
				if (args.length != 2) {
					System.out.println(ERR_USAGE);
					return;
				
				}
				
				//creating obj to check 
				//length of alphabet
				int result[] = new int[26];
				Shifter shifterObject = new Shifter(args[0]);
				result = shifterObject.findShift(args[1]);
				
				
				// doesn't matter which u check first
				
				//if the first arg is nothing
				if (result[0] == -1) {
					System.out.println(ERR_NONE);
					System.exit(0);
				}
				
				//check whole array
				for (int i = 0; i < 26; i++) {
					if (result[i] == -1) {
						System.out.println(result[i]);
						break;
					}
					
					
				// replace with your code
		// replace with your code
				}

	}	
}
