package array;
import java.util.Arrays;

public class CountOfAlpha 
{
	static int balpha=0;
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
						
					}
					System.out.println(balpha);

				}
	}


