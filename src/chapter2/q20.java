package chapter2;
import java.util.Scanner;

public class q20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the decimal number");
        int n = sc.nextInt();
        
        String hex= Integer.toHexString(n);
        System.out.println(hex);

	}

}
