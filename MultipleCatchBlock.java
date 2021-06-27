public class MultipleCatchBlock {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("hello");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Multiple blocks");  
                  }             
               System.out.println("All catch block");    
    }  
}  