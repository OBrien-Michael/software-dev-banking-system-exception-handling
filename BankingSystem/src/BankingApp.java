public class BankingApp {
    public static void main(String[] args) {

        BankAccount accountOne = new BankAccount(10,100);


        try {
            System.out.print(accountOne.deposit(0.0));
        } catch (BankAccountException exception) {
            System.out.println(exception);
        }

        try {
            System.out.print(accountOne.withdrawal(-1));
        } catch (InsufficientFundsException exception) {
            System.out.println(exception);
        }

        try {
            System.out.print(accountOne.withdrawal(200));
        } catch (InsufficientFundsException exception) {
            System.out.println(exception);
        }

        try {
            System.out.print(accountOne.deposit(10));
        } catch (BankAccountException exception) {
            System.out.println(exception);
        }

        try {
            System.out.print(accountOne.withdrawal(50));
        } catch (InsufficientFundsException exception) {
            System.out.println(exception);
        }

        System.out.print(accountOne.checkBalance());

    }
}