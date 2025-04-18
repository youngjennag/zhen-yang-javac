import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        showCurrentTime(); //呼び出し
    }
    
    // 現在の日付と日時を表示するメソッド
    public static void showCurrentTime() {
        Date now = new Date(); // 現在の日時を取得
        System.out.println("現在の日時：" + now.toString());
    }
}
