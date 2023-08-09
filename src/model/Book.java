package model;

import java.lang.reflect.Array;

public class Book extends LibraryItem{

	private String[] authors;
	private String formato;
	public Book(String title, double price , String[] authors, String formato) {
		super(title,price, 0.25);
		// TODO Auto-generated constructor stub
		this.authors=authors;
		
		this.formato=formato;
		
	}

}
