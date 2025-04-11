import java.util.Scanner;

public class Main8 {
    public static void main(String[] args){
        // Scannerの準備
        Scanner scanner = new Scanner(System.in);
        
        // 攻撃力の入力
        System.out.println("攻撃力を入力してください：");
        String inputAttack = scanner.nextLine();  // 文字列として読み込み
        int attack = Integer.parseInt(inputAttack);  // 整数に変換
 
        // 防衛力の入力
        System.out.println("防衛力を入力してください：");
        String inputDefense = scanner.nextLine();  // 文字列として読み込み
        int defense = Integer.parseInt(inputDefense);  // 整数に変換

        //　通常ダメージの計算
        int normalDamage = attack - defense;

        // クリティカルダメージの計算（1.5倍、小数点以下切り捨て）
        int criticalDamage = (int)(normalDamage * 1.5);

        // 結果を表示
        System.out.println("通常ダメージ：" + normalDamage);
        System.out.println("クリティカルダメージ：" + criticalDamage);

        //Scannerの後片付け
        scanner.close();
    }  
}
