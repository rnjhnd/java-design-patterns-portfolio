public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
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