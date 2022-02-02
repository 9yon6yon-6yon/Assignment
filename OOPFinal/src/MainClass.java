public class MainClass {
    public static void main(String[] args) {

        int[] acc = {100, 101, 102, 103, 104, 105};
        double[] balance = {2000, 1500, 900, 1560, 1765.50};
        System.out.println("Account No\t" + "Balance\t");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(acc[i] + "\t\t" + balance[i] + "\t");
                if (balance[i] < 1000) {
                    throw new MinimumBalanceException("Balance is low now");
                }
            } catch (MinimumBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static class MinimumBalanceException extends Exception {

        public MinimumBalanceException(String balance_is_low_now) {
            super(balance_is_low_now);
        }
    }
}