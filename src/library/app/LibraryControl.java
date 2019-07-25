package library.app;

import library.exception.NoSuchOptionException;
import library.io.ConsolePrinter;
import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;
import library.model.Publication;

import java.io.Console;
import java.util.InputMismatchException;

class LibraryControl {
    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);

    private Library library = new Library();

    void controlLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie");
            }
        } while (option != Option.EXIT);
    }
    private Option getOption(){
        boolean optionOK=false;
        Option option = null;
        while (!optionOK){
            try{
                option = Option.createFromInt(dataReader.getInt());
                optionOK=true;
            }catch(NoSuchOptionException e){
                printer.printLine(e.getMessage()+ ", podaj ponownie:");
            }catch(InputMismatchException ignored){
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie");
            }
        }
        return option;
    }
    private void printOptions() {
        printer.printLine("Wybierz opcje:");
        for (Option option :
                Option.values()) {
            printer.printLine(option.toString());
        }
    }

    private void addBook() {
        try{
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        }catch (InputMismatchException e){
            printer.printLine("Nie udało się utworzyć książki, nie poprawne dane");
        }catch(ArrayIndexOutOfBoundsException e){
            printer.printLine("Osiągnięto limit pojemności, nie można dodać kolejnej książki");
        }

    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }
    private void exit() {
        System.out.println("Koniec programu, bye!");
        dataReader.close();
    }

    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(4,"Wyświetlenie dostępnych magazynów/gazet");

        private int value;
        private String description;

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        Option(int value, String description){
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }
        static Option createFromInt(int option) throws NoSuchOptionException {
            try{
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e){
                throw new NoSuchOptionException("Brak opcji o id "+ option);
            }
        }

    }
}

