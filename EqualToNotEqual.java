import java.util.Scanner;

public class EqualToNotEqual
{
	

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to check two equality numbers:");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		if(a1==a2)
		{
			System.out.println("Equal numbers");
			
		}
		else if(a1!=a2)
			System.out.println("Not equal numbers");

	}

}
