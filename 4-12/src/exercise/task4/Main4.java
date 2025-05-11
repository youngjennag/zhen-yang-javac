package exercise.task4;

public class Main4 {
    public static void main(String[] args) {
        PartyMember pm = new PartyMember("アリス");
    
        pm.addSkill("ファイア");
        pm.addSkill("ブリザード");

        PartyMember copy = pm.deepClone();
        copy.addSkill("サンダー");

        System.out.println("--- 深いコピー後にスキル追加 ---");
        System.out.println("元のキャラクター" + pm.showSkills());
        System.out.println("コピーしたキャラクター" + copy.showSkills());
        
    }

}
