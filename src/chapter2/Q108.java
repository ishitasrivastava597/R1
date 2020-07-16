package chapter2;
import java.util.Scanner;

public class Q108 {
	
	
	static void findsum (int x)
	{
		int b;
		int s=0;
		int sum;
		while(x!=0)
		{
			
			b=x%10;
			s=s+b;
			x=x/10;
		}
		if(s<10)
		    System.out.println(s);
		
		else {
			  sum=s;
			   findsum(sum);
		  
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
	     int a=sc.nextInt();
	     findsum(a);
		   
	}

}
