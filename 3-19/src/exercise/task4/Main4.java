package exercise.task4;

public class Main4 {
    public static void main(String[] args) {
        int dollar = 100;
        int euro = 80;
        int dollarToJpyBefore = ExchangeRate.toJPY("USD", dollar);
        System.out.println(dollar + "ドル = " + dollarToJpyBefore + "円");

        ExchangeRate.updateRates(150.0, 160.0);
        int dollarToJpyAfter = ExchangeRate.toJPY("USD", dollar);
        System.out.println(dollar + "ドル = " + dollarToJpyAfter + "円");

        int EuroToJpy = ExchangeRate.toJPY("EUR", euro);
        System.out.println(euro + "ユーロ = " + EuroToJpy + "円");


        







        
    }
    
}
