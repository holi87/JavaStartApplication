package library.model;

import java.io.Serializable;


public class Library implements Serializable {
    private static final int MAX_PUBLICATIONS = 2000;



    private Publication[] publications = new Publication[MAX_PUBLICATIONS];
    private int publicationsNumber;

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }
    public Publication[] getPublications() {
        return publications;
    }
    public void addPublication(Publication publication){
        if (publicationsNumber >= MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji przekroczona " + MAX_PUBLICATIONS );
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }
}
