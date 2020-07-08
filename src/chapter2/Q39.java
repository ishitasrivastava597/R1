package chapter2;

public class Q39 {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int count=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				for(k=1;k<=4;k++)
				{
					if(k!=i && k!=j && i!=j)
					{
						count++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("the total numbers are"+count);
		
	}

}
