import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] != str[(str.length - 1) - i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter String: ");
			String str = input.nextLine();
			FileWriter fr = new FileWriter("palindrome.txt");
			fr.write(str);
			fr.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			FileReader fr = new FileReader("palindrome.txt");
			String str = "";
			int i = 0;
			while ((i = fr.read()) != -1) {
				str += (char) i;
			}
			String[] strings = str.split(" ");
			char[] charArray;
			for (i = 0; i < strings.length; i++) {
				charArray = strings[i].toCharArray();
				if (isPalindrome(charArray)) {
					System.out.println(strings[i]);
				}
			}
			fr.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
