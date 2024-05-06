package thissuper;


public class Thiscalling {

	Thiscalling(String s)
		{
			System.out.println("i am constructor");
		}
	Thiscalling(float f,boolean b)
		{
			this("shridevi");
			System.out.println("i am constrctor2");
		}
		/*ThisCalling(short c)
		{
			this(100,'s');
			System.out.println("i am constructor4");
		}*/
	Thiscalling()
		{
			this(100,'s');
			System.out.println("i am constructor5");
		}
	Thiscalling(int a, char c)
		{
			this(10.10f, false);
			System.out.println("i am constructor6");
		}
	Thiscalling(long l)
		{
			this();
			System.out.println("i am constructor7");
		}
		public static void main(String[] args) 
		{
			Thiscalling b= new Thiscalling(20);
		}
	

}
