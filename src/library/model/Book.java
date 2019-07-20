package library.model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int releasedate, int pages, String publisher, String isbn) {
        this(title, author, releasedate, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        if (releaseDate > 0) {
            this.releaseDate = releaseDate;
        } else {
            System.out.println("Data wydania musi być większa od 0!");
        }
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String getInfo() {
        String info = title + ";" + author + ";" + releaseDate + ";" + pages + ";" + publisher;
        if (isbn != null) {
            info = info + ";" + isbn;
        }
        return info;
    }

    public void printInfo() {
        System.out.println(getInfo());
    }
}
