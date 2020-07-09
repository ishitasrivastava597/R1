package chapter2;
import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a= sc.nextInt();
		int b,c,d;
		b= a%60;
		c= a/60;
		d= c%60;
		c=c/60;
		
		System.out.println(c+":"+d+":"+b);
		

	}

}
