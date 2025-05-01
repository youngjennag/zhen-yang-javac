package exercise.task3;

public class Main3 {
    public static void main(String[] args) {
        Product p = new Product("りんご", 100);

        System.out.println("商品名：" + p.getName());
        System.out.println("在庫数：" + p.getStock());

        p.removeStock(50);
        p.addStock(10);
        p.removeStock(70);
    }  
}
