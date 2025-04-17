public class Main2 {
    public static void main(String[] args) {
        int score = 85;  // 学生の得点

        String result = checkScore(score); //呼び出す
        System.out.println("成績：" + result);
    }

    // 成績を判定するメソッド
    public static String checkScore(int score) {
        if (score >= 80) {
            return "優";  
        } else if (score >= 70) {
            return "良";  
        } else if (score >= 60) {
            return "可";  
        } else {
            return "不可";  
        } 
    }
}
