package exercise.task3;

// InvalidScoreExceptionクラスを作成
public class InvalidScoreException extends GameScoreException {
    // コンストラクタ
    public InvalidScoreException(int score) {
        super("Score cannot be negative",score);
    }
}
