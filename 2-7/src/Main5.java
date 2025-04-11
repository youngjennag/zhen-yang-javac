public class Main5 {
    public static void main(String[] args){
        //各商品の単価と個数
        int notePrice = 280;
        int noteCount = 3;
        int pencilPrice = 120;
        int pencilCount = 5;
        int eraserPrice = 100;
        int eraserCount = 2;

        // 小計の計算
        int subTotal = notePrice * noteCount + pencilPrice * pencilCount + eraserPrice * eraserCount;
        
        // 消費税（10%）の計算（小数点以下切り捨て）
        int tax = (int)(subTotal * 0.10);

         // 合計金額
        int total = subTotal + tax;

         // 支払額とおつりの計算
        int paid = 2000;
        int change = paid - total;

        // 結果の表示
        System.out.println("小計：" + subTotal + "円");
        System.out.println("消費税：" + tax + "円");
        System.out.println("合計金額：" + total + "円");
        System.out.println("おつり：" + change + "円");
    } 
}
