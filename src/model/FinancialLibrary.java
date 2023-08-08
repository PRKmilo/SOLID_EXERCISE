package model;

public class FinancialLibrary implements ServiceCalculator{

	@Override
	public <T extends LibraryItem> double calculateLateFee(int daysLate, T item) {
		// TODO Auto-generated method stub
		return daysLate * item.getDay_late_price();
	}

	

	

}
