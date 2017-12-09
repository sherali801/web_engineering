import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		try {
			Prime p = new Prime();
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Minimum: ");
			int minimum = input.nextInt();
			p.setMinimum(minimum);
			System.out.print("Enter Maximum: ");
			int maximum = input.nextInt();
			p.setMaximum(maximum);
			p.checkRange();
			System.out.println("Count of Prime Numbers: " + p.countPrime());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
