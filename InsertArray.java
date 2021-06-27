import java.util.*;

public class InsertArray
{
	

	public static void main(String[] args)
	{
		int n,pos,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want:");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("enter all elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			
		}
		System.out.println("enter the position where you want to insert elements");
		pos=sc.nextInt();
		System.out.println("enter the elements you want insert");
		x=sc.nextInt();
		for(int i=(n-1);i>(pos-1);i--)
		{
			a[i+1]=a[i];
			
		}
		a[pos-1]=x;
		System.out.println("After inserting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println(a[n]);
		
		
		
	}

}
