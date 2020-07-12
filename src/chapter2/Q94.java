package chapter2;
import java.util.Scanner;
public class Q94 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int a1[]=new int[n];
		int a2[]=new int [n];
		int i,j;
		System.out.println("enter the vlaues");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		for(i=0,j=0;i<n&&j<n;i++)
		{
			if(a1[i]%2!=0)
			{
				a2[j]=a1[i];
				j=j+1;
			}
		}
		int z=j;
		for(i=0,j=z;i<n&&j<n;i++)
		{
			if(a1[i]%2==0)
			{
				a2[j]=a1[i];
				j=j+1;
			}
		}
		for(i=0;i<n;i++)
		System.out.print(a2[i]+",");
		    
	}

}
