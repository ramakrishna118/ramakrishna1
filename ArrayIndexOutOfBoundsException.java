import java.util.Scanner;

public class ArrayIndexOutOfBoundsException
 {

	public static void main(String[] args)
 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of int array:");
		int size = sc.nextInt();
		int[] intArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter int value at index " + i + ":");
			intArray[i] = sc.nextInt();
		}
		System.out.println("Enter array index to get the value:");
		int index = sc.nextInt();
		sc.close();

		System.out.println("Value at " + index + " = " + intArray[index]);
	}
}