package edu.wit.cs.comp1050;

import java.util.ArrayList;
import java.util.Scanner;

//TODO: document this class
public class PA4c {
	
	
	/**
	 * Removes all duplicate values
	 * from the supplied list
	 * 
	 * @param list list from which to remove repeated elements
	 */
	public static void removeRepeated(ArrayList<Integer> list) {
	
			   ArrayList<Integer> distinctList = new ArrayList<>();
			   
			   //going through numbers in list
			   for(Integer i:list){
				   
			       boolean found = false;
			       
			       //checking if values in list or similar to our distanct list non duplicates
			       for(Integer j:distinctList){
			    	   
			    	   //if equivilant is found == true
			           if (i.intValue() == j.intValue()){
			               found = true;
			           }  
			       }
			       
			       //if not found put intop distinct list
			       if(!found){
			           distinctList.add(i);
			       }
			   }
			   
			   list.removeAll(list);
			   list.addAll(distinctList);
			}
	

	/**
	 * Reads numbers from the keyboard and
	 * outputs the list of distinct values
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		
		  ArrayList<Integer> list = new ArrayList<>();

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter integers: ");
		     
		         try{

		         String str = sc.nextLine();
		         String[] strArray= str.split(" ");
		         
		         	if (strArray.length == 0) {
		         		System.out.println("No values entered.");
		         	}

		         	for(String st:strArray){
		         		list.add(Integer.parseInt(st));
		         	}
		         }

		         catch(Exception e){
		         }

		     if (list.isEmpty()){
		         System.out.println("No values entered.");
		     }

		     else{
		         removeRepeated(list);
		         System.out.print("The distinct integer(s): ");
		         for(Integer i:list){
		        	 //"\n"
		             System.out.println(i + " ");
		             }
		     }
		     sc.close();

		  }
		  }



