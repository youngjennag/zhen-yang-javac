package exercise.task2;

public class Book {
    String title; // タイトル
    Boolean isLent = false; // 貸出中かどうか(初期化)

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void lend() {
        if (this.isLent) {
            System.out.println("申し訳ありません。この本は貸出中です");
        } else {
            System.out.println("本を貸し出しました");
            this.isLent = true;
        }
    }

    public void returnBook() {
        if (this.isLent) {
            System.out.println("本が返却されました");
            this.isLent = false;
        }
    }
}
