import java.util.Scanner;

public class CurrencyExchangeCalculator {
    public static void main(String[] args) {
        System.out.println("How much usd you want to exchange: ");
        Scanner scanner = new Scanner(System.in);
        int amountUSD = scanner.nextInt();
        final int RATE = 23000;
        int amountVND = amountUSD * RATE;
        System.out.println("It will be: " + amountVND + " VND ");
    }
}
