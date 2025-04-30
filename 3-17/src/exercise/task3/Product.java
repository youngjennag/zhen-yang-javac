package exercise.task3;

public class Product {
    private String name; // 商品名
    private int stock; // 在庫数

    // コンストラクタ
    public Product(String name, int initialStock) {
        this.name = name;
        this.stock = initialStock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }
    
    // 在庫を追加するメソッド
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;

            System.out.println(amount + "個追加しました");
            System.out.println("商品名: " + this.name);
            System.out.println("在庫数: " + this.stock + "個");   
        }
    }

    // 在庫を減少するメソッド
    public void removeStock(int amount) {
        if (amount > 0 && amount < this.stock) {
            this.stock -= amount;

            System.out.println(amount + "個販売しました");
            System.out.println("商品名: " + this.name);
            System.out.println("在庫数: " + this.stock + "個");  
        } else {
            System.out.println("エラー: 在庫が不足しています");
        }

    }

}
