

public class Giraffe
{
   // instance variables are the adjectives to describe your object
   private String name;
   private double neckLength;
   private int numOfSpots;
   
   //constructor definition 
   public Giraffe(String nam, double neck, int numSpots)
   {
       name = nam;
       neckLength = neck;
       numOfSpots = numSpots;
       
   
   } 
   
   // mutator method for changing private data
   public void setName(String n)
   {
       name = n;
       
   }
   
   //accessor method for accessing the private data
   public String getName()
   {
       return name;
   }
   
   public void setNeckLength(double neck)
   {
       neckLength = neck;
       
   }
   
   public double getNeckLength()
   {
       return neckLength;
   }
   
   public void setNumSpots(int spots)
   {
       numOfSpots = spots;
       
   }
   
   public int getNumSpots()
   {
       return numOfSpots;
   }
}
