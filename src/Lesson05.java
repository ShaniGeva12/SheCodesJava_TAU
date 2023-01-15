import java.time.LocalDate;

public class Lesson05 {

    //-----------------------Functions------------------------------
    //Question 1
    public boolean isPositive(double num)
    {
        String str;

        if(num>=0)
            return true; //no need for {} here because it's only 1 line

        //no need for else here because if(true) then we go out from this function
        //so this code will only run if the condition is false
        return false;
    }

    //Question 2
    public int getBirthYear(String name, int age)
    {
        int birth_year=-1;
        //set initial value to indicate a mistake if something goes wrong,
        // without breaking in runtime

        int year;
        LocalDate today = LocalDate.now(); //to get current date from computer
        year = today.getYear(); //we can also set manually: year = 2020
        birth_year = year - age;

        System.out.println(name + "'s age is: " + age);
        System.out.println(name + "'s birth year is: " + birth_year);

        return birth_year;
    }
    /*
	 * QUIZ 3 - 
	 * 
	 * You are given a function ‘combineStrings’ that gets 2 strings - str1 and str2, and returns a new string which contains both given strings.

		For example, if the input is:

		Str1 = “She”

		Str2 = “Codes”

		The result should be:

		“SheCodes”
	 * 
	 * Copy the following lines 
	 * public static int combineStrings(String str1, String str2) {

           StringBuilder sb = new StringBuilder();

           sb.append(str1);

           sb.append(str2);

           return sb.toString();
      }
       Step b:

		you need to change something in the code, 
		so that the function will reproduce the requested result.

		Hint - If you press the ‘check’ button and try to run the code as 
		it is now, you will get the following error:

       error: incompatible types: String cannot be converted to int

		Step c:

	   when you have finished, 
	   click on the 'check' button to ensure that your code is correct.


	 */
	//We changed the Signature from int(return value) to String
	public static String combineStrings(String str1, String str2) {
		System.out.println("Quiz - Appending 2 Strings together");

        StringBuilder sb = new StringBuilder();

        sb.append(str1);

        sb.append(str2);
        
        String sheCodes = sb.toString();
        
        System.out.println(sheCodes);
        System.out.println("--------------End Quiz------------------------------");

        return sheCodes;
   }

}
