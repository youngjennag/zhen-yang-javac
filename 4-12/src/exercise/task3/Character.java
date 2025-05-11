package exercise.task3;

public class Character {
    private String name; //名前
    private int hp; // HP
    private int attack; // 攻撃力

    // コンストラクタ
    public Character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // 戦闘力を取得
    public int getBattlePower() {
        return this.hp + this.attack;  
    }


    @Override
    // toString()メソッドをオーバーライド
    public String toString() {
        return this.name + " (HP：" + this.hp + "　攻撃力：" + this.attack + ")　戦闘力：" + getBattlePower();
    }




}
