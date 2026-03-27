import java.util.ArrayList;
import java.util.Scanner;

public class BankImplementation {

    public static void main(String[] args) {
        Bank sbi = new Bank();
        sbi.addAccount(1, "john", 2323.34);
        sbi.addAccount(2, "jane", 43534.32);

        Scanner sc = new Scanner(System.in);
        int cont = -1;

        while (cont != 0) {
            System.out.println("\n1. Add account");
            System.out.println("2. Withdraw from account");
            System.out.println("3. Deposit to account");
            System.out.println("4. Get balance");
            System.out.println("0. Exit");
            System.out.print("Selection: ");

            cont = sc.nextInt();

            switch (cont) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    sbi.addAccount(id, name, 0);
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    int accid = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();
                    sbi.withdraw(accid, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    int accid2 = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    sbi.deposit(accid2, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter id: ");
                    int id2 = sc.nextInt();
                    double bal = sbi.getAccBalance(id2);
                    System.out.println("Balance: " + bal);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        sc.close();
    }
}

class Bank {

    private ArrayList<Account> accounts;

    Bank() {
        this.accounts = new ArrayList<Account>();
    }

    void addAccount(int id, String name, double bankBalance) {
        accounts.add(new Account(id, name, bankBalance));
    }

    Account getAccount(int id) {
        for (Account acc : accounts) {
            if (acc.getId() == id) {
                return acc;
            }
        }
        return null;
    }

    double getAccBalance(int id) {
        Account acc = getAccount(id);
        return (acc != null) ? acc.getBalance() : -1;
    }

    void withdraw(int accId, double amt) {
        Account currAcc = this.getAccount(accId);
        if (currAcc != null) {
            if (currAcc.getBalance() >= amt) {
                currAcc.setBalance(currAcc.getBalance() - amt);
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    void deposit(int accId, double amt) {
        Account currAcc = this.getAccount(accId);
        if (currAcc != null) {
            currAcc.setBalance(currAcc.getBalance() + amt);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }
}

class Account {

    private int id;
    private String name;
    private double bankBalance;

    Account(int id, String name, double bankBalance) {
        this.id = id;
        this.name = name;
        this.bankBalance = bankBalance;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getBalance() {
        return bankBalance;
    }

    void setBalance(double amt) {
        bankBalance = amt;
    }
}
