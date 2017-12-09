
public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] jaggedArray = new int[4][];
		
		for (int i = 0; i < 4; i++) {
			
			jaggedArray[i] = new int[i + 1];
			
			for (int j = 0; j < i + 1; j++) {
				
				jaggedArray[i][j] = i + j;
				
			}
			
		}
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < i + 1; j++) {
				
				System.out.print(jaggedArray[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
