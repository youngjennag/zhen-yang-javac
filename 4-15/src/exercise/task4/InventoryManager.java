package exercise.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// 在庫管理クラス
public class InventoryManager {
    // 商品を格納するMapを作成（キー：商品名、値：商品）
    private Map<String, Product> inventory = new HashMap<>();
    
    // 商品を追加するメソッド
    public void addProduct(String name, int stock) {
        // 1. 新しい商品を作成
        Product p = new Product(name, stock);
        // 2. inventoryに追加
        inventory.put(name, p);
        // 3. "[商品名]を入荷しました" を表示
        System.out.println(name + "を入荷しました");
    }
    
    // 商品を検索するメソッド（Optional使用）
    private Optional<Product> findProduct(String name) {
        // 商品を検索してOptionalでラップして返す
        return Optional.ofNullable(inventory.get(name));
    }
    
    // 商品を販売するメソッド
    public void sellProduct(String name) {
        // findProductの結果を取得
        Optional<Product> product = findProduct(name);
        
        // productが存在する場合
        if (product.isPresent()) {
            // ここで在庫を1減らす
            product.get().decreaseStock();;
            System.out.println(name + "の販売: 在庫から1個減少");
        } else {
            // 存在しない場合
            System.out.println("商品が見つかりません");
        }
    }
}
