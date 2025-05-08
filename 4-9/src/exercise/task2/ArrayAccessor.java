package exercise.task2;

public class ArrayAccessor {
    private int[] array;
    
    // コンストラクタ
    public ArrayAccessor(int[] array) {
        this.array = array;
    }
    
    // 以下の要件を満たすgetElementメソッドを実装
    // 1. 引数で指定された位置の要素を取得
    // 2. 位置が範囲外の場合は例外をスロー
    // 3. 適切な例外処理を行う
    public int getElement(int index) {
        if (index < 0 || index >= array.length) {
            // 点数が範囲外なら例外を投げる
            throw new ArrayIndexOutOfBoundsException("エラー：指定された位置は範囲外です");
        }
        return array[index];
    }
}
