package localvariable;

public class LocalVariable1
{
void add()
{
	int a= 39;
	double wieght= 20.12;
	System.out.println(500+a);
	System.out.println(wieght);
	System.out.println(100+a);
}
static void sub()
{
String name="vinay";
System.out.println(name);
}
	public static void main(String[] args) 
	{
		LocalVariable1 l1= new LocalVariable1();
		l1.add();
		sub();
		
	}

}
