import java.util.Scanner;
import java.util.Random;

public class dice {
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll:");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){
            for(int i=0;i<numOfDice;i++){
                int roll  = random.nextInt(1 ,7);
                System.out.println("You rolled: " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total: "+ total );
        }else{
            System.out.println("# of dice must be greater than 0");
        }
        scanner.close();
    }
       static void printDie(int roll) {
        switch (roll) {
            case 1 : System.out.println("""
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """);
                break;
            case 2 : System.out.println("""
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """);
                break;
            case 3 : System.out.println("""
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                """);
                break;
            case 4 : System.out.println("""
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """);
                break;
            case 5 : System.out.println("""
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """);
                break;
            case 6 : System.out.println("""
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """);
                break;
        }
        }
    
}
