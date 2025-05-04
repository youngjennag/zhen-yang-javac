public class Main2 {
    public static String shortenMessage(String message, int maxLength) {

        // 長い文章を省略して表示
        String shortened = message.substring(0, maxLength);  // 文字列の長さ制限

        // メソッドチェーンを使う
        String result = new StringBuilder()
        .append(shortened)
        .append("...")
        .toString();

        return result;
    }

    public static void main(String[] args) {
        String message = "これは非常に長いチャットメッセージです。省略する必要があります。";
        System.out.println("原文: " + message);
        System.out.println("省略後(10文字): " + shortenMessage(message, 10));
        System.out.println("省略後(20文字): " + shortenMessage(message, 20));
    }
}
