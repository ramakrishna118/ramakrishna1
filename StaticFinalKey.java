class StaticFinalVariable 
{ 
    static final int a;
    static
    {
        a = 5;
    }
} 
public class StaticFinalKey
{ 
    public static void main(String args[]) 
    { 
        StaticFinalVariable object = new StaticFinalVariable();
        System.out.println("Value of static final variable = "+ StaticFinalVariable.a);
        
        
    } 
}