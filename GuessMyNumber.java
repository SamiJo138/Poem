import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    public static void play()
    {
        Scanner keyboard=new Scanner(System.in);
         Random randomNum = new Random();
        System.out.println("I'm thinking of a number between 1 and 100. What is it?");
        System.out.println("Guess:");
        int cValue=randomNum.nextInt(100);
        int guess=0;
        while(guess!=cValue){
            guess=keyboard.nextInt();
            if (guess>cValue){
                System.out.println("LOWER!");
            }
            else if(guess<cValue)
            {
                System.out.println("HIGHER!");
            }
        }
        System.out.println("CONGRATULATIONS! You are the Winner! Your guess was correct.");
    }
    public static void main(String[]args)
    {
    Scanner keyboard=new Scanner(System.in);
        boolean keepPlaying=true;
        while(keepPlaying)
        {
            play();
            System.out.println("");
            System.out.println("Would you like To play again?");
            String answer=keyboard.nextLine();
            if (answer.equals("yes"))
            keepPlaying=true;
            else keepPlaying=false;
    }
}
}

