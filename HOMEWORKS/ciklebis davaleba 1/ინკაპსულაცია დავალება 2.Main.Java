public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("saba", 5000);
        BankAccount account2 = new BankAccount("nika", 1500);
        System.out.println("Account 1 Transaction History:");
        account1.printTransactionHistory();
        System.out.println("Account 2 Transaction History:");
        account2.printTransactionHistory();
        account1.transferMoney(account2, 500);
        System.out.println("Account 1 Transaction History:");
        account1.printTransactionHistory();
        System.out.println("Account 2 Transaction History:");
        account2.printTransactionHistory();
        account1.transferMoney(account2, 1200);
        account1.lockAccount();
        account1.transferMoney(account2, 200);
        account1.unlockAccount();
        account1.transferMoney(account2, 200);
        double depositAmount = account1.calculateDeposit(1000, 12);
        System.out.println("After 12 months, the deposit amount will be: " + depositAmount);
    }
}
