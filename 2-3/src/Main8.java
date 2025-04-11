/**
 * Main8クラスは、変数と出力文を使って簡単な自己紹介を行うプログラムです。
 * ユーザーの名前、出身地、好きな食べ物をコンソールに出力します。
 */
public class Main8 {
    public static void main(String[] args) {
        System.out.println("==== 自己紹介 ====");
        String lastName = "ヨウ"; // 名字
        String firstName = "チン"; // 名前
        String placeOfBirth = "中国山東省"; // 出身地
        String favoriteFood = "りんご、ラーメン"; // 好きな食べ物

        System.out.println("名前: "+ lastName + " " + firstName);
        System.out.println("出身地: "+ placeOfBirth);
        System.out.println("好きな食べ物: "+ favoriteFood);
      }
}
