package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        GameItem gi1 = new GameItem("回復薬", 100);
        GameItem gi2 = new GameItem("魔法の杖", 1500);

        System.out.println("アイテム情報：");
        System.out.println(gi1.toString());
        System.out.println(gi2.toString());
    }
}
