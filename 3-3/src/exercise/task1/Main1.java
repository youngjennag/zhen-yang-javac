package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        // 1. ペットを生成
        Pet p = new Pet();
        // 2. フィールドに初期値をセット
        p.setName("ポチ");
        p.setEnergy(100);

        System.out.println(p.name + "を生み出しました!");
        System.out.println("初期体力：" + p.getEnergy());

        // 3.ペットのメソッドを呼び出してゆく
        p.eat();
        p.showEnergy();
        p.play();
        p.showEnergy();
    }  
}

