public class VSchorus{
    public static void played(String num)
    {
    System.out.println("This old man, he played "+num);
    System.out.println("He played knick-knack on my thumb;");
    System.out.println("With a knick-knack pattywhack,");
    System.out.println("Give the dog a bone;");
    System.out.println("This old man came rolling home.");
    System.out.println();
}
    public static void main(String[]args)
    {
       String[] nums={"one", "two", "three", "four", "five", "six"};
       for(int i=0; i<=5; i++)
       {
           played(nums[i]);
        }
}
}