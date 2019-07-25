package library.model;

import org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder;

import java.util.Objects;

public class Publication {
    private int year;
    private String title;
    private String publisher;

    Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return title +", " + publisher +", "+year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Publication that = (Publication) o;
        return year == that.year &&
                Objects.equals(title, that.title) &&
                Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, year);
    }

    public void printInfo() {
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Data wydania musi być większa od 0!");
        }

    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
