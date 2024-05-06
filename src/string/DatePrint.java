package string;

import java.util.Date;
import java.util.Scanner;

public class DatePrint {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		String input=d1.toString();
		System.out.println(input);
		String date= input.substring(8, 10);
		System.out.println(date);
		String year=input.substring(24);
		System.out.println(year);
		
		Date d2=new Date(d1.getTime()+(60*60*1000*24*1));// futurevdate
		System.out.println(d2);
				String input1=		d2.toString();
				System.out.println(input1);
			String month=		input1.substring(4, 7);
				System.out.println(month);
				
				System.out.println(input1.length());
				
				//String year=		input1.substring(input1.length()-4);

				System.out.println(year);
				System.out.println("====================================");
				System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
				System.out.println(date.concat("-").concat(month).concat("-").concat(year));
				System.out.println(date.concat("/").concat(month).concat("/").concat(year));
				Scanner s1=new Scanner(System.in);
				
	}

}
