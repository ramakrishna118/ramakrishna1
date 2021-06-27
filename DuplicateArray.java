import java.util.Arrays;

public class DuplicateArray 
{

	public static void main(String[] args) 
	{
		
		int a[]=new int[] {1,2,3,5,4,8,5,4,2,9};
		System.out.println("Duplicate elements in given array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
	}

}
