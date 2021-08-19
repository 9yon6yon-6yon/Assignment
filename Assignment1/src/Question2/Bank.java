package Question2;

import java.util.Scanner;

class Bankdetails {
    private String accountNumber;
    private String userName;
    private long Balance;
    Scanner scan = new Scanner(System.in);

    public void OpenAcc() {
        System.out.print("Enter Account Number : ");
        accountNumber = scan.next();
        System.out.print("Enter Name : ");
        userName = scan.next();
        System.out.print("Enter deposit value : ");
        Balance = scan.nextLong();
    }

    public void showAcc() {
        System.out.println("Account Name: " + userName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + Balance);
    }

    public void deposit() {
        long amount;
        System.out.print("Enter deposit amount: ");
        amount = scan.nextLong();
        Balance += amount;
    }

    public void withDraw() {
        long amount;
        System.out.print("Enter withdraw amount: ");
        amount = scan.nextLong();
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println("Balance: " + Balance);
        } else {
            System.out.println("Operation Failed!!--- Insufficient balance");
        }
    }

    public boolean search(String accnum) {
        if (accountNumber.equals(accnum)) {
            showAcc();
            return (true);
        }
        return (false);
    }
}

public class Bank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, option;
        System.out.println("How many number of input do you want? ");
        n = scan.nextInt();
        Bankdetails A[] = new Bankdetails[n];
        for (i = 0; i < A.length; i++) {
            A[i] = new Bankdetails();
            A[i].OpenAcc();
        }

        while (true) {
            System.out.println("\n\n\t\tBanking System Application\t\t\n");
            System.out.println("1. Display account details");
            System.out.println("2. Check Balance of an account");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    for (i = 0; i < A.length; i++) {
                        A[i].showAcc();
                        System.out.println("----------------");
                    }
                    break;
                case 2:
                    System.out.print("Enter Account number : ");
                    String accnum = scan.next();
                    boolean found = false;
                    for (i = 0; i < A.length; i++) {
                        found = A[i].search(accnum);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\t\t\t Account doesn't exits..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no : ");
                    accnum = scan.next();
                    found = false;
                    for (i = 0; i < A.length; i++) {
                        found = A[i].search(accnum);
                        if (found) {
                            A[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\t\t\t Account doesn't exits..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account number : ");
                    accnum = scan.next();
                    found = false;
                    for (i = 0; i < A.length; i++) {
                        found = A[i].search(accnum);
                        if (found) {
                            A[i].withDraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\t\t\t Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}
