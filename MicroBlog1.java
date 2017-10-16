import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

private class MicroBlog1
{
    Scanner keyboard=new Scanner(System.in);
    
    public void main(String[]args)
    {
        while(true){
            System.out.println("Welcome to MICROBLOG Edition 1! Enter your user name!");
            String name=keyboard.nextLine();
            System.out.println("Hello, "+userName+"!");
        }
    }

    public userName[] userInfo()
    {
        userName[] userName= new getUser[3];
       
        userName[0]=getUser("https://goo.gl/images/9MhB5i","PhoenixRising","Cory Spruce","CSpruce777@gmail.com");
        userName[1]=getUser("https://goo.gl/images/9uCRAd","AliceForest","Jesse Andes","Jandes@yahoo.com");
        userName[2]=getUser("https://goo.gl/images/rGOXMb","SideshowBob","Robert Underdunk Terwilliger","MurderBart123@sbcglobal.com");
        return getUser;
    }
    public static void printUser(userName[] userName)
    {
        for(int i=0; i<userName.length; i++)
        {
            system.out.println(i+" "+userName[i].getDescription());
        }
    }
    public static void askForPost(mbPost mbPost)
    {
        userName[] nextPostNum=Register.createUser();
        System.out.println("Enter the post number you'd like to view:1-5");
        int postNum;
        do{
            Register.printUser(nextPostNum);
            postNum=keyboard.nextInt();
            if(postNum!=5){
                post.add(nextPostNum[postNum]);
            }
            keyboard.skip("n");
        }while(postNum!=5);
    }
}
