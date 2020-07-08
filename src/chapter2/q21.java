package chapter2;
import java.util.Scanner;
public class q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n= sc.nextInt();
		/*int [] octal = new int [100];
		
		int i=0;
		 while(n!=0)
		 {
			 octal[i]=n%8;
			 n=n/8;
			 i++;
		 }
	  for(int j=i-1;j>=0;j--)
	  {
		  System.out.print(octal[j]);
	  }*/
		
		String octa = Integer.toOctalString(n);
		System.out.println(octa);

	}

}
