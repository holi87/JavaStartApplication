package library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka";
        final String version = "0.9";
        System.out.println(appName + " " + version);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
