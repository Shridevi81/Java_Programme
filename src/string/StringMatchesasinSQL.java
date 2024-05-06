package string;

public class StringMatchesasinSQL 
{

	  public static void main(String[] args)
	  {
		String s1="shridevi";
		System.out.println(s1.matches("s(.*)"));
		System.out.println(s1.matches("(.*)e"));
		System.out.println(s1.matches(""));
		System.out.println(s1.matches("........"));
		
		String b="Foosball";
		int i=b.lastIndexOf('l');
		System.out.println(i);
	  }

}
