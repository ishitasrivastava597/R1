package chapter2;
import java.util.Scanner;
public class Q112 {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number");
	       int a = sc.nextInt();
	       
	      for(int i=a-1;i>=1;i--)
	      {
	    	  a=a*i;
	      }
	      System.out.print(a);
	       int rem;
	       int count=0;
	      while(a!=0)
	      {
	    	 rem=a%10;
	    	 if(rem==0)
	    		 count++;
	    	 else
	    		 break;
	    	 a=a/10;
	      }
	      System.out.println();
           System.out.println(count);
	}

}
