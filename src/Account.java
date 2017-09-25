public class Account {
    private static int minimumBalance = 10000;
    private int initialDeposit;

    public static int getMinimumBalance() {
        return minimumBalance;
    }

    public Account(int initialDeposit) {

        this.initialDeposit = initialDeposit;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public boolean isValid() {
        return initialDeposit >= minimumBalance;
    }

}
