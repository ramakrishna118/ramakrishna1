class A
{
    SuperStudent45 obj;
     
    
    A(SuperStudent45 obj)
    {
        this.obj = obj;
        
     
        obj.display();
    }
     
}
 
class SuperStudent45
{
    int x = 5;
     
   
    SuperStudent45()
    {
        A obj = new A(this);
    }
     
    
    void display()
    {
        System.out.println("Value of x in Class SuperStudent45 : " + x);
    }
     
    public static void main(String[] args) {
        SuperStudent45 obj = new SuperStudent45();
    }
}