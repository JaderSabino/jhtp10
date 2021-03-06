import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        
        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);
        System.out.println();
        
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawn %.2f to account1 balance%n%n", withdrawalAmount);
        account1.withdrawal(withdrawalAmount);

        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawn %.2f to account2 balance%n%n", withdrawalAmount);
        account2.withdrawal(withdrawalAmount);

        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

    }

    public static void displayAccount(Account account) {
        System.out.printf("%s balance: $%.2f %n", account.getName(), account.getBalance());
    }
}
