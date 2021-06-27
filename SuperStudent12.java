class Superclass
{
   int num = 100;
}
class SuperStudent12 extends Superclass
{
   int num = 110;
   void printNumber(){
	
	System.out.println(super.num);
   }
   public static void main(String args[]){
	SuperStudent12 obj= new SuperStudent12();
	obj.printNumber();	
   }
}