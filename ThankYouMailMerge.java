import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouMailMerge
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        String personName=""; 
        String yourDonation;
        while(!personName.equals("quit")){
            System.out.println("\nWhat is the donor's name?");
            personName=keyboard.nextLine();
            if(!personName.equals("quit")){
                System.out.println("How much did they donate?");
                yourDonation=keyboard.nextLine();
                System.out.println("---Thank You Letters---");
                System.out.println("Dear "+personName+",");
                System.out.println("\nThank you for your donation! We rely on donors");
                System.out.println("like you to keep our organization effective,");
                System.out.println("and you came through for us. Your donation of $"+yourDonation);
                System.out.println("will help out efforts to make a difference in the world.");
                System.out.println("\nAs you may know, we are a registered non-profit");
                System.out.println("organization, so your donations is tax deductable. You");
                System.out.println("may use this letter as a receipt for tax purposes.");
                System.out.println("\nThank you gain for your support!");
                System.out.println("\nSincerely,");
                System.out.println("Paula Jones");
                System.out.println("YourCharity.org");
            }
        
        }
    }
}