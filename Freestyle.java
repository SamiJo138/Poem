
import static java.lang.System.out;

import java.util.Scanner;

public class Freestyle
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        int cdCount;
        System.out.println("How many CD Loot Crates would you like to purchase?");
        cdCount=keyboard.nextInt();
        
        int cdCostInDollars;
        System.out.println("How much does each CD Loot Crate cost?");
        cdCostInDollars=keyboard.nextInt();
        
        int priceInDollars=cdCount*cdCostInDollars;
        out.println("The order price is "+priceInDollars+" dollars.");
        
        if(cdCount>=2){
        out.println("You get a free sticker!");
    }
        else{
        out.println();
    }
            if(cdCount>=5){
            out.println("You get free shipping!");
        }
            else{
                out.println();
            }
    }
}