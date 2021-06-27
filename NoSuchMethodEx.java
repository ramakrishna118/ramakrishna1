class NoSuchMethodEx {
public NoSuchMethodEx()
    {
        Class i;
        try {
            i = Class.forName("java.lang.String");
            try {
                Class[] p = new Class[5];
            }
            catch (SecurityException e) {
                e.printStackTrace();
            }
            catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
  
public static void main(String[] args)
    {
        new NoSuchMethodEx();
    }
}