public class Prime {

	private int minimum;
	private int maximum;

	public void setMinimum(int minimum) { this.minimum = minimum; }

	public void setMaximum(int maximum) { this.maximum = maximum; }

	public int getMinimum() { return this.minimum; }

	public int getMaximun() { return this.maximum; }

	public void checkRange() throws Exception {
		if (this.getMinimum() >= this.getMaximun()) {
			throw new Exception("Invalid Range: Minimum is Greater than or Equal to Maximum");
		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int countPrime() {
		int count = 0;
		for (int i = this.getMinimum(); i <= this.getMaximun(); i++) {
			if (this.isPrime(i)) {
				count++;
			}
		}
		return count;
	}

}
