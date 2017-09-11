import static java.lang.System.out;
import java.util.Scanner;

public class Temperatures
{
    public static void main(String[]args)
    {
        System.out.print("Temperature Calculator");
        int sum=0;
        int[][]temps=new int[7][4];
        int[]timeAvgVal=new int[4];
        int overall=0;
        String[]daysOfWeek={"Sun", "Mon","Tue","Wed","Thu","Fri","Sat"};
        String[]timesOfDay={"3 AM", "7 AM", "3 PM", "7 PM"};
        int[][]tempsAtTime={
            {64,65,69,68,70,74,72},
            {68,70,76,70,68,71,75},
            {76,76,87,84,82,75,83},
            {73,72,81,78,76,73,77}
        };
        for (int day=0; day<daysOfWeek.length; day++)
        {
            for(int time=0; time<timesOfDay.length; time++)
            {
                temps[day][time]=tempsAtTime[time][day];
        }
    }

    for(int weekday=0; weekday<temps.length;weekday++)
    {
        for(int timeOfDay=0; timeOfDay< temps[weekday].length; timeOfDay++)
        {
        sum+=temps[weekday][timeOfDay];
        overall += temps[weekday][timeOfDay];
        timeAvgVal[timeOfDay] += temps[weekday][timeOfDay];
      }
      System.out.println(daysOfWeek[weekday] + ": "+ (sum / temps[weekday].length));
    }
    sum=0;
    
  for (int time=0; time<timeAvgVal.length; time ++)
  {
    System.out.println(timesOfDay[time] +": " + (timeAvgVal[time] / temps.length));
  }
  
  System.out.println("The final average temperature for the week was:");
  System.out.println("Overall: " + (overall / (daysOfWeek.length * timesOfDay.length)));
}
}
    