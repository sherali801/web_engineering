import java.util.Scanner;

public class SumAndAverage {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Upper Bound: ");
		
		int num = input.nextInt();
		
		int sum = (num * (num + 1)) / 2;
		
		int avg = sum / num;
		
		System.out.println("The sum is " + sum);
		
		System.out.println("The average is " + avg);
		
	}
	
}
