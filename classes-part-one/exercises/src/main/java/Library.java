import java.util.ArrayList;

public class Library {

    //TODO: P2 Ensure books cannot be overwritten by another object
        //Changed private to final on line 9
    //TODO: Declare a field, books, as an ArrayList of Book objects
    //Give it private access
    final ArrayList<Book> books = new ArrayList<>();

    //Note: the default constructor is sufficient to instantiate a library object

    //TODO: P2 Write a custom toString() method to print a list of all books
    //Use the StringBuilder class to iterate over books
    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        for (Book book : books) {
            allBookInfo.append(book.toString());
            allBookInfo.append("\n----------------------------------------\n");
        }
        return String.valueOf(allBookInfo);
    }


    //TODO: P2 Write a custom equals() method to compare the contents of books
    //Use the @Override annotation
    //First include a reference check, null check, class check, and cast
    //Then compare the size of the books list
    //Finally, loop through both lists and compare the books using findBook()

    @Override
    public boolean equals(Object toBeCompared) {
        //Reference check
        if(this == toBeCompared) {
            return true;
        }
        //Null check
        if (toBeCompared == null) {
            return false;
        }
        //Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        //Cast
        Library otherLibrary = (Library) toBeCompared;
        //Compare size of lists
        if (books.size() != otherLibrary.books.size()) {
            return false;
        }
        //Custom comparison of contents
        for (Book book : books) {
            int index = otherLibrary.findBook(book.getTitle(), book.getAuthor());
            if (index == -1) {
                return false;
            }
        }
        return true;
    }


    //TODO: Define a public method, addBook()
    public void addBook(Book book) {
        books.add(book);
    }

    public int findBook(String title, String author) {
        for(Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    //TODO: Define a public method, printAvailableBooks()
    //It should print only books that aren't checked out
    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
