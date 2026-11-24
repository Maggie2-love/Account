public class AccountApp {

    private int balance;

    public int getAccount() {
        return balance;
    }

    public void depositAccount(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;

        }
    }

    public boolean checkPassword(String mag24) {

        return mag24.equals("Mag24");
    }

    public void transferMoney(AccountApp account2, int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            account2.balance += amount;


        }
    }
        public void withdraw(int amount, String pin) {
            if (checkPassword(pin) && amount > 0 && amount <= getAccount()) {
                withdraw(amount);
            }
        }

    }

