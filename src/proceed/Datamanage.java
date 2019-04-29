package proceed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Base.Book;
import Base.Info;

public class Datamanage {
	public static final String FILE_USER = "users.dat";
	public static final String FILE_BOOK = "books.dat";
	

    public static boolean hasObject(File file) {
        FileInputStream fileInputStream;
        boolean check = true;
        try {
        	fileInputStream = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(fileInputStream);
            if (inStream.readObject() == null) {
                check = false;
            }
            inStream.close();
        } catch (FileNotFoundException e) {
            check = false;
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
        }
        return check;
    }
    public static boolean write(String fileName, Book listbook) {
        try {
            File file = new File(fileName);
            FileOutputStream fileOutputStream;
            ObjectOutputStream outStream = null;
            if (!file.exists()) {
            	fileOutputStream = new FileOutputStream(file);
            	outStream = new ObjectOutputStream(fileOutputStream);
            } else {
                if (!hasObject(file)) {
                	fileOutputStream = new FileOutputStream(file);
                	outStream = new ObjectOutputStream(fileOutputStream);
                } else {
                	fileOutputStream = new FileOutputStream(file, true);
                	outStream = new ObjectOutputStream(fileOutputStream) {
                        protected void writeStreamHeader() throws IOException {
                            reset();
                        }
                    };
                }
            }
            outStream.writeObject(listbook);
            outStream.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    public static boolean write(String fileName, Info listuser) {
        try {
            File file = new File(fileName);
            FileOutputStream fileOutputStream;
            ObjectOutputStream outStream = null;
            if (!file.exists()) {
            	fileOutputStream = new FileOutputStream(file);
            	outStream = new ObjectOutputStream(fileOutputStream);
            } else {
                if (!hasObject(file)) {
                	fileOutputStream = new FileOutputStream(file);
                	outStream = new ObjectOutputStream(fileOutputStream);
                } else {
                	fileOutputStream = new FileOutputStream(file, true);
                	outStream = new ObjectOutputStream(fileOutputStream) {
                        protected void writeStreamHeader() throws IOException {
                            reset();
                        }
                    };
                }
            }
            outStream.writeObject(listuser);
            outStream.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    public static ArrayList<Book> read_book() {
    	ArrayList<Book> listbook = new ArrayList<Book>();
        try {
            File file = new File(FILE_BOOK);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(fileInputStream);
            Object object;
            while (true) {
            	object = inStream.readObject();
                listbook.add((Book) object);
            }
        } catch (ClassNotFoundException e) {
        } catch (IOException e) {}
        return listbook;
    }
    public static ArrayList<Info> read_user() {
    	ArrayList<Info> listuser = new ArrayList<Info>();
        try {
            File file = new File(FILE_USER);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(fileInputStream);
            Object object;
            while (true) {
            	object = inStream.readObject();
                listuser.add((Info) object);
            }
        } catch (ClassNotFoundException e) {
        } catch (IOException e) {}
        return listuser;
    }
}
