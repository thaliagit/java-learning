package miniProjects;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManager {
    public static class Book{
        String title, author;

        Book(String title, String author){
            this.title = title;
            this.author = author;
        }

        void printInfo(){
            System.out.println("Book: " + title + " - Author: " + author);
        }
    }
    public static Book findBook(ArrayList<Book> books, String searchTitle){
        for(Book book : books){
            if(book.title.equals(searchTitle)){
                return book;
            }
        }
        return null;
    }
    public static void addBook(ArrayList<Book> books, String bookTitle, String bookAuthor){
        books.add(new Book(bookTitle, bookAuthor));
    }
    public static boolean removeBook(ArrayList<Book> books, String titleToRemove){
        Book found = findBook(books, titleToRemove);
        if(found != null){
            books.remove(found);
            return true;
        }else{
            return false;
        }
    }
    public static void updateBook(Book bookToUpdate, String newTitle, String newAuthor){
        bookToUpdate.title = newTitle;
        bookToUpdate.author = newAuthor;
    }
    public static void main(String args[]){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J.K. Rowling"));
        books.add(new Book("The Winds of Winter", "George R. R. Martin"));
        books.add(new Book("Animal Farm", "George Orwell"));

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Select your choice: ");
            System.out.println("1. Show all books' details.");
            System.out.println("2. Show books' titles.");
            System.out.println("3. Show books' authors. ");
            System.out.println("4. Add a book. ");
            System.out.println("5. Remove a book. ");
            System.out.println("6. Update a book. ");
            System.out.println("7. Search book by title.");
            System.out.println("8. Exit.");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    for(Book book : books){
                        book.printInfo();
                    }
                    break;
                case "2":
                    for(Book book : books){
                        System.out.print("Title: ");
                        System.out.println(book.title);
                    }
                    break;
                case "3":
                    for(Book book : books){
                        System.out.print("Author: ");
                        System.out.println(book.author);
                    }
                    break;
                case "4":
                    System.out.print("Book's title: ");
                    String newBookTitle = input.nextLine();
                    System.out.print("Book's author: ");
                    String newBookAuthor = input.nextLine();
                    addBook(books, newBookTitle, newBookAuthor);
                    break;
                case "5":
                    System.out.print("Book's title: ");
                    String bookToRemove = input.nextLine();
                    boolean isRemoved = removeBook(books, bookToRemove);
                    if(isRemoved){
                        System.out.println("Book has been removed successfully!");
                    }else{
                        System.out.println("This book does not exist.");
                    }
                    break;
                case "6":
                    System.out.print("Book's title: ");
                    String bookToFind = input.nextLine();
                    Book foundToUpdate = findBook(books, bookToFind);
                    if(foundToUpdate != null){
                        System.out.print("New title: ");
                        String newTitle = input.nextLine();
                        System.out.print("New author: ");
                        String newAuthor = input.nextLine();
                        updateBook(foundToUpdate, newTitle, newAuthor);
                    }else{
                        System.out.println("This book does not exist.");
                    }
                    
                    break;
                case "7":
                    System.out.print("Book title: ");
                    String titleInput = input.nextLine();
                    Book found = findBook(books, titleInput);
                    if(found != null){
                        System.out.println("Book found! ");
                        found.printInfo();
                    }else{
                        System.out.println("Book does not exist.");
                    }
                    break;
                case "8":
                    System.out.println("Goodbye!");
                    return;
                default:
                    break;
            }
        }
    }
}
