package chapter2;

public class Q50 {

	public static void main(String[] args) {
	     System.out.println("divided by 3");
		for(int i=1;i<99;i++)
		{
			if(i%3==0)
			{
				
				System.out.print(i+",");
			}		
		}
		System.out.println();
		System.out.println();
		System.out.println("divided by 5");
		for(int j=1;j<=99;j++)
		{
			if(j%5==0)
				System.out.print(j+",");
		}
		System.out.println();
		System.out.println();
		System.out.println("divided by 3&5");
		for(int k=1;k<=99;k++)
		{
			if( k%3==0&&k%5==0)
			{
			   System.out.print(k+",");	
			}
		}

	}

}
