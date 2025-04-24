package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        Player p = new Player();
        p.name = "勇者";
        p.hp = 30;

        HealingPotion hepo = new HealingPotion();

        p.displayInfo();
        hepo.healingPotion(p);  
    }
}
