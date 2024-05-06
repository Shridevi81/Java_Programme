package polymorphism;

public class Compiletime_Polymorphism {
	public void add(int a)
	{
		System.out.println("a");
	}
	public void add(String s, int t)
	{
		System.out.println("b");
	}
	public void add(boolean v)
	{
		System.out.println("c");
	}
	public void add(double d)
	{
		System.out.println("d");
	}
	public void add(float f)
	{
		System.out.println("e");
	}
	
	public static void main(String[] args)
	{
		Compiletime_Polymorphism p =new Compiletime_Polymorphism();
		p.add(false);
		p.add(10.30);
		p.add(80);
		p.add(30.8f);
		p.add("shri", 2);
		
	}

}
