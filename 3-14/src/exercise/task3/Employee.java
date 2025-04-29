package exercise.task3;

public abstract class Employee {
    protected String name; // 名前
    protected String role; // 役職名

    // コンストラクタ
    public Employee(String name) {
        this.name = name;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 役職名を取得するメソッド
    public String getRole() {
        return role;
    }

    // 給与を計算する抽象メソッド
    public abstract int calculateSalary();
}
