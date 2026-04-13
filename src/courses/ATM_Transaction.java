package courses;
import java.util.Scanner;
public class ATM_Transaction {
    public static void main(String[] args) {

        int balance=10000,withdraw=0,deposit=0,transfer=0;
        String history="transaction History:\n";

        // let's add a pin check here

        int pin=1234;
        int enteredPin;
        int attempts=0;

        Scanner scanner = new Scanner(System.in);

        while(attempts<3){
            System.out.println("Enter pin:");
            enteredPin=scanner.nextInt();
            if(enteredPin==pin){
                break;
            }else{
                attempts++;
                System.out.println("Wrong pin");
                if(attempts==3){
                    System.out.println("Too many attempts😩😩😩!.Card blocked.");
                    scanner.close();
                    return;
                }
            }
        }


        while(true){
            System.out.print("\nAutomated Teller Machine :");
            System.out.println("\nChoose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for transfer");
            System.out.println("Choose 4 for check for balance");
            System.out.println("Choose 5 for mini statement");
            System.out.println("Choose 6 for exit");
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw=scanner.nextInt();
                    if(withdraw<=0){
                        System.out.println("Please enter a valid amount");
                    } else if (withdraw>balance) {
                        System.out.println("Insufficient balance");

                    }else {
                        balance-=withdraw;
                        history += "Withdrawn: " + withdraw + ", Balance: " + balance + "\n";

                    }

                    // RECEIPT
                    System.out.println("----- RECEIPT -----");
                    System.out.println("Transaction: Withdrawal");
                    System.out.println("Amount: " + withdraw);
                    System.out.println("Available Balance: " + balance);
                    System.out.println("-------------------");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit=scanner.nextInt();
                    balance+=deposit;
                    System.out.println("Deposit Successful");
                    history += "Deposited: " + deposit + ", Balance: " + balance + "\n";

                    // receipt

                    System.out.println("----- RECEIPT -----");
                    System.out.println("Transaction: Deposit");
                    System.out.println("Amount: " + deposit);
                    System.out.println("Available Balance: " + balance);
                    System.out.println("-------------------");

                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    transfer = scanner.nextInt();

                    if (transfer <= 0) {
                        System.out.println("Enter a valid transfer amount.");
                    } else if (transfer > balance) {
                        System.out.println("Transfer failed, insufficient balance.");
                    } else {
                        balance -= transfer;
                        System.out.println("Transfer successful.");
                        history += "Transferred: " + transfer + ", Balance: " + balance + "\n";
                        System.out.println("Remaining balance is " + balance);


                    }
                    System.out.println("\n----- RECEIPT -----\n");
                    System.out.println("Transaction: Transfer");
                    System.out.println("Amount: " + transfer);
                    System.out.println("Available Balance: " + balance);
                    System.out.println("-------------------");


                    break;

                case 4:
                    System.out.println("Current balance: " + balance);
                    break;
                case 5:
                    System.out.println(history);
                    break;


                case 6:
                    scanner.close();
                    System.out.println("Thank you for using our bank system💥💱💱💱💵💵💵💶💶💶💷💷💷🏧🏧🏧🏧.");

                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select 1 to 4.");

            }
        }
    }
}
