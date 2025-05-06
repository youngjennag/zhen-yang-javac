import java.util.ArrayList;
import java.util.HashSet;

public class Main4 {

    public static void main(String[] args) {
        // 発見したモンスターを管理するHashSet（重複なし）
        HashSet<String> monsters = new HashSet<String>();
        monsters.add("スライム");
        monsters.add("ドラゴン");
        monsters.add("ゴブリン");
        
        // 戦闘履歴を管理するArrayList（重複あり）
        ArrayList<String> histories = new ArrayList<String>();
        
        // 全モンスターのリスト
        ArrayList<String> allMonsters = new ArrayList<String>();
        allMonsters.add("スライム");
        allMonsters.add("ドラゴン");
        allMonsters.add("ゴブリン");
        allMonsters.add("フェニックス");
        allMonsters.add("ユニコーン");
        
        // モンスターとの遭遇をシミュレート
        histories.add("スライム");
        histories.add("スライム");
        histories.add("スライム");
        histories.add("スライム");
        histories.add("スライム");
        histories.add("ドラゴン");
        histories.add("ドラゴン");
        histories.add("ゴブリン");
        histories.add("ゴブリン");
    
        // 戦闘履歴を記録
        for (int i = 0; i < histories.size(); i++) {
            monsters.add(histories.get(i));
        }
        
        // 発見済みモンスターを表示
        System.out.println("発見済みモンスター：" + monsters);
        System.out.println("発見済みモンスター数：" + monsters.size());
        
        // スライムとの戦闘回数を計算
        int SlimeCount = 0;
        for (int i = 0; i < histories.size(); i++) {
            if (histories.get(i).equals("スライム")) {
                SlimeCount++;
            }
        }
        System.out.println("スライムとの戦闘回数：" + SlimeCount);
        
        // 未発見のモンスターを計算
        ArrayList<String> undiscovered = new ArrayList<String>();
        for (int i = 0; i < allMonsters.size(); i++) {
            String monster = allMonsters.get(i);
            if (!monsters.contains(monster)) {
                undiscovered.add(monster);
            }
        }
        System.out.println("未発見のモンスター：" + undiscovered);
    }
}

