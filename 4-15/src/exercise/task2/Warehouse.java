package exercise.task2;

// ジェネリックな倉庫クラス
public class Warehouse<T> {
    // 商品を格納するフィールドを作成
    private T item;
    
    // 商品を格納するメソッド
    public void store(T product) {
        this.item = product;

        System.out.println("商品追加:" + this.item);
    }
    
    // 商品を取り出すメソッド
    public T retrieve() {
        // 1. 現在の商品を一時変数に保存
        T retrievedItem = this.item;
        // 2. itemをnullに設定
        this.item = null;
        // 3. "取り出し: [商品名]" を表示
        System.out.println("取り出し: " + retrievedItem);
        // 4. 保存しておいた商品を返す
        return retrievedItem;
    }
    
    // 倉庫が空かどうかをチェックするメソッド
    public boolean isEmpty() {
        if (this.item == null) {
            return true;
        } else {
            return false;
        }
    }
}
