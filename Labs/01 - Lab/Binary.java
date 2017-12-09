import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you want to start(Y/N). ");
		
		char choice = input.next().charAt(0);
		
		if (choice == 'Y' || choice == 'y') {
			
			do {
				
				System.out.print("Enter a Number and I will convert it to Binary Code: ");
				
				long num = input.nextLong();
				
				if (num > 0) {
					
					long num1 = num;
					
					int length = 0;
					
					while (num1 > 0) {
						
						num1 = num1 / 2;
						
						length++;
						
					}
					
					long[] binary = new long[length];
					
					num1 = num;
					
					while (num1 > 0) {
						
						binary[length - 1] = num1 % 2;
						
						length--;
						
						num1 = num1 / 2;
						
					}
					
					System.out.println("You Entered " + num);
					
					System.out.print(num + " in binary is ");
					
					for (int i = 0; i < binary.length; i++) {
						System.out.print(binary[i]);
					}
					
					System.out.println();
					
				} else {
					
					System.out.println("Enter a Positive Number");
					
				}
				
				System.out.print("Do you want to continue(Y/N). ");
				
				choice = input.next().charAt(0);
				
			} while(choice == 'Y' || choice == 'y');
			
		}
		
	}

}
