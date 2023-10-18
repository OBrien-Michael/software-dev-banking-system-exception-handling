import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        LinkedList bankAccountLinkedList = new LinkedList();

        while(!userInput.equals("5")){

        System.out.println("What would you like to do:\n");
        System.out.println("1. Add new bank account.\n");
        System.out.println("2. Deposit funds to existing account.\n");
        System.out.println("3. Withdraw funds from existing account.\n");
        System.out.println("4. Display all accounts.\n");
        System.out.println("5. Exit\n");
        userInput = scanner.nextLine();

        if(userInput.equals("1")){

            int accountNum;
            double balance;

            System.out.println("Please enter new bank account number:");

            userInput = scanner.nextLine();

            accountNum = Integer.parseInt(userInput);


            System.out.println("Please enter starting balance:");

            userInput = scanner.nextLine();

            balance = Double.parseDouble(userInput);


            BankAccount newBankAccount = new BankAccount(accountNum, balance);

            bankAccountLinkedList.add(newBankAccount);



            System.out.println("New Bank Account created.\n");

        } else if (userInput.equals("2")) {

            System.out.println("Please enter bank account number to deposit to:");

            bankAccountLinkedList.display();

            userInput = scanner.nextLine();



        } else if (userInput.equals("3")) {

        } else if (userInput.equals("4")) {

            bankAccountLinkedList.display();

        }
         else if (userInput.equals("5")) {
            System.out.println("Exiting.");
        }
        else {
            System.out.println("Wrong Input");
        }

        }


    }
}
