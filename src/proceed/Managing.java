package proceed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import Base.Book;
import Base.Info;

public class Managing {
	
	public static Info userinput(){
		Info user = new Info();
		try {
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter your full name");
			String name = reader.nextLine();
			System.out.println("Please enter your username");
			String username = reader.nextLine();
			System.out.println("Please enter your password");
			String password = reader.nextLine();
			System.out.println("Please enter your day of birth");
			String birth = reader.nextLine();
			System.out.println("Please enter you ID: ");
			int id = reader.nextInt();
			System.out.println("Please enter your intake year: ");
			int year_intake = reader.nextInt();
			user.setName(name);
			user.setUsername(username);
			user.setPassword(password);
			user.setBirth(birth);
			user.setId(id);
			user.setYear_intake(year_intake);
		} catch (Exception e) {
			return null;
		}
		return user;
	}
	
	public static Book bookinput() {
		Book book = new Book();
		try {
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter IBN of a book: ");
			String IBN = reader.nextLine();
			System.out.println("Please enter the title of the book: ");
			String title = reader.nextLine();
			System.out.println("Please enter the type of the book: ");
			String type = reader.nextLine();
			System.out.println("Please enter the author: ");
			String author = reader.nextLine();
			System.out.println("please enter the publisher: ");
			String publisher = reader.nextLine();
			System.out.println("Please enter the the year of publising: ");
			int publishyear = reader.nextInt();
			book.setIBN(IBN);
			book.setTitle(title);
			book.setType(type);
			book.setAuthor(author);
			book.setPublisher(publisher);
			book.setPublishyear(publishyear);
			
		} catch (Exception e) {
			return null;
		}
		return book;
	}
	
	public static void Useroutput(Info user) {
		System.out.println("Name: " + user.getName());
		System.out.println("Day of Birth: " + user.getBirth());
		System.out.println("ID of the user: " + user.getId());
		System.out.println("Intake: " +user.getYear_intake());
		System.out.println("---------------------------------");
	}
	
	public static void Bookoutput(Book book) {
		System.out.println("IBN:  " + book.getIBN());
		System.out.println("Title: " + book.getTitle());
		System.out.println("Type: " + book.getType());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Publisher: " + book.getPublisher());
		System.out.println("Year of publshing: " + book.getPublishyear());
		System.out.println("----------------------------------");
	}
	public static void Bookoutput_error() {
		System.out.println("There is no book!");
	}
}
