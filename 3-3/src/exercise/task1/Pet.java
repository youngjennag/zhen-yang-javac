package exercise.task1;

public class Pet {
    String name; // 名前
    int energy; // 体力
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat() {
        this.energy += 10;
        System.out.println("ポチは食事をして元気になった！");
    }

    public void play() {
        this.energy -= 20;
        System.out.println("ポチは遊んで疲れた！");
    }

    // 体力を表示するメソッド
    public void showEnergy() {
        System.out.println("現在の体力：" + this.energy );
    }
}
