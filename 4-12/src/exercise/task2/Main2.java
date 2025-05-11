package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        // インスタンスを生成する
        Monster m1 = new Monster("スライム", 5);
        Monster m2 = new Monster("スライム", 5);
        Monster m3 = new Monster("スライム", 10);

        // インスタンスが同じかどうかの判定結果を表示
        System.out.println(getEqualityMessage(m1, m2));
        System.out.println(getEqualityMessage(m1, m3));
    }

    // 同じインスタンスか判定して表示するメソッド
    public static String getEqualityMessage(Monster m1, Monster m2) {
        if (m1.equals(m2)) {
            return m1.getName() + "Lv." + m1.getLevel()+ "　と　" + 
            m2.getName() + "Lv." + m2.getLevel() + "　は同じモンスターです";
        } else {
            return m1.getName() + "Lv." + m1.getLevel()+ "　と　" + 
            m2.getName() + "Lv." + m2.getLevel() + "　は違うモンスターです";
        }
    }
}
