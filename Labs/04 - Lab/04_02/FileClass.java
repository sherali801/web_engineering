import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
	
	public static void prinArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);			
		}
	}
	
	private static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countPrime(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static String countEvenOdd(int[] arr) {
		int evenCount = 0;
		int countOdd = 0;
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				countOdd++;
			}
		}
		return "Even: " + evenCount + "\nOdd: " + countOdd + "\n";
	}
	
	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;
		String str = "";
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter File Name: ");
		String fileName = input.nextLine();
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				System.out.println("File does not exist, creating new file with the name of " + fileName);
				file.createNewFile();
			} else {
				if (file.length() == 0) {
					throw new Exception("File is Empty.");
				} else {
					fr = new FileReader(fileName);
					str = "";
					i = 0;
					while ((i = fr.read()) != -1) {
						str += (char) i;
					}
					System.out.println("Content of " + fileName + "\n" + str);
					fr.close();
				}
			}
		} catch (IOException ioEx) {
			System.out.println(ioEx);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			fr = new FileReader("File.txt");
			fw = new FileWriter(fileName);
			str = "";
			i = 0;
			while ((i = fr.read()) != -1) {
				str += (char) i;
			}
			fw.write(str);
			fr.close();
			fw.close();
			
			fr = new FileReader(fileName);
			str = "";
			i = 0;
			while ((i = fr.read()) != -1) {
				str += (char) i;
			}
			fr.close();
			
			fw = new FileWriter("output.txt", true);
			
			int fac = 0;
			int facResult = 0;
			int primeCount = 0;
			String evenOddResult = "";
			int[] primes;
			int[] evenOdd;
			
			while (true) {
				System.out.println(str);
				fac = (int) ((Math.random() * 10) + 1);
				
				primes = new int[10];
				
				for (i = 0; i < 10; i++) {
					primes[i] = (int) ((Math.random() * 10) + 1);
				}
				
				evenOdd = new int[10];
				
				for (i = 0; i < 10; i++) {
					evenOdd[i] = (int) ((Math.random() * 10) + 1);
				}
				System.out.print("Enter Choice: ");
				i = input.nextInt();
				switch (i) {
				case 1:
					facResult = factorial(fac);
					fw.write(facResult + "\n");
					System.out.println("Factorial of " + fac + ": " + facResult);
					break;
				case 2:
					primeCount = countPrime(primes);
					fw.write(primeCount + "\n");
					prinArray(primes);
					System.out.println("Prime Count: " + primeCount);
					break;
				case 3:
					evenOddResult = countEvenOdd(evenOdd);
					fw.write(evenOddResult + "\n");
					prinArray(evenOdd);
					System.out.println(evenOddResult);
					break;
				case 4:
					fw.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Chocie.");
					break;
				}
			}
		} catch (IOException ioEx) {
			System.out.println(ioEx);
		}
		
	}
	
}
