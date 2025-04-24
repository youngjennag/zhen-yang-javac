package exercise.task6;

public class Account {
    String accountNumber; // 口座番号
    int balance; // 残高

    // コンストラクタ
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0; // 初期化
    }
    
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("残高: " + this.balance + "円");

    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("出勤後残高: " + this.balance + "円");
        } else {
            System.out.println("残高が不足しています");
        }
    }
}
