public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String appVersion = "0.1";

        String title = "Diuna";
        String author = "Frank Herbert";
        int releaseDate = 2018;
        int pages = 670;
        String publisher = "Rebis";
        String isbn = "9788373017238";

        System.out.println(appName+" "+appVersion);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseDate);
        System.out.println(pages);
        System.out.println(publisher);
        System.out.println(isbn);
    }
}
