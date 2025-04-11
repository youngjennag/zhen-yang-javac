public class Main2 {
    public static void main(String[] args){
        int originalPrice = 2500; //定価
        double discountRate =  0.2; // 割引率

         // 割引額の計算
        int discountAmount = (int)(originalPrice * discountRate);

        // 販売価格の計算
        int salePrice = originalPrice - discountAmount;

        // 結果の表示
        System.out.println("割引額：" + discountAmount + "円");
        System.out.println("販売価格：" + salePrice + "円");
    } 
}
