public class Main3 {
    public static void main(String[] args){
        int attack = 15; //プレイヤーの攻撃力
        int defense = 5; // 敵の防衛力

        // ダメージの計算式（小数点以下は自動的に切り捨て）
        int damage = (attack * 2 - defense) / 3;

        //結果を表示
        System.out.println("与えるダメージ：" + damage);
    } 
}
