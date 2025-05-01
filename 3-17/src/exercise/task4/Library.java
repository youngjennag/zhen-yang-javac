package exercise.task4;

public class Library {

    // 本を貸し出すメソッド
    public void lendBook(Book b) {
        if (b.isLent()) {
            System.out.println("エラー: この本は既に貸し出し中です");
        } else {
            System.out.println("「" + b.getTitle() + "]" + "を貸し出しました");
            b.setLent(true);
        }
    }

    // 本を返却するメソッド
    public void returnBook(Book b) {
        if (b.isLent()) {
            System.out.println("「" + b.getTitle() + "]" + "が返却されました");
            b.setLent(false);
        } else {
            System.out.println("エラー: この本は未貸出の本です");
        }

    }
}
