import java.util.Scanner;

public class EqualNotEqualOperators
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the two numbers check numbers:");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		if(a1==a2)
		{
			System.out.println("Enter the two numbers is equal");
		}
		else if(a1!=a2)
		{
			System.out.println("Enter the two numbers is not equal");
		}
			
		

	}

}
