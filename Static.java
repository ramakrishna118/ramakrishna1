import java.io.*;
public class Static
{
	int a=10;
	String s="rama";
	static int b=90;
	static String c="staticrama";
	public static int m1()
	{
		Static s1=new Static();
		System.out.println(s1.s);
		return 5;
		
	}
		int m2()
		{
			int x=m1();
			System.out.println(x);
			System.out.println(b);
			return 100;
			
		}
		public static void main(String[] args)
		{
			Static s=new Static();
			System.out.println(s.a);
			System.out.println(Static.b);
			s.m2();
			
		}
}
