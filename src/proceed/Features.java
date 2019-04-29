package proceed;

import java.util.ArrayList;
import java.util.Scanner;

import Base.Book;
import Base.Info;
import main.Main;

public class Features {
	public static void Booklistouput() {
		ArrayList<Book> listbook = new ArrayList<Book>();
		listbook = Datamanage.read_book();
		for (int i = 0; i <= listbook.size(); i++) {
			Managing.Bookoutput(listbook.get(i));
		}
	}
	 public static void getTotal_Book() {
		 int totalBook = 0;
		 ArrayList<Book> listbook = new ArrayList<Book>();
		 listbook = Datamanage.read_book();
		 totalBook = listbook.size();
		 System.out.println("The total number of the books is: " + totalBook);
	 }
	 public static void Userlistouput() {
			ArrayList<Info> listuser = new ArrayList<Info>();
			listuser = Datamanage.read_user();
			for (int i = 0; i <= listuser.size(); i++) {
				Managing.Useroutput(listuser.get(i));;
			}
		}
	 public static void getTotal_User() {
		 int totalUser = 0;
		 ArrayList<Info> listuser = new ArrayList<Info>();
		 listuser = Datamanage.read_user();
		 totalUser = listuser.size();
		 System.out.println("The total number of students is: " + totalUser);
	 }
	 public static void Checking_User() {
		 Scanner signin = new Scanner(System.in);
		 System.out.println("PLease enter user name");
		 String username = signin.nextLine();
		 System.out.println("Please enter password");
		 String pass = signin.nextLine();
		 ArrayList<Info> userlist = new ArrayList<Info>();
		 userlist = Datamanage.read_user();
		 String check_user, check_pass;
		 int count = 0;
		 for (int i = 0; i <= userlist.size(); i++) {
			 Info user = new Info();
			 user = userlist.get(i);
			 check_user = userlist.get(i).getUsername();
			 check_pass = userlist.get(i).getPassword();
			 if ((check_user.contains(username)) && (check_pass.contains(pass))) {
				 System.out.println("\t Welcome user " + user.getName());
				 System.out.println("-------------------------------------------------------------");
				 Student_features();
			 }
		 }
	 }
	 
	 public static void Student_features() {
		 Scanner choice = new Scanner(System.in);
		 Boolean check = true;
		 while (true) {
			 try {
				 System.out.println("Please choose the options the below ");
				 System.out.println("\t1. List of all the books");
				 System.out.println("\t2. Find a book");
				 int choice_student = choice.nextInt();
				 switch (choice_student) {
				 case 1:
					 getTotal_Book();
					 Booklistouput();
					 break;
				 case 2:
					 Main.Sorting_book();
					 break;
			     default:
				 check = false;
				 }
			 } catch (Exception e) {
				 check = false;
			 }
		 }
	 }
	 public static void Sorting_title() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the title of the book");
		 String title = scan.nextLine();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 String check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getTitle();
			 if (check.contains(title)) {
				 Managing.Bookoutput(book);
			 }
		 }
	 }
	 public static void Sorting_IBN() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the IBN of the book");
		 String IBN = scan.nextLine();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 String check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getIBN();
			 if (check.contains(IBN)) {
				 Managing.Bookoutput(book);
			 }
		 }
	 }
	 
	 public static void Sorting_Type() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the genre of the book");
		 String Type = scan.nextLine();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 String check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getType();
			 if (check.contains(Type)) {
				 Managing.Bookoutput(book);
			 }
		 }
	 }
	 public static void Sorting_author() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the author of the book");
		 String author = scan.nextLine();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 String check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getAuthor();
			 if (check.contains(author)) {
				 Managing.Bookoutput(book);
			 }
		 }
	 }
	 
	 public static void Sorting_Publisher() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the publisher of the book");
		 String publisher = scan.nextLine();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 String check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getPublisher();
			 if (check.contains(publisher)) {
				 Managing.Bookoutput(book);
			 }
		 }
	 }
	 public static void Sorting_Publishedyear() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("PLease enter the published year of the book");
		 int year = scan.nextInt();
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist = Datamanage.read_book();
		 int check;
		 for (int i = 0; i <= booklist.size(); i++) {
			 Book book = new Book();
			 book = booklist.get(i);
			 check = booklist.get(i).getPublishyear();
			 if (check == year) {
				 Managing.Bookoutput(book);
			 }
		 }
		 
	 }
}
	 


