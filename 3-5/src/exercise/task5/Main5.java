package exercise.task5;

public class Main5 {
    public static void main(String[] args) {
        Book bk1 = new Book("Java入門", "山田太郎");
        Book bk2 = new Book("Python実践", "鈴木次郎", 300);

        System.out.println("本1: " + bk1.title + " - " + bk1.author + " (" + bk1.pages +"ページ)");
        System.out.println("本2: " + bk2.title + " - " + bk2.author + " (" + bk2.pages +"ページ)");
    }
}
