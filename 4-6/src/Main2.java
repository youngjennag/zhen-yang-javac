import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Integer型のArrayListを作成
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        // 点数を追加
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(55);
        scores.add(43);
        
        // 点数リストを表示
        System.out.println("点数リスト：" + scores);
        
        // 平均点を計算
        int total = 0;
        for (int score : scores) {  // 取り出す時も自動的にintに変換されます
            total += score;
        }
        double average = (double)total / scores.size();
        System.out.println("平均点：" + average);
        
        // 最高点を取得
        int maxScore = scores.get(0); // 最初の要素を仮の最大値に
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
            }
        }
        System.out.println("最高点：" + maxScore);
        
        // 不合格者数（60点以下）を計算
        int count = 0;
        for (int score : scores) {  // 取り出す時も自動的にintに変換されます
            if (score <= 60) {
                count++;
            }
        }
        System.out.println("不合格者数：" + count);
    }
}