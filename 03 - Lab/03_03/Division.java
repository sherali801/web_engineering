import java.util.Scanner;

public class Division {

	public static float calculateQuotient(int x, int y) throws ArithmeticException {
		if (y == 0) {
			throw new ArithmeticException("Division by Zero is Illegal");
		} else {
			return (float) x / (float) y;
		}
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter First Number: ");
			int x = input.nextInt();
			System.out.print("Enter Second Number: ");
			int y = input.nextInt();
			float result = calculateQuotient(x, y);
			System.out.println(x + " / " + y + " = " + result);
		} catch (ArithmeticException aEx) {
			System.out.println(aEx.getMessage());
		}
	}

}
