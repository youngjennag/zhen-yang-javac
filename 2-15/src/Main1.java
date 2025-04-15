public class Main1 {
    public static void main(String[] args) {
        // ここに配列を作成し、点数を代入するコードを書いてください
        //// 5つの要素を持つ配列を作成
        int[] scores = new int[5];

        // 配列の要素に点数を代入
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 75;
        scores[3] = 95;
        scores[4] = 80;

        // 点数を表示
        System.out.println("1番目の生徒: " + scores[0] + "点");
        System.out.println("2番目の生徒: " + scores[1] + "点");
        System.out.println("3番目の生徒: " + scores[2] + "点");
        System.out.println("4番目の生徒: " + scores[3] + "点");
        System.out.println("5番目の生徒: " + scores[4] + "点");
    }
}
