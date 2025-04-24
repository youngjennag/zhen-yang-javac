package exercise.task2;

public class HealingPotion {

    public void healingPotion(Player p) {
        p.hp += 50;
        System.out.println("回復ポーションを使用しました");
        System.out.println("プレイヤーのHP：" + p.hp);
    }
}
