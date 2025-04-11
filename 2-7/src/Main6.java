import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        // Scannerの準備
        Scanner scanner = new Scanner(System.in);
        
        // 経験値の入力
        System.out.println("現在の経験値を入力してください：");
        String input = scanner.nextLine();  // 文字列として読み込み
        int currentExp = Integer.parseInt(input);  // 整数に変換

        // ボーナス経験値（25%増加）を計算し、小数点以下を切り捨て
        int bonusExp = currentExp + (int)(currentExp * 0.25);

        // 結果を表示
        System.out.println("ボーナス後の経験値：" + bonusExp);

        //Scannerの後片付け
        scanner.close();
    } 
}
