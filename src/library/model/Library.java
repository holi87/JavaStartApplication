package library.model;

import java.util.Arrays;

public class Library {
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
    private void addPublication(Publication publication){
        if (publicationsNumber >= MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji przekroczona " + MAX_PUBLICATIONS );
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }
}
