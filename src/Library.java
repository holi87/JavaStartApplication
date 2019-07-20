public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String appVersion = "0.4";


        Book book1 = new Book("Diuna", "Frank Herbert", 2018, 670,
                "Rebis", "9788373017238");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788324620845");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851,
                "McGraw-Hill Osborne Media", "9780071591065");
        Book book4 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "9788373271890");
        System.out.println(appName+" "+appVersion);
        System.out.println("Książki dostępne w bibliotece");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
        book4.printInfo();


    }
}
