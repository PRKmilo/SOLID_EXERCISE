package model;

public interface ServiceCalculator {
	
	public <T extends LibraryItem> double calculateLateFee(int daysLate, T item);

}
