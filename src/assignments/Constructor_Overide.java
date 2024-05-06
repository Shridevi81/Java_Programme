package assignments;
 class Merinda
{
	 Merinda()
	 {
		 
	 }
}
public class Constructor_Overide 
{
	Merinda()
	{
		System.out.println("parent constructor");// not possible to override
		
	}
	Constructor_Overide()
	{
		System.out.println("child constuctor");
	}
	public static void main(String[] args) 
	{
		Constructor_Overide c=new Constructor_Overide();
		
	}

}
