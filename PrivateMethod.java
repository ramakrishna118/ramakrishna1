import java.lang.reflect.Method;

public class PrivateMethod
{

	
	  
	// The class contains a private method
	  
	    // Private method
	    private void Demo_private_Method()
	    {
	        System.out.println("Private Method "
	                           + "called from outside");
	    }
	  
	    // Public method
	    public void printData()
	    {
	        System.out.println("Public Method");
	    }
	}
	  
	// Driver code
	class GFG {
	  
	    public static void main(String[] args)
	        throws Exception
	    {
	        PrivateMethod c = new PrivateMethod();
	        Method m;
	  
	        // Using getDeclareMethod() method
	        Method method[]
	            = PrivateMethod.class.getDeclaredMethods();
	  
	        for (int i = 0; i < method.length; i++) {
	            String meth
	                = new String(method[i].toString());
	            if (meth.startsWith("private")) {
	  
	                String s = method[i].toString();
	  
	                int a = s.indexOf(".");
	                int b = s.indexOf("(");
	  
	                // Method name retrieved
	                String method_name = s.substring(a + 1, b);
	  
	                // Print method name
	                System.out.println("Method Name = "
	                                   + method_name);
	  
	                // Using getDeclareMethod() method
	                m = PrivateMethod.class.getDeclaredMethod(method_name);
	  
	                // Using setAccessible() method
	                m.setAccessible(true);
	  
	                // Using invoke() method
	                m.invoke(c);
	            }
	        }
	    }
	
	

	

}
