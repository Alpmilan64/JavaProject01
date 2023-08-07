package com.neoTech.Package1;

public class SwitchDemo {
	
	   public static void main(String[] args) {
		   
		 //given the 1 - 7 then print the name of the day
		   
		   
			//   **********  USING IF-ELSE ****************
			
		         int day = 1;
		           	String dayName;
			
			if (day == 1)
			{
//				System.out.println("Monday");
				dayName = "Monday";
			}
			else if (day == 2)
			{
//				System.out.println("Tuesday");
				dayName = "Tuesday";
			}
			else if (day == 3)
			{
//				System.out.println("Wednesday");
				dayName = "Wednesday";
			}
			else if (day == 4)
			{
				System.out.println("Thursday");
				dayName = "Thursday";
			}
			else if (day == 5)
			{
//				System.out.println("Friday");
				dayName = "Friday";
			}
			else if (day == 6)
			{
//				System.out.println("Saturday");
				dayName = "Saturday";
			}
			else if (day == 7)
			{
//				System.out.println("Sunday");
				dayName = "Sunday";
			}
			else 
			{
//				System.out.println("Invalid day");
				dayName = "Invalid";
			}

			System.out.println("The name of the day with number " + day + " is " + dayName);
			
			
			// ********Using Switch case:  *****************
			
			switch(day)//we use the variable that we want to compare the value
			{
			case 1:
//			System.out.println("Monday");
				dayName = "Monday";
				break;//end the execution, get out of switch
			
			case 2: 
//				System.out.println("Tuesday");
				dayName = "Tuesday";
				break;
			case 3: 
				System.out.println("Wednesday");
				dayName = "Wednesday";
				break;
			case 4:
//				System.out.println("Thursday");
				dayName = "Thursday";
//				break;
			case 5:
			System.out.println("Friday");
				dayName = "Friday";
				break;
			case 6:
//				System.out.println("Saturday");
				dayName = "Saturday";
				break;
			case 7: 
//				System.out.println("Sunday");
				dayName = "Sunday";
				break;
			default://same as else in the if - else if - else block
//				System.out.println("invalid");
				dayName = "Invalid";
				break;
			}
		
			System.out.println("The name of the day with number " + day + " is " + dayName);
			
		   
		   
		   
		
	}

}
