public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量

        int[] totalPrices = calculateTotal(prices, quantities); //合計金額

        // 商品価格を表示
        System.out.print("商品価格：[");
        // 複数の変数を同時に使用
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]);
            if (i < prices.length - 1) {
                System.out.print(", ");
            }
        }

        //数量を表示
        System.out.print("], ");
        System.out.print("数量：[");
        for (int j = 0; j < quantities.length; j++) {
            System.out.print(quantities[j]);
            if (j < quantities.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 合計金額を表示

        System.out.print("合計金額：[");  
        for (int k = 0; k < totalPrices.length; k++) {
            System.out.print(totalPrices[k]);
            if (k < totalPrices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");  
    } 

    // 複数の商品の合計金額を計算するメソッド
    public static int[] calculateTotal(int[] prices, int[] quantities){
            int[] totalPrices = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                totalPrices[i] = (int)(prices[i] * quantities[i] * 1.08);
            }
            return totalPrices;
    }
}
