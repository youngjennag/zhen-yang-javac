public class Main2 {
    public static void main(String[] args) {
        // 半径を設定
        double radius = 5.0;

        CalculateCircle(radius); //呼び出す
    }
    
    /* 
     * 円の面積と円周を計算するメソッド
     */
    public static void CalculateCircle(double radius) {
        double circleArea = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("半径が" + radius + "の場合：");
        System.out.println("円の面積：" + circleArea);
        System.out.println("円周：" + circumference);
    }
}
