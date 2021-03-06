import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, -8765309, 31415, 271828};
		int toFind;
		int notFound = 0;
		
		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");
		
		System.out.print("Orders: ");
		for (int num : orderNumbers) {
			System.out.print(num + "  ");
		}
		System.out.println();
		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();
		
		for (int num : orderNumbers){
			if (num == toFind) {
				System.out.println(num + " found.");
			} else {
				notFound++;
			}
		}
		
		if (notFound >= 6) 
			System.out.println("Order not found.");
	}
}