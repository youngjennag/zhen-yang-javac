package exercise.task4;

// 商品クラス
public class Product {
    private String name;
    private int stock;
    
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    
    // 在庫を1個減らすメソッド
    public void decreaseStock() {
        // stockが0より大きい場合のみ減らす
        if (stock > 0) {
            this.stock--;
        }
    }
    
    public int getStock() {
        return stock;
    }
    
    @Override
    public String toString() {
        return name + " (在庫: " + stock + "個)";
    }
}
