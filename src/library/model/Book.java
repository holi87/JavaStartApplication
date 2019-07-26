package library.model;

import java.util.Objects;

public class Book extends Publication {
    private String author;
    private String isbn;
    private int pages;
    public static final String TYPE = "Książka";
    public Book(String title, String author, int releasedate, int pages, String publisher, String isbn) {
        this(title, author, releasedate, pages, publisher);
        this.isbn = isbn;
    }

    private Book(String title, String author, int releaseDate, int pages, String publisher) {
        super(title, publisher, releaseDate);
        this.pages = pages;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, isbn, pages);
    }

    @Override
    public String toString() {
        return super.toString() + ", " +author + ", " + pages + ", "+isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Liczba stron musi być większa od 0!");
        }
    }

    private String getInfo() {
        String info = getTitle() + ";" + author + ";" + getYear() + ";" + pages + ";" + getPublisher();
        if (isbn != null) {
            info = info + ";" + isbn;
        }
        return info;
    }

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                author + ";" +
                pages + ";" +
                isbn + "";
    }

}
