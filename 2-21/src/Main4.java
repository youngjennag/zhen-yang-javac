import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        
        // 元のリストを表示
        System.out.println("元のリスト："+ numbers);

        // リストをソート
        Collections.sort(numbers);

        //ソート後のリストを表示
        System.out.println("ソート後：" + numbers);

        // 最大値と最小値を表示
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
}
