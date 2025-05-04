public class Main3 {
    public static boolean validateUsername(String username) {
        boolean isValid = username.matches("(?!\\d+$)[a-zA-Z0-9_]{4,16}");
        return isValid;

    }

    public static boolean validatePassword(String password) {
        boolean isValid = password.matches("(?=.*[A-Z])(?=.*\\d).{8,}");
        return isValid;
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};

        System.out.println("ユーザー名チェック：");
        for (String username : usernames) {
            System.out.println(username + "：" + 
            (validateUsername(username) ? "有効" : "無効"));

        }

        System.out.println("パスワードチェック：");
        for (String password : passwords) {
            System.out.println(password + "：" + 
            (validatePassword(password) ? "有効" : "無効"));
        }
    }
    
}
