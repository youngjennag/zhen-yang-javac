package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        BankAccount bac = new BankAccount(1000);

        System.out.println("残高：" + bac.getBalance() + "円");
        bac.deposit(2000);
        bac.withdraw(1500);
        bac.withdraw(3000);
    }

}
