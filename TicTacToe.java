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
        gameBoard[0][0]=1;
        gameBoard[0][1]=2;
        gameBoard[0][2]=3;
        gameBoard[1][0]=4;
        gameBoard[1][1]=5;
        gameBoard[1][2]=6;
        gameBoard[2][0]=7;
        gameBoard[2][1]=8;
        gameBoard[2][2]=9;
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
                for (int column=0; column <3; column++){
                    if(board[row][column]==PLACEHOLDER){
                        return false;
                    }
                }
            return true;
    }

public static boolean isHorizontalWin(char[][] board)
{
    for (int row = 0; row < 3; row++)
    {
        if (board[row][0] != PLACEHOLDER && board[row][0] == board[row][1]
        && board[row][1] == board[row][2])
        {
        return true;
        }
    }
    return false;
    }

public static boolean isVerticalWin(char[][] board)
{
    for (int column=0; column<3; column++)
    {
        if (board[0][column]!=PLACEHOLDER && board[0][column]== board[0][column]
        && board[1][column] == board[2][column])
        {
            return true;
        }
    }
    return false;
}

public static boolean isDiagonalWin(char[][] board)
{
    if(board[0][0]!=PLACEHOLDER && board[0][0]==board[1][1] && board[1][1]== board[2][2])
    {
        return true;
    }
    if(board[0][2]!=PLACEHOLDER && board[0][2]==board[1][1] && board[1][1]==board[2][0])
    {
        return true;
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
        keyboard.nextLine();
        String answer=keyboard.nextLine();
       return (answer.equals("y"));
}
public static char getTokenAtPosition(int position, char[][] board)
{
    int row = (position - 1) / 3;
    int column = (position - 1) % 3;
    return board[row][column];
}
public static void placeToken(int position, char[][] board, boolean xTurn)
{
    int row=(position-1)/3;
    int column=(position-1)%3;
    
    if (xTurn){
        board[row][column]='X';
    }else{
        board[row][column]='O';
    }
}

public static void getPositionAndPlaceToken(char[][] board, boolean xTurn)
{
    boolean invalidInput = true;
    boolean full = true;
    int position = 0;
    
    do {
        if (xTurn){
            System.out.print("X where?");
        }else{
            System.out.print("O where?");
        }
        position=keyboard.nextInt();
        invalidInput=(position< 1 || position >9);
            
        if(invalidInput){
            System.out.println("Sorry, position" +position+ " is already full. Pick another.");
         }
    }while (full || invalidInput); 
    
    placeToken(position, board, xTurn);
}

public  void xTurn(String[][]x,int position){
        
        if (position==1){
            x[0][0]="[X]";}
        if (position==2){
            x[0][1]="[X]";
        }
        if (position==3){
            x[0][2]="[X]";
        }
        if (position==4){
            x[1][0]="[X]";
        }
        if (position==5){
            x[1][1]="[X]";
        }
        if (position==6){
            x[1][2]="[X]";
        }
        if (position==7){
            x[2][0]="[X]";
        }
        if (position==8){
            x[2][1]="[X]";
        }
        if (position==9){
            x[2][2]="[X]";
        }
        game();
    }
   
    public void oTurn(String[][]x,int position){
        if (position==1){
            x[0][0]="[O]";}
        if (position==2){
            x[0][1]="[O]";
        }
        if (position==3){
            x[0][2]="[O]";
        }
        if (position==4){
            x[1][0]="[O]";
        }
        if (position==5){
            x[1][1]="[O]";
        }
        if (position==6){
            x[1][2]="[O]";
        }
        if (position==7){
            x[2][0]="[O]";
        }
        if (position==8){
            x[2][1]="[O]";
        }
        if (position==9){
            x[2][2]="[O]";
        }
        game();
    }
    
public static void game()
{
    Scanner keyboard=new Scanner(System.in);
    int xWins = 0;
    int oWins = 0;
    int draws = 0;
    boolean doesXStart = true;
    boolean xTurn = doesXStart;
    
    printWelcome();
    
    char[][] gameBoard = createEmptyBoard();
    String [][]boardInitial={{"[1]","[2]","[3]"},{"[4]","[5]","[6]"},{"[7]","[8]","[9]"}};
    
    doesXStart = ! doesXStart;
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
    } else {
    }
    xTurn = ! xTurn;
    } while (gameStillGoing);
    System.out.println("Score: X=" + xWins + ", O=" + oWins + ", draws=" + draws);

        while(wantsToPlayAgain());
}


public static void main(String[]args)
{
    game();
    System.out.println("Goodbye!");
}
}
