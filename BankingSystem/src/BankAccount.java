public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String deposit(double depositAmount) throws BankAccountException{

        if(depositAmount <= 0){
            throw new BankAccountException();
        }
        setBalance(getBalance()+depositAmount);
        return "Deposit Successful";


    }

    public String withdrawal(double withdrawalAmount) throws InsufficientFundsException{
        if(withdrawalAmount < 0){
            throw new InsufficientFundsException();
        } else if (withdrawalAmount > getBalance()) {
            throw new InsufficientFundsException();
        }else {
            setBalance(getBalance()-withdrawalAmount);
            return "Withdrawal Successful";
        }
    }

    public void checkBalance(){
        System.out.println("Balance:"+getBalance());
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
