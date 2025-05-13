package exercise.task1;

public class Fruit {
    private String name;
    private int price;
    
    public void setData(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("果物: " + this.name);
        System.out.println("価格: " + this.price + "円");
    }
}
