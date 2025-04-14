public class Main2 {
    public static void main(String[] args) {
        // 1から5の段を表示
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d × %d = %-2d%n", i , j, i * j);
            }
            System.out.println();
        }
    }
}
