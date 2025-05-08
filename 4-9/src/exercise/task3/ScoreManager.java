package exercise.task3;

// スコア管理クラス
public class ScoreManager {
    // validateScoreメソッドを実装
    // 1. 負の値の場合はInvalidScoreExceptionをスロー
    // 2. 100点超過の場合はScoreOverflowExceptionをスロー
    // 3. それ以外の場合は正常終了
    public void validateScore(int score) throws GameScoreException{
        if (score < 0) {
            throw new InvalidScoreException(score);
        } else if (score > 100) {
            throw new ScoreOverflowException(score);
        } else {
            System.out.println("OK");
        }
    }
}
