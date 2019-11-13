
public class BalloonTester
{
   public static void main(String[] args)
   {
       Balloon b1 = new Balloon();
       Balloon superBalloon = new Balloon(100, "Red");
       System.out.println(superBalloon.getColor());
       System.out.println(superBalloon);
       System.out.println(b1.toString());
   }
}
