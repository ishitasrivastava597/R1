package chapter2;
import java.util.Scanner;

public class Q71 {

	public static void main(String[] args) {
             
		 Scanner sc= new Scanner (System.in);
		 System.out.println("enter the string");
		 String s1= sc.nextLine();
		 char c1[]=s1.toCharArray();
		 char c2[]= new char[3];
		 int i;
		 if(s1.length()>=3)
		 {
		 for( i=0;i<3;i++)
		 {
			 c2[i]=c1[i];
		 }
		}
		 else
		 {
			 for( i=0;i<3;i++)
			 {
				 c2[i]='#';
			 }
				 
		 }
		 
		 for(i=0;i<3;i++)
		 {
			 System.out.print(c2[i]);
		 }
		 

	}

}
