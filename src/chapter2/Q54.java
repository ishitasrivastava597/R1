package chapter2;
import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int i,j,k;
     System.out.println("enter the 1st number");
     int a= sc.nextInt();
     System.out.println("enter the 2nd number");
     int b= sc.nextInt();
     System.out.println("enter the 3rd number");
     int c= sc.nextInt();
    
       i = a%10;
       j = b%10;
       k = c%10;
       
       if(i==j||i==k||k==j)
       {
    	    System.out.println("1");
    	     
       }
       else
       {
    	   System.out.println("0");
       }
       
    
	}

}
