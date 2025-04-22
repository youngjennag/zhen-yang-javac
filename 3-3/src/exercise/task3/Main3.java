package exercise.task3;

public class Main3 {
    public static void main(String[] args) {
        // 1. 銀行の口座を生成
        BankAccount bac = new BankAccount();
        // 2. 初期残高を表示
        System.out.println("残高：" + bac.getBalance() + "円");

        // 3.銀行の口座のメソッドを呼び出してゆく
        bac.deposit(10000);
        System.out.println("残高：" + bac.getBalance() + "円");
        bac.withdraw(3000);
        System.out.println("残高：" + bac.getBalance() + "円");
        bac.withdraw(8000);
    }
}
