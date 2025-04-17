public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";  // 逆順にする文字列
        String output = reverse(input); // メソッド呼び出し

        /* System.out.println("入力：" + input);
        System.out.println("出力：" + output); */

        // エスケープシーケンスを使った文字列
        System.out.println("入力：" + "\""+ input + "\""); //文字列の中にダブルクォートを入れる
        System.out.println("出力：" + "\""+ output + "\""); 
    }

    // 文字列を逆順にするメソッド
    public static String reverse(String input) {
       return new StringBuilder(input).reverse().toString();
    }
}
