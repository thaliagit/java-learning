package classes;
public class classesarrayofobjects2 {
    static class Book{
        String title;
        int pages;

        Book(String title, int pages){
            this.title = title;
            this.pages = pages;
        }

        void showInfo(){
            System.out.println(title + " (" + pages + ")");
        }
    }

    public static void main(String[] args){
        Book[] books = new Book[3];
        books[0] = new Book("Harry Potter", 300);
        books[1] = new Book("Dune", 500);
        books[2] = new Book("1984", 320);
        
        for(int i = 0; i < books.length; i++){
            books[i].showInfo();
        }
    }
}
