package chapter2;
public class Q66 {
	static boolean isprime (int x)
	{
		int count =0;
		for(int i=2;i<=x;i++)
		{
			if(x%i==0)
				 count++;
		 }
		
		if(count>1) 
		       return false;
		
          else
			 return true;
		
	}
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=2;;i++)
		{
		       if(isprime(i)==true)
		       {
			    count++;
				sum=sum+i;
             }
		      if(count==100)
		    	  break;
}
		System.out.println("the sum of first 100 prime nos is"+" "+sum);
}
}