import java.util.*;

public class EvenNum
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int i=2;
		while(i<=a)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}
