public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String appVersion = "0.1";

        Book book1 = new Book();


        book1.title = "Diuna";
        book1.author = "Frank Herbert";
        book1.releaseDate = 2018;
        book1.pages = 670;
        book1.publisher = "Rebis";
        book1.isbn = "9788373017238";

        System.out.println(appName+" "+appVersion);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
