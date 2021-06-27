package testpack;
 
 public class PublicModifier {                           
    public int count = 10;       
    public void printMessage() {
       System.out.println("Public modifier program");
     }                 
  }
 
 package mypack; 
 import testpack.PublicModifier;
      
 public class PublicModifierTest {
    public static void main(String [] args) {                
       PublicModifier pmf = new PublicModifier();                             
       pmf.printMessage();
       System.out.println("count = "+pmf.count);           
    }
 }
