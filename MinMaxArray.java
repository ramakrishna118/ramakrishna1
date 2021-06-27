import java.util.Arrays;

public class MinMaxArray
{
	static int getMin(int a[],int n)
	{
		return Arrays.stream(a).min().getAsInt();
		
	}
	static int getMax(int a[],int n)
	{
		return Arrays.stream(a).max().getAsInt();
	}
	public static void main(String[] args)
	{
		int a[]= {12,13,14,15,16,4576,48751,5};
		int n=a.length;
		System.out.println("Minimum elements of array:"+getMin(a , n));
		System.out.println("Maxmum elements of array:"+getMax(a , n));
	}

}
