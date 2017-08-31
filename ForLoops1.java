 import static java.lang.System.out;
 
 import java.util.Scanner;
 
 public class ForLoops1
 {
     public static void main (String[]args)
     {
         Scanner keyboard=new Scanner(System.in);
         int a;
         int b;
         int count;
         System.out.println("How big of a number should I count to?");
         count=keyboard.nextInt();
         int rows=count;
         while(rows++<1){
             for(a=1; a<=23; ++a) {
                 for(b=1;a<=; ++b) {
                     System.out.printf("%4d",(a*b));
                    }
                    System.out.println();
                }
            }
        }
    }
