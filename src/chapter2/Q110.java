package chapter2;
import java.util.Scanner;
public class Q110 {

	static  boolean powerfn(int x)
	{
	    int r;
		r=x/4;
        if(r%4!=0)
			  return false;
		else
			return true;
	}

	public static void main(String[] args) {
            
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
        boolean z= powerfn(a);
        System.out.println(z);
		
      
	}

}
