package array;

public class AverageofTwoDatatypes {
	static int sum=0;
	static double average=0;
	static double sum2=0;
	static double average2=0;
	static double sum3=0;
	static double average3=0;
	
	public static void main(String[] args) {

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
		//System.out.println(sum);
		//System.out.println(average);
		

		double number2[]=new double[4];
		 number2[0]=22.4;
	     number2[1]=50.6;
	     number2[2]=70.8;
		 number2[3]=36.7;
		
		for(int j=0; j<number2.length; j++)
		  {
			  sum2=sum2+number2[j];
			  average2=sum2/number2.length;
			  
		  }
		
           //System.out.println(sum2);
			//System.out.println(average2);
			sum3=sum+sum3;
			average3=average+average2;
			System.out.println(sum3);
             System.out.println(average3);
	}

	}


