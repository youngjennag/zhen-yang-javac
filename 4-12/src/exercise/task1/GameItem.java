package exercise.task1;

public class GameItem {
    private String name; // アイテム名
    private int price; // 価格

    // コンストラクタ
    public GameItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    // toString()メソッドをオーバーライド
    public String toString() {
        return "[" + this.name + "]　価格：" + this.price + "G";
    }
}
