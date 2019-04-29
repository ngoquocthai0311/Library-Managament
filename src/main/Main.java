package main;

import java.util.ArrayList;
import java.util.Scanner;

import Base.Book;
import Base.Info;
import proceed.Datamanage;
import proceed.Features;
import proceed.Managing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Boolean check_status = true;
			while (check_status) {
				System.out.println("Welcome to Library Management Early Access Program: ");
				System.out.println("Please choose the options below: ");
				System.out.println("\t1. The student");
				System.out.println("\t2. The Librarian");
				System.out.println("\t3. Exist the program!!");
				try {
					int option = scan.nextInt();
					switch (option) {
					case 1:
						Student_features();
						break;
					case 2:
						Librarian_features();
						break;
					default:
						check_status = false;
						break;
					}
				} catch (Exception e) {
					check_status = false;
				}
			}
		System.out.println("Thank you for using the program!");
		System.out.println("If you have any new ideas or give me some pieces of advice, please contact me via my Facebook account.");
	}
	
	public static void Student_features() {
		Scanner option1 = new Scanner(System.in);
		Boolean check_status = true;
		while (check_status) {
			System.out.println("Welcome user! Please choose the options below");
			System.out.println("\t1. Sign up: ");
			System.out.println("\t2. Sign in: ");
			try {
				int option_student = option1.nextInt();
				switch (option_student) {
				case 1:
					Info student = new Info();
					do {
					student = Managing.userinput();
					if (student == null) {
						System.out.println(">> Error >> Please enter again!!");
					}
					} while (student == null);
					Datamanage.write(Datamanage.FILE_USER, student);
					break;
				case 2:
					Features.Checking_User();
					break;
				default:
					check_status = false;
					break;
				}
			} catch (Exception e) {
				check_status = false;
			} 
		}
	}
	
	public static void Librarian_features() {
		Scanner option2 = new Scanner(System.in);
		Boolean check_status = true;
		while (check_status) {
			System.out.println("Welcome Please choose the options below");
			System.out.println("\t1. Have a new book ?:");
			System.out.println("\t2. A list of all the users");
			System.out.println("\t3. A list of books");
			System.out.println("\t4. Find a book");
			System.out.println("\t5. Exist the current menu");
			try {
				int Librarian_option = option2.nextInt();
				switch (Librarian_option) {
				case 1:
					Book book = new Book();
					do {
						book = Managing.bookinput();
						if (book == null) {
							System.out.println("Please enter the book again !!");
						}
					} while (book == null);
					Datamanage.write(Datamanage.FILE_BOOK, book);
					break;
				case 2:
					Features.getTotal_User();
					Features.Userlistouput();
					break;
				case 3:
					Features.getTotal_Book();
					Features.Booklistouput();
					break;
				case 4:
					Sorting_book();
					break;
				default:
					check_status = false;
					break;
				}
			} catch (Exception e) {
				check_status = false;
			} 
		}
	}
	public static void Sorting_book() {
		Scanner option_3 = new Scanner(System.in);
		Boolean check_option_3 = true;
		while (check_option_3) {
			try {
				System.out.println("Please one of the options below!");
				System.out.println("\t1. IBN");
				System.out.println("\t2. Title");
				System.out.println("\t3. Genre");
				System.out.println("\t4. Author");
				System.out.println("\t5. Publisher");
				System.out.println("\t6. Published year");
				System.out.println("\t7. Exist the current menu");
				int check_option3 = option_3.nextInt();
				switch(check_option3) {
				case 1:
					Features.Sorting_IBN();
					break;
				case 2:
					Features.Sorting_title();
					break;
				case 3:
					Features.Sorting_Type();
					break;
				case 4:
					Features.Sorting_author();
					break;
				case 5:
					Features.Sorting_Publisher();
					break;
				case 6:
					Features.Sorting_Publishedyear();
					break;
				default:
					check_option_3 = false;
					break;
				}
			} catch (Exception e) {
				check_option_3 = false;
				}
		}
	}
}