import java.util.*;

class ArrayFirstP
{
	  
    
    public static int[] addX(int n, int arr[], int x)
    {
        int i;
  
        
        int newarr[] = new int[n + 1];
  
        
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        return newarr;
    }
  
    
    public static void main(String[] args)
    {
  
        int n = 10;
        int i;
  
       
        int arr[]
            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  
        
        System.out.println("Initial Array:\n"
                           + Arrays.toString(arr));
  
        
        int x = 50;
  
        
        arr = addX(n, arr, x);
  
        
        System.out.println("\nArray with " + x
                           + " added:\n"
                           + Arrays.toString(arr));
    }
}