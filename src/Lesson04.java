import java.util.ArrayList;
import java.util.Scanner;

public class Lesson04 {
	
	public static void Ex1() {
		System.out.println("Excersise 1- examples");
		//Example 1 - Print i as long as i is less than 6.
		System.out.println("Example 1 - Print i as long as i is less than 6.");
		int i = 1;
		while(i < 6) {
			System.out.println(i);
			i++;
		}
		//Example 2 - Use the do/while loop to print i as long as i is less than 6.
		System.out.println("Example 2 - Use the do/while loop to print i as long as i is less than 6.");
		int j=1;
		do {
			System.out.println(j);
			j++;
		}
		while(j<6);
		//Example 3 - Use a for loop to print "Yes" 5 times:
		System.out.println("Example 3 - Use a for loop to print \"Yes\" 5 times");
		for(int k = 0; k<5; k++) {
			System.out.println( k + 1 + " Yes");
		}
		System.out.println("Example 4 - Loop through the items in the cars array.");
		//Example 4 - Loop through the items in the cars array.
		String[] cars = {"Volvo", "BMW", "Ford"};
		for(String t: cars) {
			System.out.println(t);
		}
		System.out.println("Example 5 - Stop the loop if i is 5.");
		//Example 5 - Stop the loop if i is 5.
		for(int y = 0; y<10; y++) {
			if(y == 5) {
				break;
			}
			System.out.println(y);
		}
		//Example 6 - In the loop, when the value is "4",
		//            jump directly to the next value.
		System.out.println("Example 6");
		System.out.println("In the loop, when the value is \"4\",");
		System.out.println("jump directly to the next value.");
		for(int r = 0; r<10; r++) {
			if(r == 4) {
				continue;
			}
			System.out.println(r);
		}
	}

    //Loops
    public void using_for_loop()
    {
        int i, sum=0; //defining both parameters in the same row. Both are type "int" so no need to write "int" again! :)

        for(i=1 ; i<=1000 ; i++) //for loop that runs from 1 until 1000 (including 1000)
        {
            sum+= i; //shorter prettier way to write sum = sum + i;
        }

        System.out.println(sum); //printing the result to the console

    }

    public void using_while_loop()
    {
        int num = 1024; //define the parameter with the number 1024

        while(num>1) // we want to run this loop until we get 1 from dividing num by 2
        {
            num = num / 2; //num will now be last num divided by 2
            System.out.println(num); //print result
            
        }
    }
 

    //-----------------------------------------------------------------------------------------------------------------------

    //Debugging
    public void whoIsOlder(int myAge, int myFriendAge) //naming parameters like that is called Camel Case Writing (LikeThat).
    {
        if(myAge > myFriendAge) //put breakpoint on this line and see what happens when you try to run the code
            System.out.println("I am older than my friend!");

        else if (myAge == myFriendAge) //try a breakpoint on this line as well! :)
            System.out.println("Me and my friend are the same age!");

        else                        //no need for {} after "if" or after "else" here cause it is only 1 line
            System.out.println("My friend is older than me!");
    }

    public void forLoopWithDebug()
    {
        for(int i=1; i<=10; i++) //Did you know you can write the definition of i inside the loop? well now you know! ;)
        {
            System.out.println(i); //put a breakpoint on this line and see what happens.
                                  // How many times will the program stop?
        }
    }

    //-----------------------------------------------------------------------------------------------------------------------

    //Print 'X' Shape to screen (from quiz)
    public void printX_for5()
    {
        int num = 5;
        for(int i=0; i<num; i++){ // outer loop - rows
            if(i==0 || i==num-1){
                for(int j=0; j<num; j++){ // inner loop for 1st and last rows
                    if(j==0 || j==num-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            else if(i==1 || i==num-2){
                for(int j=0; j<num; j++){ // inner loop for 2st and 1 before last rows
                    if(j==1 || j==num-2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            else {
                for(int j=0; j<num; j++){ // inner loop for middle row
                    if(j == num/2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    //Print 'X' Shape to screen (Extra - Generic)
    public void printX()
    {
        int num = 7;

        int left = 0;
        int right = num-1;

        for(int i=0; i<num; i++){ // outer loop - rows
            left = i;

            for(int j=0; j<num; j++){ // inner loop - deals with the chars in each row
                if(j==left || j==right) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println("");
        }
    }
    
  //Print 'X' Shape to screen (Extra - Generic)
  	 public static void printX_NaiveNsetedloop(){
  		
  		 //Caliing to take the Size of matrix from the user
  		 int sizeMat = reSettningMatrixSize();
  		 boolean valiSize = validMatrixSize(sizeMat);
  		 //if input is in valid we will go to another helper function that will 
  		 //keep taking again and again inputs until a set of valid value will show up
  		 //initializing a counter to the loop initialize boolean for QA 
  		 int i = 0;
  		 while(valiSize == false) {
  			 sizeMat = reSettningMatrixSize();
  			 valiSize = validMatrixSize(sizeMat);
  			 if(valiSize == true) {
  				 break;
  			 }
  			 else i++;
  		 }
  		 printMatrixNaiveApproce(sizeMat);		
  	 }

  	 //printin the program accordin to the stars unmbers
  	 public static void printMatrixNaiveApproce(int sizeMatrix) {
  		 for(int row=0; row<sizeMatrix; row++){ // outer loop - rows
  			 //printing 1st and last rows(row 0 and row 4)
  			 if(row==0 || row==sizeMatrix-1){
  				 for(int col=0; col<sizeMatrix; col++){ // inner loop for 1st and last rows
  					 if(col==0 || col==sizeMatrix-1){
  						 System.out.print("*");
  					 }
  					 else System.out.print(" ");
  				 }
  				 System.out.print("\n");
  			 }
  			 if(row==1 || row == sizeMatrix-2) {
  				 for(int col=0; col<sizeMatrix; col++){ // inner loop for 1st and last rows
  					 if(col==1 || col==sizeMatrix-2){
  						 System.out.print("*");
  					 }
  					 else System.out.print(" ");
  				 }
  				 System.out.print("\n");
  			 }
  			 if(row==sizeMatrix/2) {
  				 for(int col=0; col<sizeMatrix; col++){ // inner loop for 1st and last rows
  					 if(col==sizeMatrix/2){
  						 System.out.print("*");
  					 }
  					 else System.out.print(" ");
  				 }
  				 System.out.print("\n");
  			 }
  		 }
  	 }

  		 
  	 public static boolean validMatrixSize(int testSize) {
  		 boolean result = false;
  		if(testSize == 0) {
  			 System.out.println("Matrix size cant be 0");
  			 result = false;
  		 }
  		 if(0 < testSize && testSize<=21 && testSize % 2 !=0) {
  			 result = true;
  			 System.out.println("Matrix size is valid");

  		 }
  		 else {
  			 if((testSize < 0 || testSize > 21 )|| (testSize%2 == 0) ) {
  				 System.out.println("Matrix size is not valid");
  				 result = false;
  			 }
  		 }

  		 return result;
  	 }

  	public static int reSettningMatrixSize() {
  		  //To make things harder we will let the user decide on a size which is uneven 
  		 // between 1-21 and we will have to validate that the number is indeed in that range
  		 Scanner numStars = new Scanner(System.in);
  		 System.out.println("Please enter an uneven number in the range of 1-21");
  		 int result = numStars.nextInt();
  		 return result;
  	 }
  	public static void quizPrintAnXComplicated(){
  		System.out.println("Quiz question print an X");
  		//we will first create a scanner object to receive the number of rows
  		//and the char for the X pattern
  		//Import scanner statement at the top of the page
  		Scanner input = new Scanner(System.in);
  		//Prompting the user to give us the number of rows he wants 
  		System.out.println("Please enter the number of rows followed by enter key.");
  		int size  = input.nextInt();
  		//The X pattern only works for Odd numbers so we will validate that information
  		while(size%2 == 0) {
  			System.out.println("The number of rows must be an odd number!");
  			System.out.println("Please type in a size which is an odd number followed by enter");
  			size  = input.nextInt();
  		}
  		//Prompting the user to enter the char he wants for the pattern
  		System.out.println("Please enter the char you wish followed by enter key.");
  		char pattern = input.next().charAt(0);
  		//starting For sequence for the printing of the X 
  		System.out.println("---- Printing X Pattern of Stars ------");
  		for(int i = 0; i < size; i++) {
  			for(int j =0; j<size;j++) {
  				//the conditions for an char to appear on an X pattern
  				if(i==j ||  j+i == size-1) {
  					System.out.print(pattern);
  				}
  				System.out.print(" ");
  			}
  			//starting new line
  			System.out.print("\n");
  		}
  	}
  	public static void printMatrix(String [][] mat, int size) {
  		for(int i=0; i<mat.length;i++) {
  			for(int j=0; j<mat.length;j++) {
  				System.out.print(mat[i][j]+ " ");
  			}
  			System.out.println();
  		}
  		
  	}
  	public static String[][] createMatrix(int size){
  		String[][] outPutMatrix = new String [size][size];
  		
  		for(int i=0; i<size;i++) {
  			for(int j=0; j<size;j++) {
  				outPutMatrix[i][j] = "(" + i + "," + j+ ")";
  			}
  			System.out.println();
  		}
  		return outPutMatrix;
  		
  	}
  	public static String[][] MatrixWithX(int size){
  		
  		String[][] matrixStart = createMatrix(size);
  		
  		for(int row = 0;row<size;row++) {
  			for(int col=0; col<size;col++) {
  				if((col == 0 && row==0) || (row==0 && col == size-1) ){
  					matrixStart[row][col] = " * ";
  				}
  				if(col == size/2 && row==col){
  					matrixStart[row][col] = " * ";	
  				}
  				if(col==row || col == size - row - 1) {
  					matrixStart[row][col] = " * ";	
  				}
  				
  			}
  		}
  		return matrixStart;
  	}
  	
  	public static ArrayList<String> indexWhereStarAre(int size){
  		ArrayList<String> arr = new ArrayList<String>();
  		String [][] matrix = MatrixWithX(size);
  		for(int i = 0; i < size; i++) {
  			for(int j=0; j< matrix.length; j++) {
  				if(matrix[i][j] == " * ") {
  					arr.add("(" + i + ", " + j + ")");
  				} 
  			}
  		}
  		for (String i : arr) {
  			System.out.println(i);
  		}
  		return arr;
  	}

   	public static void printMultiplicationTable(int size) {
  		//Prints a multiplication table 10 by 10 

  		//STEP 1 WE NEED TO THINK OF THE TABLE AS A MATRIX NEED TO BE FILLED WITH 
  		//THINBG SO WE WILL NEED TO GO THOROUGH NESTED LOOPS TO COUNT TO 10x10
  		System.out.println("The program will print " +  size + " by " +  size + " multiplication table");
  		System.out.println();
  		//first line we will print thte number 1-10 using a loop for asthethics
  		for(int i=1; i<=size;i++) {
  			System.out.format("%3d" + "|",i);
  		}
  		System.out.println();
  		
  		//printing in the outer loop the coloum of number 
  		//in the inner loop we will print the multiplication
  		for(int row=1; row<= size; row++) {
  			System.out.print( row + "|");
  			//iNNER Loop will do the multiplication
  			for(int col=1;col<=size;col++) {
  					System.out.format("%4d",row*col);
  			}
  			System.out.println();
  		}
  		System.out.println();
  	}



}
