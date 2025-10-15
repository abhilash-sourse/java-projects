import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs){
        
        double balance = 0;
        boolean isRunnung = true;
        int choice;

        while (isRunnung) {
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
            case 1 : showbalance(balance); break;
            case 2 : balance += deposit();break;
            case 3 : balance -= withdraw(balance);break;
            case 4 : isRunnung = false;break;
            default: System.out.println("INVALID CHOICE");break;
            
        }
    }

        System.out.println("***************************");
        System.out.println("Thank you! have a nice day!");

        scanner.close();
    }

    


    static void showbalance(double balance){
        System.out.println("***************");
        System.out.printf("%.2f\n",balance);

    }
    static double deposit(){
        double amount;
        System.out.println("enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
        return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }

}
