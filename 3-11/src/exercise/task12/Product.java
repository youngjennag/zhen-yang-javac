package exercise.task12;

public abstract class Product {
    String name; // 商品名
    int price; // 価格

    // 商品の情報を表示する抽象メソッド
    public abstract void displayInfo();
    
    // 在庫チェックを行う抽象メソッド
    public abstract void checkStock();
}
