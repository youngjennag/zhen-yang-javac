import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        // 商品名と在庫数を管理するHashMapを作成
        Map<String,Integer> stocks = new HashMap<String,Integer>();
        
        // 商品を入荷（在庫を追加）
        stocks.put("おにぎり",15);
        stocks.put("サンドイッチ",8);
        stocks.put("お弁当",5);
        
        // 現在の在庫状況を表示
        System.out.println("在庫状況：" + stocks);

        // おにぎりを1個販売
        sell(stocks, "おにぎり", 1);

        // 更新後の在庫状況を表示
        System.out.println("在庫状況：" + stocks);
        
        // アイスクリームの在庫確認
        String name = "アイスクリーム";
        System.out.println(name + "は在庫がありますか？：" + stocks.containsKey(name));
    }

    // 商品の販売メソッド（個数を減らす）
    public static void sell(Map<String,Integer> stocks, String name, int amount) {
        if (stocks.containsKey(name)) {
            int current = stocks.get(name);
            if (current >= amount) {
                stocks.put(name, current - amount);
                System.out.println(name + "を" + amount + "個販売しました");
            } else {
                System.out.println(name + "の在庫が足りません");
            }
        } else {
            System.out.println(name + "は在庫に存在しません");
        }
    }
} 





