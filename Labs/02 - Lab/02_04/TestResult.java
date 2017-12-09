import java.util.Scanner;

public class TestResult {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Total Marks: ");
		double totalMarks = input.nextDouble();
		System.out.print("Enter Marks Obtained: ");
		double marksObtained = input.nextDouble();
		
		Result result = new Result(totalMarks, marksObtained);
		
		while (true) {
			System.out.print("Press 1 to see Total Marks.\nPress 2 to see Obtained Marks.\nPress 3 to modify Obtained Marks.\nPress 4 to exit.\nEnter Choice: ");
			
			int choice = input.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Total Marks: " + result.getTotalMarks());
				break;
				
			case 2:
				System.out.println("Marks Obtained: " + result.getMarksObtanied());
				break;
				
			case 3:
				System.out.println("It is illegal to modify Obtained Marks.");
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice.");
				
			}
			
		} 
		
	}

}
