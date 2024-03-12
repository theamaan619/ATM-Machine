import java.util.*;

public class Atm_WithoutFunction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int pin = 1234;
        System.out.println("Enter your Pin");
        int user_pin = obj.nextInt();
        int choice, Deposit, Withdrawl, Withdraw_Amount, /* Balance */ Account_Balance = 0;
        if (pin == user_pin) {
            while (true) {
                System.out.println("**************************");
                System.out.println("\n\tATM MENU");
                System.out.println("**************************");
                System.out.println("Press 1 for Deposit");
                System.out.println("Press 2 for Withdrawl");
                System.out.println("Press 3 for Balance");
                System.out.println("Press 4 for Exit");
                System.out.println("**************************");
                System.out.print("Enter Your Choice: ");
                choice = obj.nextInt();
                System.out.println("**************************");
                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount you want to deposite: ");
                        Deposit = obj.nextInt();
                        Account_Balance += Deposit;
                        System.out.println("You Have Deposited the  Amount Successfully");
                        break;
                    case 2:
                        System.out.print("How much do you want to withdraw? : ");
                        Withdraw_Amount = obj.nextInt();
                        Withdrawl = Account_Balance - Withdraw_Amount;
                        if (Withdraw_Amount < Account_Balance) {
                            System.out.println(
                                    "Your Amount  is  Rs." + Withdrawl
                                            + "\n You have withdrawn the amount successfully.");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                    case 3:
                        System.out.println("Your Current Balance is " + Account_Balance);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        break;
                }
            }
        } else {
            System.out.println("Invalid Pin");
        }
    }
}
