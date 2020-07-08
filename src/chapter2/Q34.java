package chapter2;
import java.util.Scanner;
public class Q34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int a = sc.nextInt();
      int sum=0;
      int r;
      while(a>0)
      {
    	  r=a%10;
    	  sum=sum+r;
    	  a=a/10;
      }
      System.out.println(sum);
		
	}

}
