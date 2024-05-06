 package assignments;

public class MethodOverloading {

	public static void main(int a,String s1) 
	{
		System.out.println("1");
	}
	public static void main(double d, boolean b) 
	{
		System.out.println("2");
	}
	public static void main(int r, char c) 
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		
		main(8,"Shri");
		main(2.5,true);
		main(1,'w');
		System.out.println("4");
	}
}
