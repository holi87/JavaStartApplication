package library.io.file;

import library.exception.DataExportException;
import library.exception.DataImportException;
import library.exception.InvalidDataException;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;
import library.model.Publication;

import java.io.*;
import java.util.Scanner;


public class CsvFileManager implements FileManager {
    private static final String FILE_NAME = "Library.csv";

    @Override
    public Library importData() {
        Library library = new Library();
        try (Scanner fileReader = new Scanner(new File(FILE_NAME))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Publication publication = createObjectFromString(line);
                library.addPublication(publication);
            }
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku " + FILE_NAME);
        }
        return library;
    }

    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (FileWriter fileWriter = new FileWriter(FILE_NAME);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Publication publication : publications) {
                if (publication != null) {
                    bufferedWriter.write(publication.toCsv());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }

    private Publication createObjectFromString(String csvText) {
        String[] split = csvText.split(";");
        String type = split[0];
        if (Book.TYPE.equals(type)) {
            return createBook(split);
        } else if (Magazine.TYPE.equals(type)) {
            return createMagazine(split);
        }
        throw new InvalidDataException("Nieznany typ publikacji " + type);
    }

    private Magazine createMagazine(String[] data) {
        String title = data[1];
        String publisher = data[2];
        String language = data[3];
        int year = Integer.parseInt(data[4]);
        int month = Integer.parseInt(data[5]);
        int day = Integer.parseInt(data[6]);
        return new Magazine(title, publisher, language, year, month, day);
    }

    private Book createBook(String[] data) {
        String title = data[1];
        String publisher = data[2];
        int year = Integer.parseInt(data[3]);
        String author = data[4];
        int pages = Integer.parseInt(data[5]);

        String isbn = data[6];
        return new Book(title, author, year, pages, publisher, isbn);
    }
}
