public class BankAccount {
    private String accountHolder;
    private double balance;
    private String[] transactionHistory;
    private boolean accountLock;
    private int transactionCount;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new String[10];
        this.accountLock = true;
        this.transactionCount = 0;
    }
    public void printTransactionHistory() {
        if (transactionCount == 0) {
            System.out.println("No transaction history available");
        } else {
            for (int i = 0; i < transactionCount; i++) {
                if (transactionHistory[i] != null) {
                    System.out.println(transactionHistory[i]);
                }
            }
        }
    }
    public boolean transferMoney(BankAccount toAccount, double amount) {
        if (!this.accountLock || !toAccount.accountLock) {
            System.out.println("Transaction failed: Account is locked");
            return false;
        }

        if (amount > 1000) {
            System.out.println("Transaction failed");
            return false;
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            toAccount.balance += amount;
            if (transactionCount < transactionHistory.length) {
                transactionHistory[transactionCount++] = "Transferred " + amount + " to " + toAccount.accountHolder;
            } else {
                shiftTransactions();
                transactionHistory[transactionCount - 1] = "Transferred " + amount + " to " + toAccount.accountHolder;
            }
            if (toAccount.transactionCount < toAccount.transactionHistory.length) {
                toAccount.transactionHistory[toAccount.transactionCount++] = "Received " + amount + " from " + this.accountHolder;
            } else {
                toAccount.shiftTransactions();
                toAccount.transactionHistory[toAccount.transactionCount - 1] = "Received " + amount + " from " + this.accountHolder;
            }

            System.out.println("Transaction successful");
            return true;
        } else {
            System.out.println("Transaction failed");
            return false;
        }
    }

    private void shiftTransactions() {
        for (int i = 1; i < transactionHistory.length; i++) {
            transactionHistory[i - 1] = transactionHistory[i];
        }
        transactionHistory[transactionHistory.length - 1] = null;
    }


    public void lockAccount() {
        this.accountLock = false;
        System.out.println("Account is now locked.");
    }

    public void unlockAccount() {
        this.accountLock = true;
        System.out.println("Account is now unlocked.");
    }


    public double calculateDeposit(double initialAmount, int months) {
        double finalAmount = initialAmount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public void setAccountLock(boolean accountLock) {
        this.accountLock = accountLock;
    }
}
