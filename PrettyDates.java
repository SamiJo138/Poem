import static java.lang.System.out;

public class PrettyDates
{ 
    //---add methods here to make program work---
    public static String formatNumberAsTwoDigits(int a)
        {
            String sameNum=String.valueOf(a);
            String newNum="0" + String.valueOf(a);

        if (a>=10) {
            return sameNum;
        }
        
        if (a<10) {
            return newNum;
        }
  
        return "";
    }

    public static String nameFormat(int year, int month, int day)
    {
        out.println("");
        if (month==1)
        {
            out.print("January "+ day + ", "+ year);
        }
        if (month==2)
        {
            out.print("February " + day + ", " +year);
        }
        if (month==3)
        {
            out.print("March " + day + ", " +year);
        }
        if (month==4)
        {
            out.print("April " + day + ", " +year);
        }
        if (month==5)
        {
            out.print("May " + day + ", " +year);
        }
        if (month==6)
        {
            out.print("June " + day + ", " +year);
        }
        if (month==7)
        {
            out.print("July " + day + ", " +year);
        }
        if (month==8)
        { 
            out.print("August " + day + ", " +year);
        }
        if (month==9)
        {
            out.print("September " + day + ", " +year);
        }
        if (month==10)
        {
            out.print("October " + day + ", " +year);
        }
        if (month==11)
        {
            out.print("November "+ day + ", " +year);
        }
        if (month==12)
        {
            out.print("December " + day + ", " +year);
        }
            return "";
    }
  
    public static String slashFormat(int year, int month, int day)
    {
        return formatNumberAsTwoDigits(month)+ "/" + formatNumberAsTwoDigits(day) + "/" +year;
    }
    public static String dashFormat(int year, int month, int day)
    {
         return formatNumberAsTwoDigits(month) + "-" + formatNumberAsTwoDigits(day)+ "/" +year;
    }
       
    // don't change this code.
    public static void printDate(int year, int month, int day)
    {
         System.out.println(nameFormat(year, month, day));
         System.out.println(slashFormat(year, month, day));
         System.out.println(dashFormat(year, month, day));
         System.out.println();
    }
    // don't change this code.
    public static void main(String[]args)
    {
          System.out.println(formatNumberAsTwoDigits(3));
          System.out.println(formatNumberAsTwoDigits(9));
          System.out.println(formatNumberAsTwoDigits(10));
          System.out.println(formatNumberAsTwoDigits(12));

          printDate(2014, 10, 4);
          printDate(2015, 1, 1);
          printDate(2013, 12, 31);

    }
}
