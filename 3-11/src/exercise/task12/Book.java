package exercise.task12;

public class Book extends Product{
    String author; // 著者
    int stockQuantity; // 在庫数

    // コンストラクタ
    public Book(String name, int price, String author, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void displayInfo() {
        System.out.println("書籍名：" + this.name);
        System.out.println("著者：" + this.author);
        System.out.println("価格：" + this.price + "円");
    }

    @Override
    public void checkStock() {
        if (this.stockQuantity >= 1) {
            System.out.println("在庫あり");
        } else {
            System.out.println("在庫なし");
        }
    }

}
