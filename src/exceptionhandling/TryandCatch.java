package exceptionhandling;

public class TryandCatch {

	public static void main(String[] args) {
		int a=10;
		try
		{
		int c= 10/0;
		System.out.println(c);
	}
		catch(ArithmeticException a1)
		{
			System.out.println("exception handled");
		}
	}

}
