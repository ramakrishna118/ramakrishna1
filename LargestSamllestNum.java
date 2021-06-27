import java.util.*;

public class LargestSmallestNum 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {55,4,7,66,48,2,98};
		int smallest=a[0];
		int largest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]  >largest)
				largest=a[i];
			else if(a[i]  < smallest)
				smallest=a[i];
			
		}
		System.out.println("Largest number is:"+largest);
		System.out.println("Smallest number is:"+smallest);
		
		
		

	}

}
