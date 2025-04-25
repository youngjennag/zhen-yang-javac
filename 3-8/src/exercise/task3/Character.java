package exercise.task3;

public class Character {
    protected String name;
    protected int hp;
    
    public void showStatus() {
        System.out.println("名前：" + this.name);
        System.out.println("HP：" + this.hp);
    }

}
