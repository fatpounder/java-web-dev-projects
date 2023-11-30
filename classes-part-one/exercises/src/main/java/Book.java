public class Book {

    //FIELDS

    //TODO:P2 Declare a class=level field that will hold the next available number for book IDs
    //Initialize it to 1

    private static int nextIdNum = 1;

    //TODO: P2 Declare a String field for each unique bookId, but do not initialize it
    //Make sure each book's ID cannot be changed after it is set in the constructor

    private final String bookId;

    //TODO: Declare private fields title, author, numPages, and available
    //Available should be initialized and true
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;

    //CONSTRUCTORS

    //TODO: Define a constructor that takes title, author, and numPages
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        bookId = generateBookId();
        //need bookId to be last because what it is depends on the previous info
        //do not need this. for bookId because it only goes through the constructor
    }

    //TODO: Define an alternate (overloaded) constructor that requires only title and author

    public Book(String title, String author) {
        this(title, author,  0);
    }

    //GETTERS AND SETTERS

    //TODO: P2 Add a getter for the static field nextIdNum that can be called on the class
    //Use the IntelliJ generator and notice it makes it a static method automatically
    //Then Customize to make it a meaningful sentence and change the return type to String


    public static String getNextIdNum() {
        return "\nThe next available number for a book ID will be " + nextIdNum;
        //String was int automatically from the generator, but can change type in some instances
    }


    //TODO: P2 Add a getter for bookId, but no setter since it is final

    public String getBookId() {
        return bookId;
    }


    //TODO: Use the IntelliJ generate feature to create getters and setters
    //Create both getters and setters for title, author, and numPages
    //Create only a getter for available (we will have instance methods to set this)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isAvailable() {
        return available;
    }

    //TODO: P2 Write a custom toString() method that nicely formats the book data
    //Use the @Override annotation, which is recommended always be used

    @Override
    public String toString() {
        return "\n" + getTitleAndAuthor() + "\n" + numPages + " pages \nID: " + bookId;
    }


    //INSTANCE METHODS

    //TODO: P2 Define an instance method to generate a unique book ID
    //It should be private because we want it to be called ONLY from the constructor
    //Use the format (author initials)-(first three letters of title)-(next available number)
    //All letters should be capitalized
    //Increment the next ID number for the class to use next time a new Book object is instantiated
    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0,3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }


    //TODO: Define a method, getTitleAndAuthor(), to return a string like "Book Title by Author Name"
    //It should have default access
    String getTitleAndAuthor() {
        return title + " by " + author;
    }

    //TODO: Define a method, checkOut(), with public access
    //It should change the availability and print a statement with the title and author name
    public void checkOut() {
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library");
    }

    //TODO: Define a method, checkIn(), with public access
    //It should change the availability and print a statement with the title and author name
    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked in");
    }

}
