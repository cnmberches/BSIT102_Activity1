/*
 *Charles Nicholas M. Berches
 *Justin Bajaro
 *BSIT102
 *Activity1
 */
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 
 public class Calculator
 {
 	public static void main(String [] arg) throws IOException
 	{
 		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
 		System.out.print("Enter first number: ");
 		int num1 = Integer.parseInt(sc.readLine());
 		System.out.print("Enter second number: ");
 		int num2 = Integer.parseInt(sc.readLine());
 		
 		System.out.println("\nThe sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + "." );
 		System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2) + "." );
 		System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2) + "." );
 		System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2) + "." );
 	}
 }