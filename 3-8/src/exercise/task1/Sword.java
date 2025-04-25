package exercise.task1;

public class Sword extends Weapon{
    // コンストラクタ
    public Sword(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower()
    {
        return power;
    }


}
