package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();

        //fruit.setData("りんご", "300"); // コンパイルエラー

        fruit.setData("りんご", 300);
        fruit.displayInfo(); 
    }
}