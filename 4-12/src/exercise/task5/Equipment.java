package exercise.task5;

public class Equipment implements Cloneable, Comparable<Equipment>{
    private String name; // 名前
    private int attack; // 攻撃力
    private int defense; // 防御力

    // コンストラクタ
    public Equipment(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    // 総合力を取得するメソッド
    public int getPower() {
        return attack + defense;
    }

    @Override
    // clone()メソッドをオーバーライド
    public Equipment clone() {
        try {
            Equipment copy = (Equipment)super.clone();
            return copy;
        } catch (CloneNotSupportedException e ){
            throw new RuntimeException(e);
        }
    }

    @Override
    // equals()メソッドをオーバーライド
    public boolean equals(Object obj) {
        if (obj == this) return true;
        
        if (obj == null) return false;

        if (!(obj instanceof Equipment)) return false;

        Equipment other = (Equipment)obj;
        return this.name.equals(other.name) &&
        this.attack == other.attack &&
        this.defense == other.defense;
    }

    @Override
    // comapreTo()メソッドをオーバーライド
    public int compareTo(Equipment other) {
        return Integer.compare(other.getPower(), this.getPower());
    }

    @Override
    // toString()メソッドをオーバーライド
    public String toString() {
        return this.name + "(攻撃力:" + this.attack + "　防御力:" + this.defense + ")";
    }
}
