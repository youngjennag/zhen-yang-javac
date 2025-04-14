public class Main9 {
    /**
     * switch文を使用した電卓プログラム
     */
    public static void main(String[] args){
        int num1 = 38;
        int num2 = 0;
        char operator = '/';  // +, -, *, / のいずれか

        switch (operator) {
            case '+':
                System.out.println(num1 + num2); 
                break;
            case '-':
                System.out.println(num1 - num2); 
                break;
            case '*':
                System.out.println(num1 * num2); 
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("エラー：0で割ることはできません");
                } else {
                    System.out.println(num1 / num2);
                }
                break;

            default:
                System.out.println("無効な演算子です"); 
                break;
        }
    }
}
