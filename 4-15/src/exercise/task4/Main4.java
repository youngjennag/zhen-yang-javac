package exercise.task4;

// メインクラス
public class Main4 {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        // バナナを追加
        manager.addProduct("バナナ", 5);
        
        // バナナを販売
        manager.sellProduct("バナナ");
        
        // 存在しない商品を検索
        System.out.print("存在しない商品の検索: ");
        manager.sellProduct("りんご");
    }
}
