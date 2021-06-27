import java.util.*;

public class EvenOrOddUsingSwitch 
{
	

	public static void main(String[] args)
	{
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		switch(n%2)
		{
		case 0:
		System.out.println(n +  "is even");
		break;
		case 1:
			System.out.println(n +  "is odd");
		}

	}

}
