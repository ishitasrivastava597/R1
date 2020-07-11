package chapter2;
import java.util.Scanner;

public class Q79 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n= sc.nextInt();
        int a1[]= new int[n];
        System.out.println("enter the array");
        
        for(int i=0;i<n;i++)
        {
        	a1[i]=sc.nextInt();
        }
        int j= a1[0];
        for(int i=0;i<n-1;i++)
        {  
        	a1[i]=a1[i+1];
                        	
        }
        a1[n-1]=j;
        for(int i=0;i<n;i++)
        	System.out.print( a1[i]+",");

	}

}
