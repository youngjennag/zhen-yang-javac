package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        // 1. 本を生成
        Book b = new Book();
        // 2. フィールドに初期値をセット
        b.setTitle("Java入門");
        
        System.out.println(b.getTitle() + "を登録しました");

        // 3.本のメソッドを呼び出してゆく
        b.lend();
        b.lend();
        b.returnBook();
        b.lend();
    }
}
