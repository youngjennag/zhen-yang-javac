public class Main4 {
    public static void main(String[] args){
        double maxHP = 1000.0; //最大HP
        double rate = 83.7; //割合（％）

        //現在HPを計算（割合をかける）し、int型にキャストして小数点以下を切り捨て
        int currentHP = (int)(maxHP * rate / 100);

        //結果を表示
        System.out.println("現在HP：" + currentHP);
    } 
}
