import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessNum2Player
{
     public static void main(String[]args)
    {
        int guesses;
        int max = 100;
        int min=1;
        int numTries;;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Player 1 name:");
          String p1Name=keyboard.next();      
          System.out.println("");
          System.out.println("Player 2 name:");
          String p2Name=keyboard.next();
          System.out.println("");
          System.out.println("I'm thinking of a number between 1 and 100. What is it?");
          gameOver(random(min, max), p1Name, p2Name, 0);
    }
    public static int random (int min, int max)
        {
        long seed = System.currentTimeMillis();
        Random r = new Random(seed);
        int theNum=r.nextInt(max);
        return theNum;
    }
        public static void gameOver(int answer, String p1Name, String p2Name, int numTries)
        {
            int theNum=answer;
            String currentPlayer;
            String nextPlayer;
            Scanner keyboard=new Scanner(System.in);
            while(numTries<10){
                if(numTries%2==0){
            currentPlayer=p1Name;
            nextPlayer=p2Name;
           }else{
                currentPlayer=p2Name;
                nextPlayer=p1Name;
            }
        
            System.out.println(currentPlayer+":");
            int guessOne=keyboard.nextInt();
            numTries++;
               if(guessOne==theNum){
                   gameOver(currentPlayer);
                   return;
                }else if (guessOne<theNum){
                    System.out.println("\nToo low! "+nextPlayer+"'s turn.");
                }else if (guessOne>theNum) {
                    System.out.println("\nToo high! "+nextPlayer+"'s turn.");
                }
            }
            if (numTries>=10){
                numTries=0;
                gameOver(answer);
            }
        }
                    public static void gameOver(int answer)
                    {
                        System.out.println("You have no more guesses left! The number was " +answer+". YOU BOTH LOSE!!!");
                    }
                    public static void gameOver(String name)
                    {
                        System.out.println("CORRECT "+name+"! YOU WIN!!!");
                        System.out.println("  ");
                }
            }

            
    
