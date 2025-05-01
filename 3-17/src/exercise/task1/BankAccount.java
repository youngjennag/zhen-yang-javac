package exercise.task1;

public class BankAccount {
    private int balance; // 残高

    // コンストラクタ
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // 残高を取得するメソッド
    public int getBalance() {
        return balance;
    }

    // 入金するメソッド
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "円入金しました");
            System.out.println("残高：" + this.balance + "円");
        }
    }

    // 出金するメソッド
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + "円引き出しました");
            System.out.println("残高：" + this.balance + "円");
        } else {
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        }
    }

}
