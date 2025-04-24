package exercise.task2;

public class HealingPotion {

    public void heal(Player p) {
        p.hp += 50;
        
        System.out.println("回復ポーションを使用しました");
    }
}
