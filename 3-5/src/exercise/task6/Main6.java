package exercise.task6;

public class Main6 {
    public static void main(String[] args) {
        Account ac = new Account("12345");
        System.out.println("口座番号：" + ac.accountNumber);

        ac.deposit(1000);
        ac.withdraw(500);
    }

}
