package exercise.task4;

import java.util.ArrayList;

public class PartyMember implements Cloneable{
    private String name; // 名前
    private ArrayList<String> skills; // スキルリスト

    // コンストラクタ
    public PartyMember(String name) {
        this.name = name;
        this.skills = new ArrayList<String>();
    }

    // スキルをリストに追加するメソッド
    public void addSkill(String skill) {
        skills.add(skill);
    }

    // 深いコピー
    public PartyMember deepClone() {
        try {
            PartyMember copy = (PartyMember) super.clone();
            // スキルリストを新しいリストにコピー
            copy.skills = new ArrayList<>(this.skills);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // 名前とスキルリストを表示
    public String showSkills() {
        return "「" +this.name + "」のスキル：" + skills;
    }
}
