public class Main4 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6];

        // 予約済みの席を１に設定
        seats[0][2] = 1; //1行3列
        seats[1][1] = 1; //2行2列
        seats[1][4] = 1; //2行5列
        seats[3][0] = 1; //4行1列
        seats[3][5] = 1; //4行6列
        seats[4][2] = 1; //5行3列

        // 予約したい席を設定(3行4列)
        int reserveRow = 2;
        int reserveCol = 3;

        if (reserveRow < 0 || reserveRow >= 5 || reserveCol < 0 || reserveCol >= 6) {
            System.out.println("無効な座席番号です。");
        } else if (seats[reserveRow][reserveCol] == 1) {
            System.out.println("指定された席はすでに予約済みです。");
        } else {
            seats[reserveRow][reserveCol] = 1;

            // 席の状態を表示
            System.out.println("現在の席状況：");
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print("[" + seats[i][j] + "]");
                }
                System.out.println();
            }
            System.out.println();

            //メッセージを表示
            System.out.println((reserveRow + 1) + "行" + (reserveCol + 1) + "列の席を予約しました");
        }
    }   
}
