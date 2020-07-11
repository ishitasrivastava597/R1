package chapter2;
import java.util.Scanner;
public class Q58 {

	public static void main(String[] args) {
	          Scanner sc= new Scanner(System.in);
	          System.out.println("enter the string");
	          String s1= sc.nextLine();
	          
	          char a1[] = s1.toCharArray();
	          
	          a1[0]=(char)(a1[0]-32);
	          
	          for(int i=1;i<s1.length();i++)
	          
	               if(a1[i]== ' ') 
	               {
	            	   i++;
	            	   a1[i]=(char)(a1[i]-32);
	            	   
	            	   
	               }
	        		  
	       
	        
	          for(int i=0;i<s1.length();i++)
	          {
	        	  System.out.print(a1[i]);
	          }
	          
	          
	          
	          }
	}


