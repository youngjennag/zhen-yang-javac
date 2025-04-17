public class Main1 {
    public static void main(String[] args) {
        int price = 1000;  // 商品価格
        int quantity = 3;  // 数量

        int total = calculateTotal(price,quantity);

        System.out.println("商品価格: " + price + "円, 数量" + quantity);
        System.out.println("合計金額（税込）：" + total + "円");
    }

    // 合計金額（税込）を計算するメソッド
    public static int calculateTotal(int price, int quantity) {
        int totalPrice = (int)(price * quantity * 1.08);
        return totalPrice;
    }
}
