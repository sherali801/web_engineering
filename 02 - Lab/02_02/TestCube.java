import java.util.Scanner;

public class TestCube {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Parameter for the Cube: ");
		
		double parameter = input.nextDouble();
		
		Cube cube = new Cube(parameter);
		
		System.out.println("The Volume of the Cube: " + cube.volume());
		
	}

}
