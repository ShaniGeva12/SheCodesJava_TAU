import java.util.Random;
import java.util.Scanner;

public class Lesson06 {

    //-----------------------String------------------------------

    //Question 1
    public String getBiggerString(String str1, String str2)
    {
        if(str1.length() > str2.length()) //we don't need to loop inside the strings.
            return str1;                 //we can just write stringName.length() and get the length of that string!

        if(str2.length() > str1.length()) //no need to write else here, cause if the condition is true -
            return str2;              //the return will end this function and these lines will never run

        return str1; //if both are the same length - doesn't matter what we send back :)
    }


    //Question 2
    public String combineTwoStrings(String str1, String str2)
    {
        String answer;
        answer = str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2,str1.length());

        return answer;
    }

    //-----------------------Scanner------------------------------
    //Question 3
    public void interactWithUser()
    { //From site: http://www.programmingbydoing.com/a/age-in-five-years.html

        //creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");

        //creating a new String called name and inserting the scanner method into it.
        String name = keyboard.next();
        System.out.println();

        //moving to the next question
        System.out.print("Hi, " + name + "!  How old are you? ");

        // creating an int and inserting the scanner method into it.
        int age = keyboard.nextInt();
        System.out.println();

        //telling user how old they'll be in 5 years
        System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
        System.out.println("And five years ago you were " + (age-5) + " ! Imagine that!");
        System.out.println();
    }
    /*
	 * Exercise 3 - write a function that receives 3 numbers and returns the highest
	 *
	 */
	public static int highestNum() {
		System.out.println("-------------EX3 Highest Num----------------");
		//Since JAVA need a return not in an if we will declare a new variable
		int higest = 0;
		//imported the scanner library at the top of the page
		//opening a new instance of a Scanner to receive 3 numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number followed by enter:");
		int num1 = input.nextInt();
		System.out.println("Please enter the second number followed by enter:");
		int num2 = input.nextInt();
		System.out.println("Please enter the third number followed by enter:");
		int num3 = input.nextInt();
		//checking for the higest number
		if(num1>num2 && num1> num3 && num2>num3) higest = num1;
		if(num2>num1 && num2>num3 && num1 > num3) higest = num2;
		if(num3>num1 && num3>num2 && num2>num1) higest = num3;
		
		System.out.println("The first number is: " + num1 + " The second number is: " +
							num2 + " The third number is: " + num3 + " The higest num is: " + 
							higest);
		System.out.println("-------------End EX3---------------------------");
		
		return higest;
	}
	
	public static void nonZeroPrint() {
		System.out.println("-------------EX4 Print Non Zero----------------");
		//Creating a new scanner instance
		Scanner input = new Scanner(System.in);
		/*using a boolean as a stop condition to the loop
	     as long as isZero is false (meaning the input is a non zero the loop
		 will continue
		*/
		boolean isZero = false;
		int number;
		//Printing a message to the user explaning how the program works
		System.out.println("You can enter numbers, if you wish to stop enter the number 0");
		while(!isZero) {
			System.out.println("Please enter a number followed by the enter key");
			number = input.nextInt();
			if(number == 0) {
				isZero = true;
			}
			else {
				System.out.println("The number is: " + number);
			}
		}
		System.out.println("-------------End EX4---------------------------");
	}

    //Question 4
    public int getBiggerFromUser()
    {
        int max_num;

        //creating a new scanner to receive inner input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 3 numbers (use Enter button after each one): ");

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();
        System.out.println();

        //  I'm using a default method in Java called 'max' to decide which number is bigger.
        //  Read more about Math.max() in these links:
        //  https://www.geeksforgeeks.org/java-math-max-method-examples/
        //  https://www.tutorialspoint.com/java/lang/math_max_int.htm
        max_num = Math.max(num1, num2);
        max_num = Math.max(max_num, num3);

       return max_num;
    }
    
    /*
	 * Exercise 5 - Random Stars
	 * 				write a function that rolls up a dice and print out the number
	 * 				of the dice as stars to the screen
	 * 
	 * Example - if the dice randomly get 5 we will print 5 stars *****
	 */
	public static void printStars() {
		System.out.println("-------------EX5 dice print stars ----------------");
		//importing the random library at the top of the page
		// java.util.Random
		
		//Creating a new instance of Random to generate random numbers
		Random rand = new Random();
		//creating our dice, we added 1 since nextInt() will range from zero to num-1
		int dice = rand.nextInt(6)+1;
		System.out.println("The dice is: " + dice);
		//Looping until the number of the dice to print stars
		for(int i =0; i<dice; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("-------------End EX5---------------------------");
	}

    //Question 5
    public void printInputUntilZero() {
        int inputNum;
        boolean isZero = false;

        //creating a new scanner to receive inner input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers to see them printing on the screen.");
        System.out.println("When you wish to stop - enter the number zero. ");


        while (!isZero)
        {
            inputNum = keyboard.nextInt();
            if(inputNum==0)
                isZero = true;
            else
                System.out.println(inputNum + " ");
        }
        System.out.println();
    }
    
    /*
	 * Exercise 6 - Examples
	 */
	public static void Examples() {
		System.out.println("-------------Examples----------------------------");
		//Example 1 - Use the correct method to find the highest value of x and y.
		int x = 5;
		int y = 10;
		Math.max(x, y);
		System.out.println("The max between "+ x + " and " + y + " is: " + Math.max(x, y));
		
		//Example 2 - Use the correct method to find the square root of x.
		x = 16;
		System.out.println("The square root of " + x + " is: " + Math.sqrt(x));
		//Example 3 - Use the correct method to return a 
		//            random number between 0 (inclusive), and 1 (exclusive).
		System.out.println("The function in Math library that return a value"
				+ " between 0 to 1 is random: " + Math.random());
		System.out.println("-------------End EXamples---------------------------");
	}

    //-----------------------Random------------------------------
    //Question 6
    public void rollTheDice() {
        int dice=0;
        int min = 1;
        int max = 6;
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 1 to 6
        dice = rand.nextInt(max - min + 1) + min;

        //Random can make numbers from 0 to the number we give it (not including)...
        // So we can just add 1 to the result
        // OR - we can use this way, to generate numbers from min to max (including both).

        for(int i=0; i<dice; i++) //loop to iterate printing * to the screen
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    /*
	 * QUIZ - Implement the function ‘guessNumber(int number)’.
			  The function gets positive integer number between 1 and 10.
			  The function returns a Boolean value – true or false.
			  The function needs to execute the following:

		
		1.Generate random number:

		You need to use Java Math to generate a random number between 1 and 10.

		2.Check if the input number is the same as the generated random number.

		3.Print the result and return a value:

		In case the generated random number is the same as the given input number, 
	    you need to print to the screen: GREAT JOB!!!
		And return true.

		Else you need to return false.


		For example:
 			guessNumber(7)            “”
 			guessNumber(7)          “GREAT JOB!!!”
	 */
	public static boolean guessNumber(int number) {
		System.out.println("-------------Lesson 6 Quiz question 1----------------");
		//Creating the result boolean
		boolean result = false;
		//STEP 1 - Generating a random number
		//Creating a random instance
		Random rand = new Random();
		//randNum is a random number between 1-10
		int randNum = rand.nextInt(10) + 1;
		//STEP 2 - check if the random number is the same as the input
		if(randNum == number) {
			System.out.println("The random number is: " + randNum + 
								" the input number is: " + number);	
			System.out.println("GREAT JOB!!!");
			result = true;		
		}
		else {
			System.out.println("The random number is: " + randNum + 
					" the input number is: " + number);	
			result = false;
		}
		System.out.println("-------------End Quiz question 1---------------------------");
		return result;
	}
	/*
	 * implement the function ‘replaceStartWithEndInString(String str, int num)’.
	   The function gets a string and a number as an input, 
	   it checks if the given string length is larger than the number, 
	   replace the character in the last index with the char in the first index.
	   
		For example:
		replaceStartWithEndInString(“JavaExample”, 3)            “eavaExamplJ”
		replaceStartWithEndInString(“JavaExample”, 15)          “JavaExample”
	 */
	public static String replaceStartWithEndInString(String str, int num) {
		System.out.println("-------------Lesson 6 Quiz question 2----------------");
		//Declaring variables
		StringBuilder result = new StringBuilder();		
		//Checking the length of the input String vs. the num
		if(str.length() > num) {
			char firstCharStr = str.charAt(0);
			char lastCharStr = str.charAt(str.length()-1);
			result.append(lastCharStr).append(str.substring(1,str.length()-1)).append(firstCharStr).toString();
		}
		if(str.length() == num) {
			result.append(str.toString());
		}
		if(num > str.length()) {
			result.append(str).toString();	
		}
		System.out.println("The String is: " + str + " The length of the String is: " + str.length() + " The number is: " + num);
		System.out.println("The result String is: " + result.toString());
		System.out.println("-------------End Quiz question 2---------------------------");
		return result.toString();
	}

}
