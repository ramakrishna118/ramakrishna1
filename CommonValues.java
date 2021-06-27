import java.util.*;
import java.util.HashSet;

public class CommonValues 
{
	

	public static void main(String[] args)
	{
		Integer[]a1= {1,5,4,6,7};
		Integer[]a2= {1,2,4,1,7};
		HashSet<Integer>set1=new HashSet<>(Arrays.asList(a1));
		HashSet<Integer>set2=new HashSet<>(Arrays.asList(a2));
		set1.retainAll(set2);
System.out.println(set1);
	}

}
