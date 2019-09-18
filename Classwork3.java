import java.util.Scanner;

public class Classwork3
{
   public static void main(String[] args)
   {
    /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a side length for your cube: ");  
    double s = scan.nextDouble();
    
    if (s > 0)
    {
      double volume = Math.pow(s,3);
      System.out.println("Volume: " + volume);
      
        
    }
    
    else
        System.out.println("Invalid entry");
    
    

    /** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        * from a user, and outputs one of the solutions to the equation.
        * 
        * Precondition: The user enters numbers, and not a special character or letter
        * Postcondition:If there aretwo solutions, the program outputs "two solutions." If there is 
        *               one solution, the program outputs "one solution" and if there are
        *               no solutions, the program outputs "no solution"
        */      
    
    System.out.println("Enter a: ");
    double a = scan.nextDouble();
    
    System.out.println("Enter b: ");
    double b = scan.nextDouble();
    
    System.out.println("Enter c: ");
    double c = scan.nextDouble();
    
    double discriminant = b*b - 4*a*c;
    if (discriminant < 0)
        System.out.println("No real solutions");
    else if (discriminant == 0)
        System.out.println("One Solution");
    else
        System.out.println("Two Solutions");
  
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your height in inches: ");
    double height = input.nextDouble();
    
    System.out.println("Enter your age: ");
    double age = input.nextDouble();
    
    System.out.println("Enter your shoe size: ");
    double shoeSize = input.nextDouble();
    
    System.out.println("Enter your name (all lowercase): ");
    String name = input.next();
    
    System.out.println("What is your favorite color (all lowercase): ");
    String color = input.next();
    
    System.out.println("What is your favorite subject in school (all lowercase): ");
    String subject = input.next();
    
    double caraHeight = 63;
    double caraAge = 17;
    double caraShoeSize = 6;
   
    
     double count = 0;
    if (height == caraHeight)
        count += 1;
    if (age == caraAge)
        count += 1;
    if (shoeSize == caraShoeSize)
        count += 1;
    if (name.equals("cara"))
        count += 1;  
    if (color.equals("blue"))
        count += 1;  
    if (subject.equals("math"))
        count += 1;  
    
    double caraPercent = (count/6.0)*100;
    System.out.println("You are " + caraPercent + "% like Cara");
        /**    
    if (count == 0)
        System.out.println("You are not Cara");
    else if (count == 1)
        System.out.println("You are 25% like Cara");
    else if (count == 2)
        System.out.println("You are 50% like Cara");
    else if (count == 3)
        System.out.println("You are 75% like Cara");
    else if (count == 4)
        System.out.println("You are 100% like Cara");    
    */    
        
        
        
        
    }
}

