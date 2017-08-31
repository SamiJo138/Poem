import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        int goalForVeggies=50;
        int goalForBurgers=250;
        int goalForSubs=100;
        int goalForSoup=70;
        int goalMet=0;
        out.print("Checking sales goals.\n");
        out.println("The sales goal for veggie sandwiches is "+goalForVeggies+ ".\n");
        out.print("How many veggie sandwiches were sold today?\n");
        int veggies=keyboard.nextInt();
        if(veggies>=goalForVeggies){
            out.println("You made your goal for veggies!");
            goalMet++;
        }else {
            out.println("You fell short for veggies.");
        }
       
        out.print("The sales goal for burgers is "+goalForBurgers+".\n");
        out.print("How many burgers were sold today?\n");
        int burgers=keyboard.nextInt();
        if(burgers>=goalForBurgers){
            out.println("You made your goal for burgers!");
            goalMet++;
        }else{
            out.println("You fell short for burgers.");
        }
        
        
        out.print("The sales goal for subs is "+goalForSubs+".\n");
        out.print("How many subs were sold today?\n");
        int subs=keyboard.nextInt();
        if(subs>=goalForSubs){
            out.println("You made your goal for subs!");
            goalMet++;
        }else{
            out.println("You fell short for subs.");
        }
        
        out.print("The sales goal for soup is "+goalForSoup+".\n");
        out.print("How many soups were sold today?\n");
        int soups=keyboard.nextInt();
        if(soups>=goalForSoup){
            out.println("You made your goal for soup!");
            goalMet++;
        }else{
            out.println("You fell short for soup.");
        }
        
        if (goalMet == 4) {
    out.println("All Goals met! Everyone is now fired. Your robot replacements are here.");
}
    }
}