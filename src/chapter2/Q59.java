package chapter2;
import java.util.Scanner;

public class Q59 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s1= sc.nextLine();
		char c1[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(c1[i]>=65 && c1[i]<= 90)
			{
			   c1[i]=(char)(c1[i]+32);
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(c1[i]);
		}

	}

}
