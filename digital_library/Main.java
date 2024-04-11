package digital_library;

import java.util.Scanner;

public class Main {
	public static final String RESET = "\u001B[0m";
	public static final String YELLOW = "\u001B[33m";
	public static final String Magenta = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookServiceImpl service = new BookServiceImpl();

		do {
			System.out.println(YELLOW+"Welcome to DIGITAL LIBRARY"+RESET);
			System.out.println("1.Add Book\n" + "2.Show All Books\n" + "3.Show Available Books\n" + "4.Borrow Book\n"
					+ "5.Return Book\n" + "6.Exit\n");

			System.out.println(CYAN+"Enter Your Choice :"+RESET);
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				service.addBook();
				break;
			case 2:
				service.showAllBooks();
				break;
			case 3:
				service.showAllAvailableBooks();
				break;
			case 4:
				service.borrowBook();
				break;
			case 5:
				service.returnBook();
				break;
			case 6:
				System.out.println(Magenta + "Thank you for Using DIGITAL LIBRARY !!!" + RESET);
				System.exit(0);
				break;
			default:
				System.out.println(YELLOW + "Please Enter Valid Choice !\n" + RESET);

			}
		} while (true);
	}
}
