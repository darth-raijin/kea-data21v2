public class App {
    public static void main(String[] args) throws Exception {
        Library localLibrary = new Library();
        localLibrary.addBook(new Book("9780140439199", "The Art of War", "6th century BC"));
        localLibrary.addBook(new Book("9780023042706", "The Prince", "1513"));
        localLibrary.addBook(new Book("9788702188684", "Mimbo Jimbo finder en ven", "2041"));

        localLibrary.findBook("9780023042706");

    }
}
