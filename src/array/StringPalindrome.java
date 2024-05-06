package array;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="rudra";//6 - i=6 a=a;r=0+a ;r=a // i=5 r=a+d ;
		String reverse="";
	
		for(int i=name.length()-1;i>=0;i--)
		{
			char a=name.charAt(i);
			reverse=reverse+a;
			System.out.println(a);
			}
	
		System.out.println(reverse);
		if(name.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		String name1="gadag";//6 - i=6 a=a;r=0+a ;r=a // i=5 r=a+d ;
		String reverse1="";
	
		for(int i=name1.length()-1;i>=0;i--)
		{
			char a=name1.charAt(i);
			reverse1=reverse1+a;
			System.out.println(a);
			}
	
		System.out.println(reverse1);
		if(name1.equals(reverse1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
