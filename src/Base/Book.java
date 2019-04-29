package Base;

import java.io.Serializable;

public class Book implements Serializable {
	private String IBN;
	private String title;
	private String type;
	private String author;
	private String publisher;
	private int publishyear;
	
	public String getIBN() {
		return IBN;
	}
	public void setIBN(String iBN) {
		IBN = iBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishyear() {
		return publishyear;
	}
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
}

