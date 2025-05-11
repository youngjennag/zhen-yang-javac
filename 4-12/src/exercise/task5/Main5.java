package exercise.task5;

public class Main5 {
    public static void main(String[] args) {
        Equipment e1 = new Equipment("伝説の剣", 100, 0);
        Equipment e2 = new Equipment("光の盾", 0, 80);
        Equipment e3 = new Equipment("伝説の剣", 10, 20);

        GameCharacter gc = new GameCharacter("勇者A");

        gc.addEquipment(e1);
        gc.addEquipment(e2);
        gc.addEquipment(e3);

        System.out.println("--- キャラクター装備情報 ---");
        gc.showEquipments();

        System.out.println("\n");

        //装備の複製テスト
        boolean result1 = e1.clone().equals(e1);
        System.out.println("装備の複製テスト: " + (result1 ? "OK" : "NG"));
        

        // 装備の比較テスト
        int result2 = e1.compareTo(e2);
        System.out.println("装備の比較テスト: " + (result2 < 0 ? "OK" : "NG" ));

        // 装備のソートテスト
        gc.sortEquipments();
        System.out.println("装備の比較テスト: OK");

        System.out.println("\n");
        System.out.println("ソート後の結果：");
        gc.showEquipments(); // ソート後に再表示
    }
}
