import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class mbUser
{
        public String webPic;
        public String userName;
        private String realName;
        public String emailAdd;
        
        public String userInfo(String webPic, String userName,
    String emailAdd)
    {
        this.webPic=webPic;
        this.userName=userName;
        this.realName=realName;
        this.emailAdd=emailAdd;
    }
         public String getUser()
    { 
        return webPic+"  " +userName+ " | "+emailAdd;
    }
        public String getUser()
        {
        return mbPost;
    }
}




