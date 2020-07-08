package chapter2;
import java.util.Scanner;
public class q22 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		/*int s=0;
		int n=0;
		System.out.println("enter binary number");
		int binary= sc.nextInt();
		int temp;
		
		while(binary!=0)
		{
			temp=binary%10;
			s+=temp*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
		
		System.out.println(s);
		*/
		System.out.println("enter the string");
		String s1= sc.nextLine();
		int decimal = Integer.parseInt(s1,2);
		System.out.println(decimal);
		
		

	}

}
