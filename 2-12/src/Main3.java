public class Main3 {
    public static void main(String[] args) {
        int height = 5; // ピラミッドの高さ

        for (int i = 1; i <= height; i++) {
            // 空白を出力
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // 星を出力
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
