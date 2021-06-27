import java.util.*;

public class ArithmeticOperator
{
	

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  first number:");
	int s1=sc.nextInt();
	System.out.println("enter the second number:");
	int s2=sc.nextInt();
	int add=s1+s2;
	int sub=s1-s2;
	int mul=s1*s2;
	int div=s1%s2;
	int moddiv=s1/s2;
	System.out.println("add:"+add);
	System.out.println("sub:"+sub);
	System.out.println("mul:"+mul);
	System.out.println("div:"+div);
	System.out.println("moddiv:"+moddiv);
	

	}

}
