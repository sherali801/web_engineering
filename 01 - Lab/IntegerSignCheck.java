import java.util.Scanner;

public class IntegerSignCheck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		
		int num = input.nextInt();
		
		if (num >= 0) {
			
			System.out.println(num + " is positive.");
			
		} else {
			
			System.out.println(num + " is negative.");
			
		}

	}

}
