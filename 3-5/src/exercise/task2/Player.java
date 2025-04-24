package exercise.task2;

public class Player {
    String name;
    int hp;

    // プレイヤー名とプレイヤーのHPを表示するメソッド
    public void displayInfo() {
        System.out.println("プレイヤー名：" + this.name);
        System.out.println("プレイヤーのHP：" + this.hp);
    }

    // プレイヤーのHPを表示するメソッド
    public void displayHp() {
        System.out.println("プレイヤーのHP：" + this.hp);
    }
}
