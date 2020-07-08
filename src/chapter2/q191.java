package chapter2;
import java.util.Scanner;

public class q191 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n");
		int n= sc.nextInt();
		int [] binary = new int [100];
		int i=0;
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		
		for(int j= i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
		

	}

}
