import static java.lang.System.out;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String first = "Hello";
        out.print("Please type in the word Hello: ");
        String second = keyboard.next();

        if (second == first) {
            out.println("The == comparison is true.");
        } else {
            out.println("The == comparison is false.");
        }

        if (second.equals(first)) {
            out.println("The .equals comparison is true.");
        } else {
            out.println("The .equals comparison is false.");
        }

    }
}