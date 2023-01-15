import java.util.Scanner;

public class Lesson03{
	
	public  void Exercise1() {

		/*
		 * Exercise 1 - Change the variables in the first section, so that each if statement resolves as true.
		 *
			String a = new String("Wow");
        	String b = "Wow";
        	String c = a;
        	String d = c;

        	boolean b1 = a == b;
        	boolean b2 = d.equals(b + "!");
        	boolean b3 = !c.equals(a);

        	if (b1 && b2 && b3) {
            	System.out.println("Success!");
        	}
		 */
		//Removed the Object and made a to variable
		String a = "Wow";
		//b is the same as is was in the begning and now equals a
    	String b = a;
    	//in order so c wont be equal to a we made c equals "Wow!"
    	String c = b + "!";
    	//In order for d to be equal to b+ "!" we need to keep d = c
    	String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }	
	}
	public  void ageInFiveYears() {
    	/*
    	 * 1. Ask the user for their name. 
    	 * 2. Then display their name to prove that you can recall it. 
    	 * 3. Ask them for their age. 
    	 * 4. Then display what their age would be five years from now. 
    	 * 5. Then display what their age would be five years ago.
    	 */
		
		//We need to use Scanner Object for this Excerise - 
		//we imported the scanner library in the top of the page
		
		//Step 1 Creating a new Scanner object to get input from the user
		Scanner input = new Scanner(System.in);
		//Print a message to the screen to the user to recieve his inputs
		System.out.println("Hi please type in your name followed by enter: ");
		//we creating a variable name to receive the input using the scanner object
		String name  = input.nextLine();
		//Step 2 - Display the name we receievd as an input
		System.out.println("Hi " + name);
		//Step 3 - asking for the user age
		System.out.println("Please type in your age followed by enter: ");
		int age = input.nextInt();
		//now we finished receive data we will close the scanner
		input.close();
		//Step 4 - displaying the user age 5 years from now
		System.out.println("Your age in 5 years will be: " + (age+5));
		//Step 5 - display the user age 5 years ago
		System.out.println("Your age 5 years ago was: " + (age-5));		
    }

	public void HowOldAreYou(){
		//creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hey, what's your name? ");

		//creating a new String called name and inserting the scaner method into it.
		String name = keyboard.next();
		System.out.println();

		//moving to the next question
		System.out.print("Ok, "+name+", how old are you? ");

		// creating an int and inserting the scanner method into it.
		int age = keyboard.nextInt();
		System.out.println();

		// A loop to make sure user's input is valid (age can not be smaller than 0 or bigger than 120)
		while(age<0 || age > 120){
			System.out.print("WRONG! "+name+", how old are you? ");
			age = keyboard.nextInt();
			System.out.println();
		}

		// tell the user what they can do according to their age

		//scenario when an age is smaller than 16
		if(age<16){
			System.out.println("You can't drive, "+name+".");

			//scenario when an age is smaller than 18
		}if(age<18){
			System.out.println("You can't vote, "+name+".");

			//scenario when an age is smaller than 25
		}if(age<25){
			System.out.println("You can't rent a car, "+name+".");

			//scenario when an age is equal or bigger than 25
		}if(age>=25){
			System.out.println("You can do anything that's legal, "+name+".");
		}
	}

}
