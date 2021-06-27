import java.util.Scanner;
public class LargestNum
{
	public static void main(String[] args)
	{
		int a1=20,a2=30,a3=40;
		if(a1>=a2 && a1>=a3)
			System.out.println(a1+"is the largest number");
		else if(a2>=a1 && a2>=a3)
			System.out.println(a2+"is the largest number");
		else
			System.out.println(a3+"is the largest number");
				
    }
}