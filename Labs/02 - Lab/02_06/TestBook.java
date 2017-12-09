import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = input.nextLine();
		System.out.print("Enter ISBN: ");
		String ISBN = input.nextLine();
		System.out.print("Enter Author: ");
		String author = input.nextLine();
		System.out.print("Enter Publisher: ");
		String publisher = input.nextLine();
		
		Book[] test = new Book[13];
		
		test[0] = new Book(name, ISBN, author, publisher);
		
		System.out.println(test[0].getBookInfo());

	}

}