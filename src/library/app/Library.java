package library.app;

import library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String appVersion = "0.7";
        Book[] books = new Book[1000];

        books[0] = new Book("Diuna", "Frank Herbert", 2018, 670,
                "Rebis", "9788373017238");
        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851,
                "McGraw-Hill Osborne Media", "9780071591065");
        books[3] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "9788373271890");
        System.out.println(appName+" "+appVersion);
        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        books[3].printInfo();
        System.out.println("Można przechowywac maksymalnie " + books.length + " książek");


    }
}
