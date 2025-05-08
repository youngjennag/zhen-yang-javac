package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        // テスト用配列の準備
        int[] numbers = {10, 20, 30};
        ArrayAccessor accessor = new ArrayAccessor(numbers);
        
        // 位置1と位置5の要素を表示
        try {
            System.out.println("位置1の要素");
            System.out.println(accessor.getElement(1));

            System.out.println("\n位置5の要素");
            System.out.println(accessor.getElement(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
