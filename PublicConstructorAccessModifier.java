package abcpackage;

public class Addition 
{

   public int addTwoNumbers(int a, int b)
{
	return a+b;
   }
}


package xyzpackage;
import abcpackage.*;
class PublicConstructorAccessModifier{
   public static void main(String args[])
{
      Addition obj = new Addition();
      System.out.println(obj.addTwoNumbers(100, 1));
   }
}
