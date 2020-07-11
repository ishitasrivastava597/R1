package chapter2;
import java.util.Scanner;
public class Q81 {

	public static void main(String[] args) {
       
		Scanner sc= new Scanner(System.in);
		int i;
		System.out.println("enter size");
		int n= sc.nextInt();
		int a1[] = new int[n];
		System.out.println("enter the values");
		for( i=0;i<n;i++)
		{
		    a1[i] = sc.nextInt();
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			int temp= a1[0];
			a1[0]=a1[n-1];
			a1[n-1]=temp;
		 }
		for(i=0;i<n;i++)
			System.out.print(a1[i]+" ");

	}

}
