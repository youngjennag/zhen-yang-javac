public class Main1 {
    public static void main(String[] args) {
        //入力を設定
        String input = "Hello World";
        
        processString(input); //メソッドを呼び出す
    }
        /* 
         * 大文字に変換し、文字数をカウントする（スペースを含む）メソッド
         */
        public static void processString(String input) {
            // 大文字に変換
            String output = input.toUpperCase();

            // 文字数をカウントする（スペースを含む）
            int length = input.length();
    
            // 出力
            System.out.println("入力：\"" + input + "\"");
            System.out.println("出力：\"" + output + "\"");
            System.out.println("文字数：" + length);

        }
}