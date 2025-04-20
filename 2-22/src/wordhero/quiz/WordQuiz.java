package wordhero.quiz;

import java.util.Scanner;
import wordhero.register.WordRegister;

/**
 * クイズ機能を担当するクラス
 */
public class WordQuiz {

    // クイズを開始するメソッド
    public static void startQuiz(Scanner scanner) {
        if (WordRegister.getWordCount() == 0) {
            System.out.println("単語が登録されていません");
            return;
        }
       
        int correct = 0; // 正解数

        // 繰り返してクイズ実施
        for (int i = 0; i < WordRegister.getWordCount(); i++) {
            System.out.println(WordRegister.getEnglish(i) + "の意味は？");
            String answer = scanner.nextLine();  
            System.out.println(answer);
            if (answer.equals(WordRegister.getJapanese(i))) {
                System.out.println("正解です！");
                correct++;
            } else {
                System.out.println("不正解です！");
            }
        }

        System.out.println("クイズ終了！");
        System.out.println(WordRegister.getWordCount() + "問中" + correct + "問正解でした！");

    }
}
