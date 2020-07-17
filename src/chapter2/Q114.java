package chapter2;
import java.util.Scanner;
public class Q114 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size for aar1");
		 int n1= sc.nextInt();
		 int a1[] = new int [n1];
		 System.out.println("enter the size for arr2");
		 int n2=sc.nextInt();
		 int a2[] = new int [n2];
		 
	    int i,j,k,z;
	    System.out.println("enter the values in array1");
	    
	    for( i=0;i<n1;i++)
	          a1[i]=sc.nextInt();
	    
	    System.out.println("enter the values in array 2");
	    
	    for( i=0;i<n2;i++)
	    	 a2[i]=sc.nextInt();
	    int l=n1+n2;
	    
	    int a3[]= new int [l];
	    
	    for(i=0,j=0;i<l&&j<n1;i++,j++)
	    {
	    	a3[i]=a1[j];
	    }
	    
	     z=i;
	     
	     
	    for(i=z,k=0;i<l&&k<n2;i++,k++)
	    {
	    	a3[i]=a2[k];
	    }
	   
	        
	        
	    for(i=0;i<l;i++)
	    {
	    	for(j=i+1;j<l;j++)
	    	{
	    	if(a3[i]>a3[j])
	    	{
	    		int temp=a3[i];
				 a3[i]=a3[j];
				 a3[j]=temp;
			  }
	    	
	       }
       }
	    int count=0;
	    for(i=0;i<l;i++)
	    {
	    	for(j=i+1;j<l;j++)
	    	{
	    		if(a3[i]==a3[j])
	    			 count++;
	    	}
	    }
	    int n=l-count;
	    
	    int a4[]=new int[n];
	    a4[0]=a3[0];
	    for(i=1,j=0;i<l&&j<n;)
	    {
	    	if(a4[j]!=a3[i])
	    	{
	    		a4[j+1]=a3[i];
	    		j++;
	    		i++;
	    	}
	    	else
	    		i++;
	    }
	    for(i=0;i<n;i++)
	    	System.out.print(a4[i]+",");
	    
	}
}


