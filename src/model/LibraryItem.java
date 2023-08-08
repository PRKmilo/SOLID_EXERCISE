package model;

public class LibraryItem {
	protected String title;
    boolean checkedOut;
	protected double price;
	protected double day_late_price;

	public LibraryItem(String title, double price, double day_late_price) {
		this.title = title;
		this.checkedOut = false;
		this.price = price;
		this.day_late_price = day_late_price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDay_late_price() {
		return day_late_price;
	}

	public void setDay_late_price(double day_late_price) {
		this.day_late_price = day_late_price;
	}
	
	


}
