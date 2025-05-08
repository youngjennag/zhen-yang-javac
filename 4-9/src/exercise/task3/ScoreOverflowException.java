package exercise.task3;

// ScoreOverflowExceptionクラスを作成
public class ScoreOverflowException extends GameScoreException {
    // コンストラクタ
    public ScoreOverflowException(int score) {
        super("Score cannot exceed 100", score);

    }
}
