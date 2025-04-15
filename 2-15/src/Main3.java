public class Main3 {
    public static void main(String[] args) {
        // 7日の気温を配列で用意
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};

        // 月曜日～日曜日を配列で用意
        String[] days = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};

        // for文で曜日と気温を対応させて表示
        // 各曜日の気温を表示（通常のfor文を使用）
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + temperatures[i] + "度");
        }

        // 合計気温を計算（拡張for文を使用）
        double totalTemperatures = 0.0;
        for (double temp : temperatures) {
            totalTemperatures += temp;
        } 

        // 平均気温を計算
        double avg = totalTemperatures / temperatures.length;

        // 結果を表示
        System.out.println("平均気温：" + avg + "度");
    } 
}
