package MiniProjectjava;
// you have to impliement a  library using  java  class library 

// methode : addBooks , issueBooks , returnBooks, ShowAvalibleBooks
// properties : Array to store the avalibleBooks 
// And Array to store the issueBooks

// create a library class

class Librarey {
    String[] Books;
    int no_of_books = 0;

    // create a constructor
    Librarey() {
        this.Books = new String[100];
        this.no_of_books = 0;
    }

    // create a function addBooks naame ki
    void addBooks(String Book) {
        this.Books[this.no_of_books] = Book;
        this.no_of_books++;
        System.out.println(Book + "  :  has been added!");
    }

    void ShowAvalibleBooks() {
        System.out.println("Available Books are : ");

        for (String Book : this.Books) {
            if (Book == null) {
                continue;

            }
            System.out.println(Book);
        }
        // for (int i = 0; i < this.no_of_books; i++) {
        // System.out.println(this.Books[i]);
        // }
    }

    // }
    void issueBooks(String Book) {
        for (int i = 0; i < this.no_of_books; i++) { // Only loop through available books
            if (this.Books[i] != null && this.Books[i].equalsIgnoreCase(Book)) {
                System.out.println(Book + "  :  This book is issued.");
                this.Books[i] = null;
                return;
            }
        }
        System.out.println("This book is not available.");
    }
    
    void returnBooks(String Book) {
        addBooks(Book);
    }
}

public class Library_Mangesment {
    public static void main(String[] args) {
        Librarey lib = new Librarey();
        lib.addBooks("Think and grow Rich ");
        lib.addBooks("Java");
        lib.addBooks("C");
        lib.addBooks("C++");
        lib.addBooks("Python");
        lib.addBooks("C#");
        lib.addBooks("PHP");
        lib.addBooks("JavaScript");
        lib.addBooks("HTML");
        lib.addBooks("CSS");
        lib.addBooks("SQL");
        lib.ShowAvalibleBooks();
        System.out.println();

        lib.issueBooks("Think and grow Rich ");
        lib.issueBooks("C++");
        System.out.println();

        lib.ShowAvalibleBooks();
        System.out.println();

        lib.returnBooks("C++");
        System.out.println();

        lib.ShowAvalibleBooks();

    }
}