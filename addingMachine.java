import static java.lang.System.out;
import java.util.Scanner;

public class addingMachine
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        out.println("Welcome to Adding Machine!\nTotal: 0");
        int a=0;
        int b=keyboard.nextInt();
        int numNums=0;
        int finalTotal=0;
        out.println("Add:"+(a+b));
        out.println("Total:"+b);
       while (keyboard.nextInt() >0){
           a=a+keyboard.nextInt();
           numNums++;
    }
           if (keyboard.nextInt==0){
               int i=0;
               for (Integer input:inputs){
                   if(i==0){
                       out.println(input);
                    }else{
                        out.println("+" +input);
                    }
                    i++;
                }
            out.println("You entered "+numNums+" numbers, for a final total of "+a);
    }
}
}
       
   
 