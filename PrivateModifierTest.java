class PrivateModifier 
{                           
     private int count = 10;
     private void printMessage() 
{
     System.out.println("count=:"+count);
   }                 
 }
      
 class PrivateModifierTest  
{
	private int num=20;
     public static void main(String [] args) 
{                
        PrivateModifierTest pmf = new PrivateModifierTest();                              
        pmf.printDetail();
        System.out.println("num = "+pmf.num);
	PrivateModifier pm=new PrivateModifier();
     }
	private void printDetail()
{
	System.out.println("private modifier program");
}
 }
