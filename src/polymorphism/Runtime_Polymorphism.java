package polymorphism;

class Automation
{
 static void add()
	{
		int a= 10;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
  void add1()
 {
	  System.out.println("ram");
 }
  void sub()
  {
	System.out.println("sita");  
  }
}
public class Runtime_Polymorphism 
{
	void add1()
	{
		System.out.println("laxman");
	}
	void sub()
	{
		System.out.println("shatrugna");
	}
	public static void main(String[] args) 
	{
		/*Runtime_Polymorphism r= new Runtime_Polymorphism();
		r.add1();
		r.sub();
		add();*/		
		Automation a= new Automation();
		a.add1();
		a.sub();
		a.add();

	}

}
