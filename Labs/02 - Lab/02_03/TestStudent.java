import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student[] students = new Student[3];
		
		String name;
		
		String rollNo;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Enter Student Name: ");

			name = input.nextLine();

			System.out.print("Enter Student Roll No: ");

			rollNo = input.nextLine();
			
			students[i] = new Student(name, rollNo);
			
		}

		Student.changeUni("PUCIT");
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println(students[i].getStudentInfo());
			
		}
		
	}

}
