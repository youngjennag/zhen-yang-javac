package exercise.task5;

import java.util.List;
import java.util.ArrayList;

public class SavingsAccount implements BankAccount{
    String accountHolder; //口座名義人
    int balance; // 残高
    List<String> transactionHistory; // 取引履歴

    // コンストラクタ
    public SavingsAccount(String accountHolder, int initialBalance ) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("口座作成：初期残高 = " + initialBalance);
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            transactionHistory.add("入金：" + amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            transactionHistory.add("出金：" + amount);
        } else {
            System.out.println("残高が不足しています");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人：" + this.accountHolder);
        System.out.println("残高：" + this.balance);
        System.out.println("取引履歴：");
        for (String record: transactionHistory) {
            System.out.println(record);
        }
    }
}
