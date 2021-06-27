public class Main12345 
{
    public static void main(String... args) 
{
        Main12345.<Integer>print1();
        Main12345.<Short>print2();
        Main12345.<Byte>print3();
        Main12345.<Void>print4();
    }

    public static <T extends Integer> int print1() 
{
        System.out.println("here - Integer");
        return 0;
    }
    public static <T extends Short> short print2()
 {
        System.out.println("here - Short");
        return 0;
    }
    public static <T extends Byte> byte print3() 
{
        System.out.println("here - Byte");
        return 0;
    }
    public static <T extends Void> void print4() 
{
        System.out.println("here - Void");
    }
}
