import java.io.*;
 
class Addition
 {
 
    // adding two integer values.
    public int add(int a, int b)
    {
 
        int sum = a + b;
        return sum;
    }
 
    // adding three integer values.
    public int add(int a, int b, int c)
    {
 
        int sum = a + b + c;
        return sum;
    }
}
 
class MethodOverLoading {
    public static void main(String[] args)
    {
 
        Addition ob = new Addition();
 
        int sum1 = ob.add(1, 2);
        System.out.println("sum of the two integer value :"
                           + sum1);
        int sum2 = ob.add(1, 2, 3);
        System.out.println(
            "sum of the three integer value :" + sum2);
    }
}