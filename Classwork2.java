import java.util.Scanner;

public class Classwork2
{
  public static void main(String[] args)
  {
     //Construct a scanner object
     Scanner mySpecialScan = new Scanner(System.in);
    
     //Compare age to Cara's age
     System.out.println("Enter your age:");
     double userInput = mySpecialScan.nextDouble();
     double comparisonData = 17/userInput;
     System.out.println("Cara is " + comparisonData + " times your age");
     
     // Compare height to Cara's height
     Scanner height = new Scanner(System.in);
     System.out.println("Enter your height in inches:");
     double userHeight = height.nextDouble();
     double compareCara = 63/userHeight;
     System.out.println("Cara is " + compareCara + " times your height");
     
     // Compare shoe size to Cara's shoe size
     Scanner shoeSize = new Scanner(System.in);
     System.out.println("Enter your shoe size:");
     double userShoeSize = shoeSize.nextDouble();
     double compareCaraShoe = 6/userShoeSize;
     System.out.println("Cara is " + compareCaraShoe + " times your shoe size");
     
     // Compare hair length to Cara's hair length
     Scanner hairLength = new Scanner(System.in);
     System.out.println("Enter your hair length (estimate):");
     double userHairLength = hairLength.nextDouble();
     double compareCaraHair = 15/userHairLength;
     System.out.println("Cara's hair is " + compareCaraHair + " times longer than yours");
     
  }
}
