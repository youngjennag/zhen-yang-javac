public class Main5 {
    public static void main(String[] args){
        int selecttion = 3; // 商品番号

        switch (selecttion) {
            case 1:  // コーヒーを選んだ場合
                System.out.println("コーヒーを選びました");
                break;
            case 2:  // 紅茶を選んだ場合
                System.out.println("紅茶を選びました");
                break;
            case 3:  // ジュースを選んだ場合
                System.out.println("ジュースを選びました");
                break;
            default:  // 存在しないアイテム番号の場合
                System.out.println("無効な選択です");
                break;
        }
    }
}
