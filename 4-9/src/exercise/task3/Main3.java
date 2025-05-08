package exercise.task3;

public class Main3 {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();
        
        // 正常値のテスト
        System.out.println("得点: 50");
        try {
            manager.validateScore(50);
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
        
        // 負の値のテスト
        System.out.println("\n得点: -10");
        try {
            manager.validateScore(-10);
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
        
        // 超過値のテスト
        System.out.println("\n得点: 150");
        try {
            manager.validateScore(150);
        } catch (GameScoreException e) {
            System.out.println("エラー: " + e.getMessage() + " (" + e.getScore() + ")");
        }
    }
}
