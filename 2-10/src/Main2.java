public class Main2 {
    public static void main(String[] args){
        int score = 75; // 点数
        
        if (score > 100) {
             System.out.println("無効な点数です");
        } else if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}
