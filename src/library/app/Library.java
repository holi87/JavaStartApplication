package library.app;

import library.io.DataReader;
import library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String appVersion = "0.8";
        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName+" "+appVersion);
        System.out.println("Wprowadź nową książkę");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();
        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();
        books[1].printInfo();
        System.out.println("Można przechowywac maksymalnie " + books.length + " książek");


    }
}
