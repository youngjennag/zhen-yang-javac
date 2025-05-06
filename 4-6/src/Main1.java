import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // 学生の名簿を管理するArrayListを作成
        ArrayList<String> names = new ArrayList<String>();
        
        // 学生を追加
        names.add("田中");
        names.add("佐藤");
        names.add("鈴木");
        
        // 学生リストを表示
        System.out.println("学生リスト：" + names);

        // 2番目の学生を取得（インデックスは0から始まるので1を指定）
        String name = names.get(1);
        System.out.println("2番目の学生：" + name);
        
        // 学生数を取得
        int count = names.size();
        System.out.println("学生数：" + count);
        
        // 特定の学生が含まれているか確認
        String target = "鈴木";
        boolean hasName = names.contains(target);
        System.out.println(target + "さんは含まれていますか？：" + hasName); 
    }
}
