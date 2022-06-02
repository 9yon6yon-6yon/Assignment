package FinalExamSpring2022.Q3;

class CreditCard {
    private double credit_limit;
    private double credit_current;


    public CreditCard(double limit) {
        //check and throw InvalidTxnException
        try {
            if (limit < 0) {
                throw new InvalidTxnException(limit + " is not a valid amount for the requested transaction");
            }
            credit_limit = limit;
            credit_current = 0;
        } catch (InvalidTxnException e) {
            System.out.println(e);
        }
    }

    public void withdraw(double amount) {
        //check and throw  InvalidTxnException
        try {
            if (amount < credit_current) {

                throw new InvalidTxnException(amount + " can't be withdrawn with current credit of " + credit_current + " for yor limit of " + credit_limit);
            }
        } catch (InvalidTxnException e) {
            System.out.println(e);
        }
        credit_current += amount;

    }

    public static class InvalidTxnException extends Exception {
        String str;

        public InvalidTxnException(String s) {
            this.str = s;

        }

        public String toString() {
            return str;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //handle the proper exception here with try-catch
        CreditCard c1 = new CreditCard(-5000);
        CreditCard c2 = new CreditCard(10000);
        c2.withdraw(7000);
        //handle the proper exception here with try-catch
        c2.withdraw(4000);

    }
}
