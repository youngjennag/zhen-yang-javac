public class Main1 {
    public static void main(String[] args){
        // 10から1までデクリメントしながらカウントダウン
        for (int count = 10; count > 0; count--) {
            // 【1】初期化：int count = 5  （カウンターを10で初期化）
            // 【2】継続条件：count > 0    （countが0より大きい間続ける）
            // 【3】更新処理：count--      （countを1ずつ減らす）
            System.out.println(count);
        }
    }
}