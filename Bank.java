import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs){
        
        double balance = 0;
        boolean isRunnung = true;
        int choice;

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("1.show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("**************");

        System.out.print("Enter your choice (1-4)");
        choice = scanner.nextInt();

        switch(choice){
            case 1 : showBalance(balance);;
            case 2 : balance != balance + deposit();
            case 3 : balance = balance - withdraw(balance);
            case 4 : isRunnung = false; break;
            default: System.out.println("INVALID CHOICE");
            
        }

    }
    System.out.println("***************************");
    System.out.println("Thank you! have a nice day!");

    scanner.close();
}

    static void showbalance(double balance){

    }
