package edu.wit.cs.comp1050;

//TODO: document this class
public class Shifter {
	
	
	private String string;
	
	/**
	 * Number of letters in the English alphabet
	 */
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	
	/**
	 * Initializes the shifter
	 * 
	 * @param s encrypted string
	 */
	public Shifter(String s) {
		this.string = s;
		// replace with your code
	}
	
	/**
	 * Returns the result of shifting
	 * by a supplied amount
	 * 
	 * @param n number of places to shift 
	 * @return shifted string
	 */
	public String shift(int n) {
		
		 // n is the supplied amount of shift
		
		StringBuffer result = new StringBuffer(); 
		
		for (int i = 0; i<string.length(); i++) {
			//checking each character in lower case or captial
			if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') || 
					(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')) {
				
			      if (string.charAt(i) == 'z')

			    	  string = string.substring(0, i) + 'a' + string.substring(i + n);
				
			      else if (string.charAt(i) == 'Z')

			    	  string = string.substring(0, i) + 'A' + string.substring(i + n);

	               else

	            	   string = string.substring(0, i) + (char) (string.charAt(i) + n) + string.substring(i + n);
			}

		}
		return string;
	}
	
		
		/*
		StringBuffer result= new StringBuffer(); 
		
		//substring views the characters in a string as characters wowzers !
				//goes through the string varible
				for (int i = 0; i<string.length(); i++) {
					//checking each character in lower case or captial							>=
					if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') || (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')) {
						//lower case first
						if (string.charAt(i) >= 'z') {
							string = string.substring(0,i) + 'a' + string.substring(i+1);
						}
						//capital 
						else if (string.charAt(i) == 'Z') {
							string = string.substring(0,i) + 'A' + string.substring(i+1);
						}
						//shift the characters using the substring
						else {
							//have to cast char or else you'd be trying to add the strings together instead of the individual characters that build the string 
							string = string.substring(0,i) + (char)(string.charAt(i) + 1) + string.substring(i+1);
						}
						
						}
					}
				*/
		 
		/* 
		
		StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<string.length(); i++) 
        { 
            if (Character.isUpperCase(string.charAt(i))) 
            { 
                char ch = (char)(((int)string.charAt(i) + n - 65) % 26 + 65); 
                result.append(ch); 
                
            	
                _testShift("", 
            			new int[] {-2, -1, 0, 1, 2, 10, 25, 26, 27, 100}, 
            			new String[] {"", "", "", "", "", "", "", "", "", ""}
            		);
            		
            		_testShift(" ", 
            			new int[] {-2, -1, 0, 1, 2, 10, 25, 26, 27, 100}, 
            			new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
            			
            		); 
            } 
            else
            { 
                char ch = (char)(((int)string.charAt(i) + n - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        
        String ans = result.toString();
        return ans; 
        
        */
    

	/**
	 * Finds all shifts that contain
	 * the supplied substring
	 * 
	 * @param sub substring to find
	 * @return array of shifts (0-25) that contain the substring (in order)
	 */
	public int[] findShift(String sub) {
		int shift_result[] = new int[NUM_LETTERS];
		
		int j = 0;
		
		for ( int i = 0 ; i<NUM_LETTERS; i++) {
			
			string = shift(NUM_LETTERS);
					
			if (string.indexOf(sub) != -1){
				shift_result[j] = i+1;
				j++;
				
			}
		}
		
		shift_result[j] = -1;
	//check for -1 in main
		return shift_result; // replace with your code

	}
}
