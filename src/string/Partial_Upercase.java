package string;

public class Partial_Upercase {

	public static void main(String[] args) {
		String name="shridevi";
		char[] c1=name.toCharArray();
System.out.println(c1);
String name1=name.substring(2, 5);
String name2=name.substring(0, 2);
String name3=name.substring(5, 8);

System.out.println(name2.concat(name1.toUpperCase().concat(name3)));
	
	}

}
