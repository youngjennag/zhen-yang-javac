package exercise.task3;

public class Warrior extends Character{
    public String job = "戦士"; // 初期化

    //コンストラクタ
    public Warrior(String name, int hp) {
        super();
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("職業：" + this.job);
    }
}
