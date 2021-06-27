import java.util.Scanner;

public class PrimeNum
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("Notprime");
		else
			System.out.println(" prime");

	}

}
