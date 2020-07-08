package chapter2;
import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		int i=0,carry=0;
		int [] sum= new int [10];
     Scanner sc= new Scanner(System.in);
     
     System.out.println("enter 1st binary number");
     long b1= sc.nextLong();
    System.out.println("enter 2nd binary number");
    long b2= sc.nextLong();
  
  
    while(b1!=0||b2!=0)
    { 
    	sum[i++]=(int)((b1%10+b2%10+carry)%2);
    	carry= (int)((b1%10+b2%10+carry)/2);
    	b1=b1/10;
    	b2=b2/10;
   }
    
    if(carry!=0)
    {
    	sum[i++]=carry;
    }   
    i--;
    while(i>=0)
    {
    	System.out.print(sum[i]);
    	i--;
    }
    }
    

	}


