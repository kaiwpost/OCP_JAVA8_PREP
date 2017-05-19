package org.sbpdiscovery.java.basics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Playing with hashCode and equals.
 */
public class Book {
	
	private int ISBN;
	private String title, author;
	private int pageCount;
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPageCount() {
		return pageCount;
	}

	@Override
	public int hashCode() {
		return ISBN;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Book)) {
			return false;
		}
		
		Book other = (Book) obj;
		
		return this.ISBN == other.ISBN;
	}


	public static void main(String[] args) {
		
		Book mobyDick = new Book();
		mobyDick.setISBN(123456789);
		
		Book catcherInTheRye = new Book();
		catcherInTheRye.setISBN(987654321);
		
		System.out.println(mobyDick.equals(catcherInTheRye));
	}

}
