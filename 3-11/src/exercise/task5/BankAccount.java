package exercise.task5;

public interface BankAccount {
    // 入金するメソッド
    void deposit(int amount);
    // 出金するメソッド
    void withdraw(int amount);
    // 残高照会メソッド
    int getBalance();
    // 口座情報表示メソッド
    void displayAccountInfo();
}
