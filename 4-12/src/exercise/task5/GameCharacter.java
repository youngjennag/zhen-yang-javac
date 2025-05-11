package exercise.task5;

import java.util.ArrayList;
import java.util.Collections;

public class GameCharacter {
    private String name; //名前
    private ArrayList<Equipment> equipments; // 装備リスト

    // コンストラクタ
    public GameCharacter(String name) {
        this.name = name;
        this.equipments = new ArrayList<Equipment>();
    }

    //装備品をリストに追加するメソッド
    public void addEquipment(Equipment e){
        equipments.add(e);
    }

    // 全装備品を番号付きで表示するメソッド
    public void showEquipments() {
        System.out.println(this.name + "の装備:");
        for (int i = 0; i < equipments.size(); i++) {
          System.out.println((i + 1) + ".　" + equipments.get(i).toString());
        }
    }

    // 装備品を強さ順にソート
    public void sortEquipments() {
        Collections.sort(equipments);
    }
}
