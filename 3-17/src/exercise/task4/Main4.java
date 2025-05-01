package exercise.task4;

public class Main4 {
    public static void main(String[] args) {
        Book b = new Book("Java入門");
        Library l = new Library();
        
        l.lendBook(b);
        l.lendBook(b);
        l.returnBook(b);
        l.lendBook(b);
    } 
}
