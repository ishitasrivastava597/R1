package chapter2;
import java.util.Scanner;
public class Q83 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int i;
		int a1[]=new int [n];
		int a2[]=new int [n];
		int a3[]=new int [n];
		System.out.println("enter values in 1st array");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter value in 2nd array");
		for(i=0;i<n;i++)
		{
			 a2[i]=sc.nextInt();
		}
		for( i=0;i<n;i++)
		{
			a3[i]=a1[i]*a2[i];
		}
		System.out.println("the values for 3rd array");
		for(i=0;i<n;i++)
		{
			System.out.print(a3[i]+",");
		}
	}

}
