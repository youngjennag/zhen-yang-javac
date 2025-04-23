package exercise.task3;

public class BankAccount {
    int balance = 0; // 残高

    // 残高を取得するメソッド
    public int getBalance() {
        return this.balance;
    }

    // お金を預けるメソッド
    public void deposit(int amount) {
        System.out.println(amount + "円預けました");
        this.balance += amount;
    }

    // お金を引き出すメソッド
    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("残高が不足しています");
        } else {
            System.out.println(amount + "円引き出しました");
            this.balance -= amount;
        }
    }
}
