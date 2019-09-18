import java.util.Scanner;

public class Classwork5
{
   public static void main(String[] args)
   {
       // Exercise 1
       /*
       for (int i = 0; i < 50; i += 1)
       {
         double randNum = (int)(Math.random()*6 + 1);
         System.out.println("you just rolled a: " + randNum);
           
       }
       
       // Exercise 2
       for (int i = 0; i < 50; i += 1)
       {
         double dice1 = (int)(Math.random()*6 + 1);
         double dice2 = (int)(Math.random()*6 + 1);
         double sum = dice1 + dice2;
         
         System.out.println("You rolled a sum of " + sum);
         if (sum == 7 || sum == 11)
            System.out.println("Yay! You win!");
         else if (sum == 2 || sum == 3 || sum == 12)
            System.out.println("You lose!");
         else
            System.out.println("Keep playing!");
       }
       */
       //Exercise 3
       /*
       System.out.println("Ask me a question:");
       Scanner scan = new Scanner(System.in);
       String question = scan.nextLine();
       
       double answer = (int)(Math.random()*7);
       if (answer == 0)
        System.out.println("You may never know");
       else if (answer == 1)
        System.out.println("Odds aren't looking too good");
       else if (answer == 2)
        System.out.println("That's a ridiculous question. Please ask me something else");
       else if (answer == 3)
        System.out.println("Well, it's a possibility");
       else if (answer == 4)
        System.out.println("I am tired, come back later");
       else if (answer == 5)
        System.out.println("50/50 chance");
       else if (answer == 6)
        System.out.println("If you ask again nicely");
       */
       /* 
       //Exercise 4
       System.out.println("How many sides do you wnat your dice to have?");
       Scanner side = new Scanner(System.in);
       int sides = side.nextInt();
       
       double rolls = (int)(Math.random() * sides + 1);
       
       if (sides < 1)
        System.out.println("Invalid Entry");
       else 
        System.out.println("Your program just rolled a " + rolls);
       */
      
       //Exercise 5
       
       for (int count = 0; count < 3; count += 1)
       {
       System.out.println("Guess my number between 1 and 10");
       Scanner scan = new Scanner(System.in);
       int guess = scan.nextInt();
       int number = (int)(Math.random()*10 +1);
       
       if (guess == number)
        System.out.println("You guessed my number! :)");
       else if (guess < number )
            System.out.println("Too low :(");
       else if (guess > number )
            System.out.println("Too high :(");   
       else if (count == 3 && (guess < number || guess > number))
        System.out.println("You have run out of guesses");
       
       }
       
   }    
}
