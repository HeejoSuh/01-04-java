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
public class MicrowaveCalculator {

    public static void main(String[] args) {
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set mass to a random default
    	//float = decimal with less places
        float massInput= 0;
        
        
        
        //set food and count to a default
        string inputFood = "" 
        int foodCount = 0
        
        
        
        // create a new hashtable
        Dictionary foods = new Hashtable();
        //insert into dictionary
        foods.put("sub", 1*60);
        foods.put("pizza", 45);
        foods.put("soup", 1.75*60);
        
        //Snack counts
        snackCounts= [1,2,3]
        
        		
        int [] snackCounts = [1,2,3]
        		
        //if correct snack type input
        //if(Arrays.asList(snackCounts).contains(inputFood)){
        if(Arrays.contains(inputFood)){

        }
        		
        		
        // return an enumeration of the keys from this dictionary.
        for (Enumeration e = foods.keys(); e.hasMoreElements();) {
           System.out.println(e.nextElement());
        }
        
        
        
       ////////////////////////////////////////////////////////////////////////////// max 3
        	
        //while appropriate response has not been collected
    	while (massInput!= 0) {
    		
    		//ask for input snack
    		System.out.print("What are you trying to microwave? sub, pizza, or soup? : ");

    		//ask for number of snack
    		System.out.print("How many" + inputFood + "s are you trying to microwave? (Maximum Count: 3): ");
    		
    		
    		float snackCount
    		//calculate microwave time
    		//2->increase the time by 50%, 3-> increase it by 100% ... so:
    		float microwaveTime = (snackCount+1)*0.5
    		
    	
    		//set new mass
    		float input = scanner.nextFloat();
    		
    		
    			//if appropriate response has been collected
    			if ( put in correct snack type){

    				//allow input
    				massInput= input
    				//define constants
    				int c= 2.998*108 // m/s
    				//calculate
    				//E= mc^2
    				float energyCanCreate = massInput * Math.pow(c, 2);
    				
    				
    				System.out.println("You need to microwave your " + snackCount + " " + inputFood + "s for " + microwaveTime + " seconds.");
    			
    			//else if wrong input
    			}else {
    				System.out.println("                  ERROR:\nInvalid input.TRY AGAIN. \n\n");
    				
    			}//closing for if
    			
    	}//closing for while
    }//closing for public static void main
}//closing for public class MicrowaveCalculator
