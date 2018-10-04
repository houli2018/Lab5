import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.addNumber();
        /*
         * Implement this function
         */
    }
    public int getAccountNumber() {
        return this.accountNumber;

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAccountBalance(final double setBalance) {
        this.accountBalance = setBalance;
    }

    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }

    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }

    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
