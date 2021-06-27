import java.util.*;

public class StringIndex
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the line:");
		String input=sc.nextLine();
		System.out.println("please enter asubstring");
		String substring=sc.nextLine();
		sc.close();
		int index=0;
		List<Integer>indexes=new ArrayList<>();
		while(index<input.length())
		{
			int i=input.indexOf(substring,index);
			if(i==-1)
				break;
			indexes.add(i);
			index=i+1;
		}
		System.out.println("the sbstring found at indexes:"+indexes);
	}

}
