public class Book {

    String isbnNumber;
    String title;
    String releaseYear;

    public Book(String isbnNumber, String title, String releaseYear) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getISBNNumber() {
        return this.isbnNumber;
    }

    public void setISBNNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getreleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return isbnNumber + " " + title + " " + releaseYear;
    }
}
