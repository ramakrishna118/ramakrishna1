import java.util.*;

public class EvenOddNumArray
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("odd numbers");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+"");
				
			}
		}	
			System.out.println();
			System.out.println("even Numbers");
			for(int i =0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]+"");
				}
			}
				
		

	}

}
