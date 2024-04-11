package digital_library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[0m";
	private static Pattern ID_PATTERN = Pattern.compile("^\\d{1,4}$");
	private static Pattern Title_Pattern = Pattern.compile("^[a-zA-Z1-9 ]+$");
	private static Pattern Author_Pattern = Pattern.compile("^[a-zA-Z ]+$");
	private static Pattern PublishYear_Pattern = Pattern.compile("^\\d{4}$");
	Scanner sc = new Scanner(System.in);
	List<Book> books = new ArrayList<>();

	public String validateId() {
		String bookid;
		while (true) {
			System.out.println("Enter Book ID ");
			bookid = sc.nextLine();

			if (!ID_PATTERN.matcher(bookid).matches()) {
				System.out.println(RED + "SORRY ! PLEASE ENTER VALID BOOK ID " + RESET);
			} else {
				break;
			}
		}
		return bookid;
	}

	public String validateTitle() {
		String title;
		while (true) {
			System.out.println("Enter Title");
			title = sc.nextLine();
			if (!Title_Pattern.matcher(title).matches()) {
				System.out.println(RED + "Enter valid Title" + RESET);
			} else {
				break;
			}
		}
		return title;
	}

	public String validateAuthor() {
		String author;
		while (true) {
			System.out.println("Enter Author");
			author = sc.nextLine();
			if (!Author_Pattern.matcher(author).matches()) {
				System.out.println(RED + "Enter valid Author" + RESET);
			} else {
				break;
			}
		}
		return author;
	}

	public String validatePublishYear() {
		String year;
		while (true) {
			System.out.println("Enter Publish Year of Book ");
			year = sc.nextLine();
			if (!PublishYear_Pattern.matcher(year).matches()) {
				System.out.println(RED + "Enter valid Publish Year" + RESET);
			} else {
				break;
			}
		}
		return year;
	}

}
