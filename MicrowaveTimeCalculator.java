/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * This program calculates the time required to microwave various types of snacks
 *  with a given type and number
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;
import java.util.HashMap;

//****************************************************************************
public class MicrowaveTimeCalculator {

    public class StringBlowup {
	    
	    //-----------------------------------------    
	    public static void main(String[] args) {
	    	//String Blowup
	    	
	    	//set up a scanner to get the response from the user
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	//set variables to a default	
	    	String input = null, outputString = "";
	    	
	       	//----------------------------------------------------------------
	        //while appropriate response has not been collected
	       //use while-true functions to break out of
	    	while (true) {
	    		//keep asking for input
	    		System.out.println("Input a string: ");
			
	    		//Get input as a string value-----
	    		input = scanner.nextLine();
	    		
	    		//have to check if actual input has been put since 
	    		//can't compare nil to string or number.
	    	    if (input.length() != 0){
	    	    	//send each letter to string blowup
	    	    	
	    	    	// for integer x from a ~ less than b, and increasing the value by 1 each time
	    	    	//***java counts strings from 0 !!!*******
	    	    	for ( int character=0; character<input.length(); character++ ) {
	    	    		//Character.toString(char)
	    	    		//need to convert char to string
	    	             String currentChar = String.valueOf(input.charAt(character));
	    	             //if character is a number
	    	             try {
	    	     	    	Integer characterNumber = Integer.parseInt(currentChar);//Convert string to integer
	    	            	 //Check if it's the last value
	    	            	 if (character == input.length()-1) {
	    	            		 //if number is at the last place, skip it since no characters are on the right of it
	    	            	 }else {
	    	            		 //if number is not at the last place
	    	            		 String charAfter = String.valueOf(input.charAt(character+1));
	    	            		 //add that many of the following characters to string
    	            			 for ( int number=0; number<characterNumber; number++ ) { 
    	            				 outputString = outputString + charAfter;
    	            			 }
	    	            	 }
	    	             } catch (NumberFormatException stringInput) {
	    	            	 //if not a number
	    	            	 outputString = outputString + currentChar;
	    	             }
	    	    	}

	    	             System.out.println("The blown-up string is :" + outputString);
	    	             break;
	    	    }else{
	    	    	//if entered in nothing
	    	    	System.out.println("ERROR: no string found. Try again");
	    	    }
	    	}//closing for while
	    	
		    		
	    			
	    
	    }//closing for main
	}//closing for public class StringBlowup
