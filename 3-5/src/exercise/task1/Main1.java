package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        Weapon w = new Weapon();
        w.name = "魔法の剣";

        GameCharacter gc = new GameCharacter();
        gc.name = "剣士アレックス";
        gc.weapon = w;

        System.out.println(gc.name + "は" + gc.weapon.name + "を装備しています");
    }
}
