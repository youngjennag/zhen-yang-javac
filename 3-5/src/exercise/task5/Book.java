package exercise.task5;

public class Book {
    String title; // タイトル
    String author; // 著者
    int pages; // ページ数

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
}
