package array;

import java.util.Arrays;
public class CountOfSplchar {
static int balpha=0;
static int dnumbers=0;
static int cspace=0;
static int aspl=0;
static int total= 0;

	public static void main(String[] args) {
		String name="Manish kumar towari 123#%@$";
		char[] c1=name.toCharArray();//
		System.out.println(Arrays.toString(c1));// with array characters in one line
		for(int i=0;i<c1.length;i++)
		{
			boolean a = Character.isAlphabetic(c1[i]);
			//System.out.println(a);
			if(a==true)
			{
				balpha++;
				
			}
			
			boolean c= Character.isDigit(c1[i]);
			//System.out.println(a);
			if(c==true)
			{
				dnumbers++;
				
			}
			
			boolean b = Character.isDigit(c1[i]);
			//System.out.println(a);
			if(b==true)
			{
				cspace++;
				
			}
		}
		System.out.println(balpha);
		System.out.println(cspace);
		System.out.println(dnumbers);
		
		int total =(balpha+cspace+dnumbers);
		System.out.println(name.length()-total);
	}

}
