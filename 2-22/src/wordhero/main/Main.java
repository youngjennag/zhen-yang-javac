package wordhero.main;

import java.util.Scanner;
import wordhero.register.WordRegister;
import wordhero.quiz.WordQuiz;

/**
 * アプリの起動とメニュー処理を担当するクラス
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: 単語を登録する");
            System.out.println("2: クイズを受ける");
            System.out.println("3: 終了する");

            String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        WordRegister.registerWords(scanner); // 呼び出し
                        break;
                    case "2":
                        WordQuiz.startQuiz(scanner); // 呼び出し
                        break;
                    case "3":
                        System.out.println("アプリケーションを終了します。");
                        scanner.close(); // Scannerの終了
                        return;
                    default:
                        System.out.println("1-3の数字を入力してください");
                }
        }
    }
}
