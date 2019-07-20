class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookReleasedate, int bookPages, String bookPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleasedate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }

    String getInfo() {
        return title + ";" + author + ";" + releaseDate + ";" + pages + ";" + publisher + ";" + isbn;
    }

    void printInfo() {
        System.out.println(getInfo());
    }
}
