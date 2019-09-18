import java.util.Scanner;

public class Classwork4 // class header
{
   public static void main(String[] args) // method header
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("What's your name?");
       String userName = scan.nextLine();
       
       if (userName.equals("Charlie") || userName.equals("charlie"))
        System.out.println("Great name!");
       else if (userName.equals("Cara") || userName.equals("cara"))
        System.out.println("hmm ... idk what to think about that, its a weird name");
       else
        System.out.println("I'm sure your name is ok");
       
        
       // determine if someone is terrible
       System.out.println("What's your name?");
       String name = scan.nextLine(); 
       
       System.out.println("What's your age?");
       double age = scan.nextDouble(); 
        
       System.out.println("Do you drive fast?");
       String driving = scan.next();  
       
       
       if (age == 17)
        if (name.equals("Rhys") || name.equals("rhys"))
            if (driving.equals("Yes") || driving.equals("yes"))
                System.out.println("You are terrible");
       else
        System.out.println("You are kind of terrible");
       
       
   }
    
}
