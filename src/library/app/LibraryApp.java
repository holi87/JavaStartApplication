package library.app;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka";
    private static final String VERSION = "2.0";

    public static void main(String[] args) {
        System.out.println(APP_NAME + " " + VERSION);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
