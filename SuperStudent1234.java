class SuperStudent1234
{
    int a;
    int b;
 
   
    SuperStudent1234()
    { 
        this(10, 20);
        System.out.println("hello krishna \n");
    }
     
    
    SuperStudent1234(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("hello rama");
    }
 
    public static void main(String[] args)
    {
        SuperStudent1234 object = new SuperStudent1234();
    }
}