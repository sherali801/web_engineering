public class ArrayLength {

	public static int getLength(int[] array) {
		int size = 0, a;
		try {
			for (size = 0; ; size++) {
				a = array[size];
			}
		} catch (Exception e) {
			return size;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		int size = getLength(array);
		System.out.println("Size: " + size);
	}
}
