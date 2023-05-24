public class Main {
    public static void main(String[] args) {
        int bonus;
        int balanceSum;
        int balance = 100;
        int refill = 1100;
        if (refill > 1000) {
            bonus = refill / 100;
            balanceSum = balance + refill + bonus;
        } else {
            balanceSum = balance + refill;
            bonus = 0;
        }
        System.out.println("Баланс: "+ balanceSum +" рублей");
        System.out.println( bonus +" бонуса(ов)");

    }

}

