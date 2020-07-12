package chapter2;
import java.util.Scanner;
public class Q107 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int flag=0;
		int a1[]=new int [n];
		int i;
		System.out.println("enter the values");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
			if(a1[i+1]==a1[i]+1&&a1[i+1]>a1[i])
			          flag=1;
			
		}
		if(flag==0)
			System.out.println("false");
		if(flag==1)
			System.out.println("true");

	}

}
