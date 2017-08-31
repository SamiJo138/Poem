import static java.lang.System.out;

import java.util.Scanner;

public class Entertainment
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        out.print("What is the weather like today?");
        out.println("sunny");
        out.println("cloudy");
        out.println("rainy");
        out.print(" Answer:");
        String weather=keyboard.nextLine();
        if (!weather.equals("sunny") && !weather.equals("cloudy") && !weather.equals("rainy")){
            out.println("Error: Your answer was not one of the valid options.");
        }
        
        out.println("What kind of mood are you in for activities?");
        out.println("exercise");
        out.println("party");
        out.println("quiet");
        out.print(" Answer:");
        String mood=keyboard.nextLine();
        if (!mood.equals("exercise") && !mood.equals("party") && !mood.equals("quiet")){
            out.println("Error: Your answer was not one of the valid options.");
        }
        
        if(weather.equals("sunny") && mood.equals("exercise")){
            out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
        } else if (weather.equals("sunny") && mood.equals("party")) {
            out.println("For a fun party on sunny day, look for a street festival.");
        } else if (weather.equals("sunny") && mood.equals("quiet")) {
            out.println("A sunny day is a beautiful time to sit under a tree and read a book.");
        } else if (weather.equals("cloudy") && mood.equals("exercise")){
            out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
        }else if (weather.equals("cloudy") && mood.equals("party")){
            out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
        }else if (weather.equals("cloudy") && mood.equals("quiet")){
            out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
        }else if (weather.equals("rainy") && mood.equals("exercise")) {
            out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
        } else if (weather.equals("rainy") && mood.equals("party")) {
            out.println("See if your friends are playing board games to pass a rainy day.");
        }else if (weather.equals("rainy") && mood.equals("quiet")){
            out.println("A rainly day is a peaceful time to journal and daydream.");
        }else{
            out.println();
        }
    }
}