abstract class Base
 {
    void fun() { System.out.println("Base fun() called"); }
}
  
class Derived extends Base 
{
}
  
class MainOf
{
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.fun();
    }
}