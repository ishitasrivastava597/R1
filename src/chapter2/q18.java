package chapter2;
import java.util.Scanner;

public class q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		long carry=0;
		long result=0;
		long [] sum = new long[20];
		
		System.out.println("enter 1st binary number");
		long b1=sc. nextLong();
		System.out.println("enter 2nd binary number");
        long b2=sc.nextLong();
        
        while(b1!=0||b2!=0)
        {
        	sum[i++]=(long)((b1%10+b2%10+carry)%2);
        	carry=(long)((b1%10+b2%10+carry)/2);
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
        	result=result*10+sum[i--];
        }
        System.out.println(result);
        
	}

}
