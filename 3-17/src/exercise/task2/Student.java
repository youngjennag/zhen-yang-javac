package exercise.task2;

public class Student {
    private String name; // 名前
    private int score; // 点数

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("エラー: 点数は0-100の範囲で設定してください");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1 || name.length() > 20) {
            throw new IllegalArgumentException("エラー: 名前は1-20文字で設定してください");
        }
        this.name = name;
    }
    
}
