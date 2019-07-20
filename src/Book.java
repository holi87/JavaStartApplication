class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releasedate, int pages, String publisher, String isbn) {
        this(title, author, releasedate, pages, publisher);
        this.isbn = isbn;
    }

    Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }
    String getInfo() {
        return title + ";" + author + ";" + releaseDate + ";" + pages + ";" + publisher + ";" + isbn;
    }

    void printInfo() {
        System.out.println(getInfo());
    }
}
