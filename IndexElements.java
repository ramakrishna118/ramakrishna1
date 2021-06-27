import java.util.List;
import com.google.common.primitives.Ints;
public class indexElements
{
    
    public static int findIndex(int arr[], int t)
    {
        return Ints.indexOf(arr, t);
    }
    
    public static void main(String[] args)
    {
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        System.out.println("Index position of 5 is: "
                           + findIndex(my_array, 5));
        System.out.println("Index position of 7 is: "
                           + findIndex(my_array, 7));
    }
}