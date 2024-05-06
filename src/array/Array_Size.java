package array;
import java.util.Scanner;

public class Array_Size {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int rollno[]=new int[s1.nextInt()];
	for(int i=0; i<rollno.length; i++)
	{
		rollno[i]=s1.nextInt();
		System.out.println("enter the array value->"+i);
		System.out.println(rollno[i]);
		System.out.println("enter the value of->"+i);
		System.out.println(rollno[i]);
	}
	}

}
