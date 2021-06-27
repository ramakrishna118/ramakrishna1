public class ClassNotFound
{
      
    public static void main(String args[]) 
    {
        try 
        {
            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
