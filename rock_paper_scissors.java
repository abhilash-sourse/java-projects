import java.util.Scanner;
import java.util.Random;


public class rock_paper_scissors {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    String[] choices = {"rock","paper","scissors"};
    String playerChoice;
    String computerChoice;
    String PlayAgain;
    
    do{
        System.out.println("Enter your move (rock , paper, scissors):");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invaild choice");
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
            System.out.println("you win!");
        }else{
            System.out.println("you lose!");
        }

        System.out.println("Play again (yes/no) ");
        PlayAgain = scanner.nextLine().toLowerCase();

    }while(PlayAgain.equals("yes"));

    System.out.println("Thank you for playing...!");

    scanner.close();
    }
}
