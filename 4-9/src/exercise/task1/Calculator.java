package exercise.task1;

public class Calculator {
    // 2つの整数の割り算を行うメソッド
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("0で割ることはできません");
        }
        return a / b;
    }
}
