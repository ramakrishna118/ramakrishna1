import java.util.Scanner;

public class StringEqual
{

	public static void main(String[] args)
	{
		String s1=new String("rama");
		String s2=new String("krishna");
		String s3=new String("rama");
		String s4=new String("rama");
		String s5=new String("mannepalli");
		//comparing s1 and s2
		System.out.println("comparing"+s1+"and"+s2+":"+s1.equals(s2));
		// comparing s2 and s3
		System.out.println("comparing"+s2+"and"+s3+":"+s2.equals(s3));
		// comparing s3 and s4
		System.out.println("comparing"+s3+"and"+s4+":"+s3.equals(s4));
		//comparing s4 and s5
		System.out.println("comparing"+s4+"and"+s5+":"+s4.equals(s5));
		
		

	}

}
