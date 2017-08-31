import static java.lang.System.out;

import java.util.Scanner;

public class MultTableGrid
{ 
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("WELCOME to Multiplication Tables");
        System.out.println("\nHow large would you like to see them?");
        int size=keyboard.nextInt();
        if(size>20) {
           System.out.println("");
         }else{
            for (int a=0;a<=size; ++a) {
                out.printf("%4d", a);
            }
            System.out.println();
            
                for(int a=0; a<=size; ++a) {
                    out.printf("%4d   0" ,a);
                    for(int b=1; b<=size;++b) {
                        out.printf("%4d", a*b);
            }
            System.out.println();
           
        }
    }
}
}
