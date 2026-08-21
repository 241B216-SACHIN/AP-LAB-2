class SavingAccount extends BankAccount{
    SavingAccount(String num,double bal){
        super(num, bal);
    }
    public void withdraw(double amt){
        balance-= amt;
    }
}