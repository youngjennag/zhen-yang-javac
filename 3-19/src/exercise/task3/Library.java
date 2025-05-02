package exercise.task3;

public class Library {
    private static int availableBooks =  100; // 貸出可能な本の総数

    public static void borrowBook() {
        if (availableBooks > 0) {
            availableBooks --;
            System.out.println("1冊借りました");
            System.out.println("貸出可能な本: " + getAvailableBooks() + "冊");
        } else {
            System.out.println("エラー：貸出可能な本がありません"); 
        }
    }

    public static void returnBook() {
        availableBooks ++;
        System.out.println("本を返却しました");
        System.out.println("貸出可能な本: " + getAvailableBooks() + "冊");
    }

    public static int getAvailableBooks() {
        return availableBooks;
    }
}
