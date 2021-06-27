import java.util.Scanner;

public class Gender
{
	 static String sex;
	    static String M = "male";
	    static String F = "female";

	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your sex here:");
	        sex = in.nextLine();

	        if (sex.equalsIgnoreCase(M) || sex.equalsIgnoreCase("m")) 
	        {
	            System.out.print("male");
	        } else if (sex.equalsIgnoreCase(F) || sex.equalsIgnoreCase("f"))
	        {
	            System.out.print("female");
	        }

	    }

}
