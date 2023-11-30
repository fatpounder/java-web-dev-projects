public class Main {

    public static void main(String[] args) {

        //TODO: P2 Print the first available ID number if a book object were to be created
        System.out.println(Book.getNextIdNum());

        //TODO: P2 After instantiating each book object, print its ID #, then print next available ID # now stored at the class level
        //TODO: Instantiate a Library object called Library
        Library library = new Library();


        //TODO: Instantiate 3 books - two with numPages and one without
        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("\nBook 1 has an ID of " + book1.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("\nBook 2 has an ID of " + book2.getBookId());
        System.out.println(Book.getNextIdNum());
        Book book3 = new Book("1984", "George Orwell");
        System.out.println("\nBook 3 has an ID of " + book3.getBookId());
        System.out.println(Book.getNextIdNum());

        //TODO: P2 Test the toString() method of the Book class by printing the first book
        System.out.println(book1);

        //TODO: Add each book to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //TODO: Print available books
        library.printAvailableBooks();


        //TODO: P2 Test the toString() method of the Library class by printing the library
        System.out.println(library);

        //TODO: P2 Create a second set of the same books as above
        Book book4 = new Book("Contact", "Carl Sagan", 430);
        Book book5 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book6 = new Book("1984", "George Orwell");

        //TODO: P2 Create a second library and add all three new books to it
        Library library2 = new Library();
        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);

        //TODO: P2 Use the strict equality operator to compare the identity of the two libraries
        System.out.println("\nAre the two libraries identical?");
        System.out.println(library == library2);

        //TODO: P2 Now use equals() method to compare their contents
        System.out.println("\nAre the two libraries equal?");
        System.out.println(library.equals(library2));

        //TODO: Check out the first book
        book1.checkOut();


        //TODO: Print available books again
        library.printAvailableBooks();


        //TODO: Check out the second book and check in the first book
        book2.checkOut();
        book1.checkIn();


        //TODO: Print available books again
        library.printAvailableBooks();


    }

}
