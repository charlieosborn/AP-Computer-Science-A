import java.util.Scanner;

public class Classwork7
{
    public static void main(String[] args)
    {
        System.out.println(findSum(2, 3));
        System.out.println(canIVote(17));
        System.out.println(canIVote(19));
        
        System.out.println("how old are you?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("Are you a good driver?");
        Scanner drive = new Scanner(System.in);
        String goodDriver = drive.nextLine();
        System.out.println(canIDrive(age, goodDriver));
    }
    
    public static double findSum(int a, int b)
    {
       return a + b; 
    }
    
    public static String canIVote(int age)
    {
       if (age >= 18)
        return "You can vote!";
       else
        return "You can't vote! :(";
    }
    
    public static String canIDrive(int age, String goodDriver)
    {
       if (age >= 16 && (goodDriver.equals("Yes") || goodDriver.equals("yes")))
        return "You can drive!";
       else if (age >= 16 && (goodDriver.equals("No") || goodDriver.equals("no")))
        return "You can drive, but idk if you should...";
       else
        return "You can't drive!";
    }
}
