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

    public static void main(String[] args) {
    	//Get time required to microwave different types and numbers of snacks
    	
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set variables to a random default
    	
    	String snackType = null;
    	// *****time needs to be integers for the 'rounding up' to work
    	int snackCount=0, microwaveTime=0, individualTime=0;

        //no input yet
        String input = null;
        
        
       //create a dictionary to refer to
       /* declare HashMap */
       HashMap<String, Integer> snackInfo = new HashMap<String, Integer>();

       /*Add elements to HashMap*/
       //snack type, time(seconds) to microwave it for.
       snackInfo.put("sub", 60);//1min*60sec = 60sec
       snackInfo.put("pizza", 45);
       snackInfo.put("soup", 105); //1.75min*60sec = 105sec
  
        
       	//----------------------------------------------------------------
        //while appropriate response has not been collected
       //use while-true functions to break out of
    	askSnack: while (true) {
    		//keep asking for input
    		System.out.println("What snack? Pizza, Sub, or Soup?: ");
		
    		//Get input as a string value-----
    		input = scanner.nextLine();
    		//put to lowercase so more options for input
    		input= input.toLowerCase();
    		
    		
    		
    		//check if available snack---------
    		if (snackInfo.containsKey(input)){
    			snackType = input; // then set as type of snack selected
    			individualTime= snackInfo.get(snackType);
    			while(true) {
    				//Ask for number of snacks
        			System.out.println("How many do you wish to microwave?: ");
        			//Get new input as a string value--------
        		    input = scanner.nextLine();
            		try {
            			//check if response if a number
            			snackCount = Integer.parseInt(input);//Convert string to double
            			//여기 안에다 할거 넣으면 operate 됨.
        			
            			//if count is less or equal to 3
            			if (snackCount==1 || snackCount==2 || snackCount==3 ){
            				//calculate
                			microwaveTime= (individualTime/2)*(snackCount+1);
                			
                		    //get time in minutes (no need to round since it juststores integer value)
                		    int min = microwaveTime/60;
                		    		
                		    //get time in seconds (remainder)
                		    int sec = microwaveTime % 60;
                		    
                			System.out.println("Microwave your " + snackCount + " " + snackType + "(s) for "+ min + " minutes "+ sec + " seconds");
                			break askSnack;//need break to get out of the two while loops and not repeat question
            			}else {
            				System.out.println("You can't put more than 3 snacks in: try again");
            			}
            			
            		} catch (NumberFormatException stringInput) {
            			//if not number then
            			System.out.println("ERROR:\nPut in a numeric value. TRY AGAIN. \n\n");
            		}
    			}
    		}else{
    		//Not in the dictionary
    			System.out.println("ERROR: Try again with Pizza, Sub, or Soup. \n\n");
    		}
    		
		
    	}//closing for while
    
    }//closing for public main
}//closing for public class MicrowaveTimeCalculator
