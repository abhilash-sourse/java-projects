import java.util.Scanner;;

public class quiz {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);

        String[] question = {"dbcjsdviusfhdscnsd ndvksd",
                             "n jboeffdsbvkdv s vdsnvdbbvuvbd",
                            "dsbvlhdsbviuvguidbvdkjsbvvksn ",
                            "ncb sdvbliubvjsdbvjdkv lkdsv",
                            "xzc blsdhvcusdivudsudscosdb"};

        String[][] options = {{"1aa","2aaa","3fff","4ssss"},{"1aa","2aaa","3fff","4ssss"},{"1aa","2aaa","3fff","4ssss"},{"1aa","2aaa","3fff","4ssss"},{"1aa","2aaa","3fff","4ssss"}};
        int[] answers = {3,1,2,4,2};
        int score = 0;
        int guess;


        System.out.println("*******************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("******************************");

        for(int i=0;i<question.length;i++){
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("*********");
                System.out.println("correct!");
                System.out.println("*********");
                score ++;
            }else{
                System.out.println("*********");
                System.out.println("Wrong!");
                System.out.println("*********");
            }
        }
        System.out.println("your final score is :" + score + "out of " + question.length);


        scanner.close();
    }
}
