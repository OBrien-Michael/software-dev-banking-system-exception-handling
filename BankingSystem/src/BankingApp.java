import java.util.LinkedList;

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

        LinkedList<BankAccount> bankAccountLinkedList = new LinkedList<BankAccount>();

        bankAccountLinkedList.add(new BankAccount(1,11));
        bankAccountLinkedList.add(new BankAccount(2,22));
        bankAccountLinkedList.add(new BankAccount(3,33));
        bankAccountLinkedList.add(new BankAccount(4,44));
        bankAccountLinkedList.add(new BankAccount(5,55));
        bankAccountLinkedList.add(new BankAccount(6,66));


        for (BankAccount bankAccount:bankAccountLinkedList) {
            System.out.println(bankAccount);
        }


    }
}