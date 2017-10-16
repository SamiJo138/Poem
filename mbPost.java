import java.util.ArrayList;
import java.util.Iterator;

public class mbPost
{
    public static int nextPostNum=0;
    
    public String mbPost; 
    public int postNum=1;
    public String userName;
    public String postComment;
    public String website;
    public ArrayList userInfo;
    
    public mbPost(String userName, int postNum, String postComment,
    String website)
    {
        this.postNum=nextPostNum;
        nextPostNum++;
        this.userName=userName;
        this.postComment=postComment;
        this.website=website;
    }
       public int getPostNum()
       {
        return postNum;
    }
        public void add(mbUser postNum)
        {
            userName.add(postNum);
        }
        public ArrayList getPost()
        {
            return postComment;
        }
    
        public String printPost()
        {
        microBlogPost[] post=new microBlogPost[3];
        post[0]=new microBlogPost("Phoenix Rising", "ONE:","I blessed the rains down in Africa.", "www.astro.com");
        post[1]=new microBlogPost("AliceForest","TWO:","What do you call a dear with no eyes?","www.azlyrics.com");
        post[2]=new microBlogPost("SemoreButts","THREE:","Ay Caramba!","www.jokes.cc.com");
        post[3]=new microBlogPost("SideshowBob","FOUR:","Soon I will kill you...","www.lifedeathprizes.com");
        
    }
    
}