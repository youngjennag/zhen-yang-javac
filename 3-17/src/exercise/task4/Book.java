package exercise.task4;

public class Book {
    private String title; // タイトル
    private boolean isLent; // 貸出状態

    // コンストラクタ
    public Book(String title) {
        this.title = title;
        this.isLent = false; //　未貸出
    }

    public String getTitle() {
        return title;
    }

    // 貸出状態を確認するメソッド
    public boolean isLent() {
        return isLent;
    }

    // 貸出状態を変更するメソッド
    protected void setLent(boolean isLent) {
        this.isLent = isLent;
    }
}
