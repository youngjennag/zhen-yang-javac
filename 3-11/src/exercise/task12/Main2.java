package exercise.task12;

public class Main2 {
    public static void main(String[] args) {
        // 1.本のインスタンスを作成
        Book b = new Book("Java入門", 2500 , "山田太郎", 30);

        // 2.本のメソッドを呼び出してゆく
        b.displayInfo();
        b.checkStock();
        
    }
}
