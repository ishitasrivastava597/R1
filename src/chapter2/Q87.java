package chapter2;
import java.util.Scanner;

public class Q87 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a= sc.nextInt();
		int r;
		int j;
		int sum=0;
		while(a!=0)
		{
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
            
            System.out.println(sum);
            int k=sum;
            while(sum!=0)
            {
                j = sum%10;
                System.out.println(j);
                sum=sum/10;
                
            }
           
	}

}
