package thissuper;

class State
{
	/*State()
	{
		System.out.println("i am npgp");
	}*/
	State(int a, String s)
	{
		System.out.println("i am pgp");
	}
	}

class City extends State
{
	
	/*City()
	{
		super(int a, int b);
	System.out.println("i am npparent");	
	}*/
	City(char c, int g)
	{
		super(100,"sh");
	System.out.println("i am pparent");	
	}
	}

public class SupercallingStmt 
{
	SupercallingStmt()
	{
		super();
		System.out.println("i am npstudent");
	}

	/*SupercallingStmt(double d,int f)
	{
		System.out.println("i am pstudent");
	}*/
	public static void main(String[] args) {
		new SupercallingStmt();
		
	}

}
