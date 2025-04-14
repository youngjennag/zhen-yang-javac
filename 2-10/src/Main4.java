public class Main4 {
    public static void main(String[] args){
        // ３辺の長さを設定
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            System.out.println("三角形ではない");
        } else {
            if (side1 == side2 && side2 == side3) {
                System.out.println("正三角形");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("二等辺三角形");
            } else if (isRightTriangle(side1, side2, side3)){
                System.out.println("直角三角形");
            } else {
                System.out.println("不等辺三角形");
            }
        }
    }
        // 三平方の定理による直角三角形の判定
        private static boolean isRightTriangle(int side1, int side2, int side3) {
            return (side1 * side1 + side2 * side2 == side3 * side3) ||
                   (side1 * side1 + side3 * side3 == side2 * side2) ||
                   (side2 * side2 + side3 * side3 == side1 * side1);
        }
}
