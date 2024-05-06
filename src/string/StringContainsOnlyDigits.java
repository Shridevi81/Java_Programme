package string;

import java.util.Arrays;

public class StringContainsOnlyDigits {
	static int dnumbers=0;
	public static void main(String[] args) 
	{
		String name="1234765";
				char[] c1=name.toCharArray();
		//System.out.println(Arrays.toString(c1));// with array characters in one line
		for(int i=0;i<c1.length;i++)
		{
			boolean a = Character.isDigit(c1[i]);
			//System.out.println(a);
			if(a==true)
			{
				dnumbers++;
				
			}
	
	     }
           if (dnumbers==name.length())
               {
	              System.out.println("string contains only the digits");
               }
           else
           {
        	   
        	  System.out.println("string doesnt contains only digits");
           }
	}
}

