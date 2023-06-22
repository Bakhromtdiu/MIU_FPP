
public class CustomerAccount {

    private String Cus_name;
    private double Acc_No;
    private double Balance;

    public boolean deposit(double amount) {
        if (amount < 0)
            return false;
        Balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws Exception {
        if (Balance < 100) {
            return false;
        }

        if (amount > Balance)
            throw new InsufficientBalanceException("amount exceeds balance");
        Balance -= amount;
        return true;
    }

    public double getBalance() {
        return Balance;
    }
}
