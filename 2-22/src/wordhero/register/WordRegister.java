package wordhero.register;

import java.util.Scanner;
import wordhero.register.WordRegister;

/**
 * 単語の登録機能を担当するクラス
 */
public class WordRegister {
    // 英単語と日本語訳を保存する配列（最大20個）
    static String[] englishWords = new String[20];
    static String[] japaneseWords = new String[20];
    static int wordCount = 0; // 登録済み単語数

    // 単語を登録するメソッド
    public static void registerWords(Scanner scanner) {
        if (wordCount >= 20){
            System.out.println("登録できる単語数は最大20個までです。");
            return;
        }

        // 英単語の入力
        System.out.print("英単語を入力してください（半角）: ");
        String english = scanner.nextLine();  

        // 日本語訳の入力
        System.out.print("日本語訳を入力してください（全角）: ");
        String japanese = scanner.nextLine();  

        // 配列に保存
        englishWords[wordCount] = english;
        japaneseWords[wordCount] = japanese;
        wordCount++;

        System.out.println("登録しました。現在 " + wordCount + " 個の単語が登録されています。");
    }

    // 登録済み単語数を取得
    public static int getWordCount() {
        return wordCount;
    }

    // 指定されたインデックスの英単語を取得
    public static String getEnglish(int index) {
        return englishWords[index];
    }

    // 指定されたインデックスの日本語訳を取得
    public static String getJapanese(int index) {
        return japaneseWords[index];
    }
}
