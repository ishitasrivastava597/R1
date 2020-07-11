package chapter2;
import java.util.Scanner;
public class Q85 {

	public static void main(String[] args) {
           int j=1;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be tested");   
		String s1=sc.nextLine();
		System.out.println("enter the string to be present");
		String s2=sc.nextLine();
		int i;
		for(i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
			       j=0;
			
		    }

	}
           System.out.println(j);
}
}