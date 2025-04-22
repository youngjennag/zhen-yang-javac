package exercise.task4;

public class Main4 {
    public static void main(String[] args) {
        // 1. 武器を生成
        Weapon w = new Weapon();
        // 2. フィールドに初期値をセット
        w.setWeapon("伝説の剣", 100);

        // 3.武器のメソッドを呼び出してゆく
        for (int i = 0; i < 10; i++) {
            w.use();
        }
        w.use();
        w.repair();
        w.use();
    }
}
