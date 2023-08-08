package model;

public class PresenterItem implements PrinterService{

	@Override
	public <T extends LibraryItem> String DetailsProduct(T item) {
		// TODO Auto-generated method stub
		String  message = "";
		if (!item.checkedOut) {
			item.setCheckedOut(true);
			message = item.getTitle()+"  checkout";
		}else {
			item.setCheckedOut(false);
			message = item.getTitle() + " returned.";

		}
		return message;
	}


}
