package chapter2;
import java.util.Scanner;
public class q12 {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
            
	     int n= sc.nextInt();
	     int sum=0;
	     int count=0;
	  
	     int[] a1 = new int [n];
	     
	     for(int i=0;i<n;i++)
	     {
	    	 a1[i]=sc.nextInt();
	    	 
	     }
	      
	       for(int i=0;i<n;i++)
	     {
	    	 sum=sum+a1[i];
	     }
	       int avg=sum/n;
	       System.out.println("the avg is "+avg);

	}

}

