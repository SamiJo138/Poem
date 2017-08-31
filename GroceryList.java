

import static java.lang.System.out;

import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        
        String item1;
        out.println("Item 1?");
        item1= keyboard.nextLine();
        
        out.println("");
        String item2;
        out.println("\nItem 2?");
        item2= keyboard.nextLine();
        
        out.println("");
        String item3;
        out.println("\nItem 3?");
        item3= keyboard.nextLine();

        out.println("\nNow, please enter the quantity of each item.");
        int quantityItem1;
        out.println("How many "+item1+"?");
        quantityItem1=keyboard.nextInt();
        
        out.println("");
        int quantityItem2;
        out.println("\nHow many "+item2+"?");
        quantityItem2=keyboard.nextInt();
        
        out.println("");
        int quantityItem3;
        out.println("\nHow many "+item3+"?");
        quantityItem3=keyboard.nextInt();
        
        out.println("\nNow, please enter the price of each item.");
        float priceItem1;
        out.println("How much does one "+item1+" cost?");
        priceItem1=keyboard.nextFloat();
        
        out.println("");
        float priceItem2;
        out.println("How much does one "+item2+" cost?");
        priceItem2=keyboard.nextFloat();
        
        out.println("");
        float priceItem3;
        out.println("How much does one "+item3+" cost?");
        priceItem3=keyboard.nextFloat();

        System.out.println("\nCalculate your grocery bill.");
        float totalCost;
        totalCost=(quantityItem1*priceItem1)+(quantityItem2*priceItem2)+(quantityItem3*priceItem3);
        out.printf("Your total cost is %.2f", totalCost);
    }
}