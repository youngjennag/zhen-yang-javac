package exercise.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Character> battlePowers = new ArrayList<Character>();

        battlePowers.add(new Character("勇者A", 100, 50));
        battlePowers.add(new Character("魔法使いB", 70, 70));
        battlePowers.add(new Character("戦士C", 80, 40));

         // 戦闘力の高い順（降順）で並べ替え
         Collections.sort(battlePowers, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Integer.compare(c2.getBattlePower(), c1.getBattlePower());
            }
         });

         // 結果を表示
         System.out.println("--- 戦闘力順 ---");
         for (Character c:battlePowers) {
            System.out.println(c.toString());
         }
    }
}
