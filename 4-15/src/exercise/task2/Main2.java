package exercise.task2;

// メインクラス
public class Main2 {
    public static void main(String[] args) {
        // 果物倉庫のテスト
        System.out.println("果物倉庫: ");
        // String型の倉庫を作成
        Warehouse<String> fruitWarehouse = new Warehouse<>();
        
        // バナナを格納
        fruitWarehouse.store("バナナ");
        // バナナを取り出し
        fruitWarehouse.retrieve();
        // 空チェック
        System.out.println("空チェック: " + fruitWarehouse.isEmpty());

        // 日用品倉庫のテスト
        System.out.println("\n日用品倉庫:");

        // String型の倉庫を作成
        Warehouse<String> dailyGoodsWarehouse = new Warehouse<>();
        
        // バナナを格納
        dailyGoodsWarehouse.store("ティッシュ");
        // バナナを取り出し
        dailyGoodsWarehouse.retrieve();
        // 空チェック
        System.out.println("空チェック: " + dailyGoodsWarehouse.isEmpty());
  
    }
}
