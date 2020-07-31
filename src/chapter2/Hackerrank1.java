package chapter2;
import java.util.Scanner;
public class Hackerrank1 {
	
	
	
	 static void password (String s1)
	 {
		 int i;
		 int j=s1.length();
		 int k;
		 int p;
		 char c1[]=s1.toCharArray();
		 int count1=0;
		 int count2=0;
		 for(i=0;i<j;i++)
		 {
			 if(c1[i]=='*'||c1[i]==48)
			 { 
				 count1=count1+1;
			}
			 if(c1[i]>48 && c1[i]<=57)
		        {
				 count2=count2+1;
		        }
		 }
		int n=j-count1; 
        char c2[]=new char[n];
		char c3[]=new char[count2];

		for(i=0,k=count2-1;i<j&&k>=0;i++)
		{
			if(c1[i]>48 && c1[i]<=57)
			{
				c3[k]=c1[i];
				 k--;
		} 
	}
             for(i=0,p=0,k=0;i<j&&p<count1&&k<count2;i++)
              {
            	 
           if(c1[i]>=65&&c1[i]<=90&&c1[i+1]>=97&&c1[i+1]<=122)
           {
        	   c2[p]=c1[i+1];
        	   c2[p+1]=c1[i];
        	   p++;
        	 
           
           if(c1[i]==0)
           {
        	   c2[p]=c3[k];
        	   p++;
        	   k++;
        	   
           }
           
       }    
           
}
             for(i=0;i<count2;i++)
            	 System.out.println(c2[i]);
        
	 }
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s= sc.nextLine();
		password(s);

	}

}
