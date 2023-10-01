import java.util.*;

class BookLibrary {
    private String[] availableBooks;
    private String[] borrowedBooks;
    private int borrowedCount;

    public BookLibrary() {
        availableBooks = new String[]{
    "Whispers in the Dark: A Psychological Thriller",
    "Chronicles of the Celestial Realm: Fantasy Adventure",
    "Love in Technicolor: Modern Romance",
    "The Alchemist's Legacy: Historical Fiction",
    "Echoes of the Lost City: Archaeological Mystery",
    "Surrendering to the Storm: Memoirs of Resilience",
    "Quantum Paradox: Science Fiction Odyssey",
    "Heartstrings and Harmonies: Musical Memoir",
    "The Art of Solitude: A Philosophical Journey",
    "Shattered Illusions: Crime and Redemption",
    "Elysium's Enigma: Dystopian Utopia",
    "Beneath the Silent Waves: Maritime Adventure",
    "Eternal Garden: Paranormal Romance",
    "Ink and Whispers: Poetic Reflections",
    "The Last Oracle: Prophecies Unveiled",
    "The Haunting of Blackwood Manor: Gothic Horror",
    "Of Stardust and Dreams: Science Fantasy",
    "Threads of Fate: Multigenerational Saga",
    "Rebel Hearts and Steel Blades: Epic Fantasy",
    "A Brush with Destiny: Artistic Endeavors"
        };
        borrowedBooks = new String[availableBooks.length];  // Initialize borrowed books array
        borrowedCount = 0;
        displayAvailableBooks();
        borrowBook();
    }

    private void displayAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < availableBooks.length; i++) {
            System.out.println(i + ": " + availableBooks[i]);
        }
    }

    private int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void borrowBook() {
        System.out.print("Enter the book number you want to borrow: ");
        int bookChoiceNumber = takeUserInput();

        if (bookChoiceNumber < 0 || bookChoiceNumber >= availableBooks.length) {
            System.out.println("Invalid input. Please enter a valid book number.");
            borrowBook();
            return;
        }

        if (availableBooks[bookChoiceNumber].equals("Book Issued")) {
            System.out.println("This book is already borrowed. Please choose another book.");
            borrowBook();
            return;
        }

        borrowedBooks[borrowedCount] = availableBooks[bookChoiceNumber];
        availableBooks[bookChoiceNumber] = "Book Issued";
        borrowedCount++;

        System.out.println("You have borrowed the book: " + borrowedBooks[borrowedCount - 1]);
    }

    private void returnBook() {
        System.out.print("Enter the book number you want to return: ");
        int bookChoiceNumber = takeUserInput();

        if (bookChoiceNumber < 0 || bookChoiceNumber >= borrowedCount) {
            System.out.println("Invalid input. Please enter a valid book number.");
            returnBook();
            return;
        }

        // Move the returned book to the end of the available books array
        availableBooks[availableBooks.length - borrowedCount] = borrowedBooks[bookChoiceNumber];

        // Remove the returned book from the borrowed books array
        for (int i = bookChoiceNumber; i < borrowedCount - 1; i++) {
            borrowedBooks[i] = borrowedBooks[i + 1];
        }
        borrowedCount--;

        System.out.println("You have returned the book: " + availableBooks[availableBooks.length - borrowedCount - 1]);
    }

    public void listAllBooks() {
        System.out.println("All available books:");
        for (int i = 0; i < availableBooks.length; i++) {
            System.out.println(i + ": " + availableBooks[i]);
        }
    }

    public void listBorrowedBooks() {
        System.out.println("Borrowed books:");
        for (int i = 0; i < borrowedCount; i++) {
            System.out.println(i + ": " + borrowedBooks[i]);
        }
    }

    public void manageLibrary() {
        System.out.println("Welcome to the library!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. List all available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. List borrowed books");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    listBorrowedBooks();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.manageLibrary();
    }
}
