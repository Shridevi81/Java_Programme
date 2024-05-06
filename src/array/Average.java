package array;

public class Average 
{
	static int sum=0;
	static double average=0;;
	 
	public static void main(String[] args) 
	{
		int number[]=new int[4];
		number[0]=10;
		number[1]=50;
		number[2]=40;
		number[3]=30;   
		
		for(int i=0;i<number.length;i++)
		{
			
			sum = sum+number[i];
			average =sum/number.length;
		}	
			System.out.println(sum);
			System.out.println(average);
			
		
			
    }

}
