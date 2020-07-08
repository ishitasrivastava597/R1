package chapter2;
import java .util.Scanner;

public class Q38 {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the string");
	String s1= sc.nextLine();
	
	String rev="";
	
	int length= s1.length();
	int i;
	for( i=length-1;i>=0;i--)
	{
		rev=rev+ s1.charAt(i);
		
	}
	System.out.println(rev);
	
	
		

	}

}
