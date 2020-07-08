package chapter2;
import java.util.Scanner;
public class Q44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
	 int n= sc.nextInt();
	 int i=(n+(n*10));
	 int j=(i+(n*100));
	 int sum=n+i+j;
	  System.out.println(n+"+"+ i+"+"+j+"+"+"="+sum);

	}

}
