package exercise.task3;

// GameScoreExceptionクラスを作成（抽象クラス）
public abstract class GameScoreException extends Exception {
    private int score;
    
    // コンストラクタを実装
    public GameScoreException(String message, int score) {
        super(message);
        this.score = score;
    }

    // getScoreメソッド
    public int getScore() {
        return score;
    }
}
