package exercise.task1;

public class Product {
    private String name; // 商品名
    private int price; // 価格

    // コンストラクタ
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

     // toString()をオーバーライドして、見やすい表示形式を定義
     @Override
     public String toString() {
        return "商品名：" + this.name + "(" + this.price + "円)";
    }

}
