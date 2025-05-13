package exercise.task3;

// ジェネリックな在庫管理クラス
public class Inventory<T> {
    // 商品を格納するフィールドを作成
    private T item;
    private final ProductCategory category;
    
    public Inventory(ProductCategory category) {
        this.category = category;
    }
    
    // 商品を入荷するメソッド
    public void stockIn(T item) {
        // 1. itemを設定
        this.item = item;
        // 2. "[カテゴリ名]コーナー: [商品名]を入荷" を表示
        System.out.println(this.category.getDisplayName() + "コーナー: " + this.item +"を入荷");
    }
    
    // 商品を出荷するメソッド
    public T stockOut() {
        // 1. 現在の商品を一時変数に保存
        T stockOutItem = this.item;
        // 2. itemをnullに設定
        this.item = null;
        // 3. 保存しておいた商品を返す
        return stockOutItem;
    }
    
    // 現在の在庫を取得するメソッド
    public T getCurrentStock() {
        return item;
    }
}
