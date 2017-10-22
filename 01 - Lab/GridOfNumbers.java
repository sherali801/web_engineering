
public class GridOfNumbers {
	
	public static void main(String[] args) {
		
		for (int row = 1; row <= 5; row++) {
			
			for (int col = row; col <= row + 4; col++) {
				
				System.out.print(col + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
