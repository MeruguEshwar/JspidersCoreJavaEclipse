package jsp.app.com.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BookEntityClass
 *
 */
@Entity 

public class BookEntityClass implements Serializable {

	@Id
	private String bookTitle;
	private String bookAuthor;
	private int bookEdition;
	private double bookPrice;
	private String bookType;
	private static final long serialVersionUID = 1L;

	public BookEntityClass() {
		super();
	}   
	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}   
	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}   
	public int getBookEdition() {
		return this.bookEdition;
	}

	public void setBookEdition(int bookEdition) {
		this.bookEdition = bookEdition;
	}   
	public double getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}   
	public String getBookType() {
		return this.bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	@Override
	public String toString() {
		return "BookEntityClass [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookEdition=" + bookEdition
				+ ", bookPrice=" + bookPrice + ", bookType=" + bookType + "]";
	}
}
