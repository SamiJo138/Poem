public class AreWeThereYet
{
public static void main(String[]args)
{
    Scanner keyboard=new Scanner(System.in);
    String areWeThereYet="";
    boolean keepGoing=true;
    while (keepGoing==true)
    
    System.out.println("Are we there yet?");
     areWeThere=keyboard.nextLine();
     if (areWeThere.equals("n")){
         keepGoing=False;
        }else if(areWeThere.equals("y")){
        return "YAY!";
        } else {
        return "Huh? I didn't understand that.";
        }
}
}