package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchusingScanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		try {
		int age= s1.nextInt();
		System.out.println(age);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("handled");
		}
		finally 
		{
		System.out.println("thank for visiting");	
		}
	}

}
