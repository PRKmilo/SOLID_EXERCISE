package model;

public interface PrinterService {
	public <T extends LibraryItem> String DetailsProduct( T item);

}
