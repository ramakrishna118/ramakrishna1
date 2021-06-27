import java.util.*;  
public class IoException
{    
    public static void main(String[] args) 
    {  
          
          Scanner scan = new Scanner("Hello World! Hello JavaTpoint.");  
            
          System.out.println("" + scan.nextLine());  
          //Check if there is an IO exception  
          System.out.println("Exception Output: " + scan.ioException());  
          scan.close();   
    }  
}  