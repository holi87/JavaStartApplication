package library.model;

class Publication {
    private int year;
    private String title;
    private String publisher;

    Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
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
