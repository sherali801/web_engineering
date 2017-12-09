public class TestArmstrong extends Armstrong {

	public void armstrongNumbers() {
		int numOfDigits = 0;
		int num = 0;
		int sum = 0;
		int remainder = 0;
		for (int i = 0; i < 1000; i++) {
			numOfDigits = (int) Math.floor(Math.log10(i)) + 1;
			num = i;
			sum = 0;
			remainder = 0;
			while (num > 0) {
				remainder = num % 10;
				num = num / 10;
				sum = sum + ((int) Math.pow(remainder, numOfDigits));
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		TestArmstrong armstrong = new TestArmstrong();
		armstrong.armstrongNumbers();
	}

}
