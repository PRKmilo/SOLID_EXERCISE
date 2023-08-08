package controller;

import model.Book;
import model.Dvd;
import model.FinancialLibrary;
import model.PresenterItem;
import view.Vista;

public class LibraryApp {

	public LibraryApp() {
		// TODO Auto-generated constructor stub
		String[] authors1 = {"Herbert Schildt"};
		Book libro1 = new Book("Introduction Java", 4.50 , authors1,"De bolsillo");

		Dvd Dvd1 = new Dvd("Star wars", 5.50);

		Vista vista = new Vista();
		FinancialLibrary financial = new FinancialLibrary();

		PresenterItem Presenter = new PresenterItem();
		vista.mostrarDetalles(Presenter.DetailsProduct(libro1));

		vista.mostrarDetalles(Presenter.DetailsProduct(Dvd1));

		vista.mostrarDetalles(Presenter.DetailsProduct(libro1));

		vista.mostrarDetalles(Presenter.DetailsProduct(Dvd1));
		
		vista.mostrarDetalles(financial.calculateLateFee(4, libro1)+" Es el valor por el retraso del libro");
		vista.mostrarDetalles(financial.calculateLateFee(5, Dvd1)+" Es el valor por el retraso del dvd");
		
	}

}
