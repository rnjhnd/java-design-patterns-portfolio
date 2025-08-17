public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + bankAccount.getBalance() * getInterestRate();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public void setBankAccount() {
        // Implementation can be provided if needed
    }
}