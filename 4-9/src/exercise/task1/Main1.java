package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // 割り算の実行
        try {
            // 10 ÷ 0 を計算
            int result = calc.divide(10, 0);
            System.out.println("10 ÷ 0 = " + result);
        } catch (ArithmeticException e) {
            // エラーメッセージを表示
            System.out.println("10 ÷ 0 = エラー：" + e.getMessage());
        }
    }
}

