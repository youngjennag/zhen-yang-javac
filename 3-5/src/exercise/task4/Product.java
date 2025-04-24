package exercise.task4;

public class Product {
    String name; //商品名
    int price; //価格

    // コンストラクタ
    public Product() {
        this.name = "ノートパソコン"; // 初期化
        this.price = 80000; // 初期化
    }

    // 商品情報を表示するメソッド
    public void displayInfo() {
        System.out.println("商品名：" + this.name);
        System.out.println("価格：" + price + "円");
    }
}
