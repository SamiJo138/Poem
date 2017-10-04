
import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe
{
    static char PLACEHOLDER = '.';
    static char BOARD= '|';
    static Scanner keyboard = new Scanner(System.in);
 
    public static void drawBoard(char[][] board)
    {
        System.out.println();
        for (int row=0; row<3; row++){
            System.out.println(" "+board[row][0]+" | "+board[row][1]+" | " + board[row][2]);
        }
        System.out.println();
    }
    
    public static char[][] createEmptyBoard()
    {
        char[][] gameBoard = new char[3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                gameBoard[row][column] = PLACEHOLDER;
            }
        }
        return gameBoard;
    }
  
    public static boolean isWin(char[][] board)
    {
      return isHorizontalWin(board) || isVerticalWin(board) || isDiagonalWin(board);
    }
  
    public static boolean isFull(char[][] board) 
    {
      for(int row=0; row<3; row++) 
      {
        for (int column=0; column <3; column++)
        {
          if(board[row][column]==PLACEHOLDER)
          {
              return false;
          }
        }
      }
      return true;
    }

  public static boolean isHorizontalWin(char[][] board)
  {
    for (int row = 0; row < 3; row++)
    {
      if (board[row][0] != PLACEHOLDER || board[row][1] != PLACEHOLDER || board[row][2] != PLACEHOLDER)
      {
        if (board[row][0] == board[row][1]
        && board[row][1] == board[row][2])
        {
            return true;
        }
      }
    }
    return false;
  }

  public static boolean isVerticalWin(char[][] board)
  {
      for (int column=0; column<3; column++)
      {
        if(board[0][column] != PLACEHOLDER || board[1][column] != PLACEHOLDER || board[2][column] != PLACEHOLDER)
        {
          if (board[0][column] == board[1][column] && board[1][column] == board[2][column])
          {
              return true;
          }
        }
      }
      return false;
  }

  public static boolean isDiagonalWin(char[][] board)
  {
    if(board[0][0] !=PLACEHOLDER || board[1][1] !=PLACEHOLDER || board[2][2] !=PLACEHOLDER || board[0][2] !=PLACEHOLDER || board[2][0] !=PLACEHOLDER)
    {
      if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
      {
          return true;
      }
      if(board[0][2]==board[1][1] && board[1][1] == board[2][0])
      {
          return true;
      }
    }
      return false;
    }
  
    public static void printWelcome()
  {
        System.out.println("WELCOME TO TIC TAC TOE!");
        System.out.println("\nTo play, enter a number for which box to play in:");
        System.out.println("1 2 3\n4 5 6\n7 8 9");
        System.out.println("You'll need a buddy to play with. Ready to begin?");

  }

  public static boolean wantsToPlayAgain()
  {
      System.out.print("Would you like to play again? y/n");
      String answer=keyboard.nextLine();
              return(answer.equals("y"));
             
    }

  public static char getTokenAtPosition(int position, char[][] board)
  {
      int row = (position - 1) / 3;
      int column = (position - 1) % 3;
      return board[row][column];
  }
  
  public static boolean placeToken(int position, char[][] board, boolean xTurn)
  {
      int row=(position-1)/3;
      int column=(position-1)%3;
      if (board[row][column] != PLACEHOLDER) 
      {
        return false;
      }
    
      if (xTurn)
      {
          board[row][column]='X';
      }
        else
        {
          board[row][column]='O';
      }
        return true;
  }

  public static void getPositionAndPlaceToken(char[][] board, boolean xTurn)
  {
      boolean invalidInput = true;
      boolean full = true;
      int position = 0;

      if (xTurn)
      {
        System.out.print("X where?");
      }
      else
      {
        System.out.print("O where?");
      }
      position=keyboard.nextInt();
      invalidInput=(position< 1 || position >9);

      if(invalidInput)
      {
          System.out.println("Sorry, that is an invalid number. Please choose a number between 1 and 9");
      }

    if(!placeToken(position, board, xTurn)) 
    {
      System.out.println("Sorry, position " +position+ " is already full. Pick another.");
    }
  }

  public static void game()
  {
      Scanner keyboard=new Scanner(System.in);
      int xWins = 0;
      int oWins = 0;
      int draws = 0;
      boolean xTurn = true;

      printWelcome();

      char[][] gameBoard = createEmptyBoard();
      boolean gameStillGoing = true;
      drawBoard(gameBoard);

      do {
        getPositionAndPlaceToken(gameBoard, xTurn);
        drawBoard(gameBoard);
        if (isWin(gameBoard)) {
          gameStillGoing = false;
          if (xTurn) {
            xWins++;
            System.out.println("X wins!");
          } else {
            oWins++;
            System.out.println("O wins!");
          }
       } else if (isFull(gameBoard)) {
          gameStillGoing = false;
          draws++;
          System.out.println("The game is a draw.  Nobody wins.");
        }
      
      xTurn = ! xTurn;
    } while (gameStillGoing);
    System.out.println("Score: X=" + xWins + ", O=" + oWins + ", draws=" + draws);
    if(wantsToPlayAgain()){
      game();
    }
  }
  
  public static void main(String[]args)
  {
      game();
      System.out.println("\nGoodbye!");
  }
}
