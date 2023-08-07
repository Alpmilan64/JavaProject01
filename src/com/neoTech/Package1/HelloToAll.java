package com.neoTech.Package1;

public class HelloToAll {
	
	public static void main(String[] args) {
		//  Elion slack homework. 5/1 2023
		
		/*Write a method that can divide two integers without using division or modulus operators
		Given: The parameters given to the method 22, 7
		Output: The result is 3 and remainder is 1
	*/
	         	divide2Integers(22, 7);

	}

	public static void divide2Integers(int a, int b) {
	
	 int count =0;
	 
	 while (a>=b) {
		 
		 a=a-b;
		 count++;
	 }
	System.out.println("Result is :" + count + "and remainder " + a );
	
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


