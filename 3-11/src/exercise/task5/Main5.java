package exercise.task5;

public class Main5 {
    public static void main(String[] args) {
        SavingsAccount sc = new SavingsAccount("山田太郎", 10000);

        sc.deposit(5000);
        sc.withdraw(3000);
        sc.displayAccountInfo();
    }
}
