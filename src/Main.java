public class Main {
    public static void main(String[] args) {
        int balance;
        int refill;
        int bonus;
        int balancesum;
        balance = 100;
        refill = 1100;
        if (refill > 1000) {
            bonus = refill / 100;
            balancesum = balance + refill + bonus;
        } else {
            balancesum = balance + refill;
            bonus = 0;
        }
        System.out.println("Баланс: "+ balancesum +" рублей");
        System.out.println( bonus +" бонуса(ов)");

    }

}

