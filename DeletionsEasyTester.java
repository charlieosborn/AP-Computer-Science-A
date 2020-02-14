import java.util.*;

public class DeletionsEasyTester
{
    public static void main (String[] args)
    {
        ArrayList<Integer> tester = new ArrayList<>();
        tester.add(5);
        tester.add(5);
        tester.add(0);
        tester.add(6);
        tester.add(0);
        tester.add(4);
        tester.add(5);
        tester.add(4);
        
        
        DeletionsEasy testerArray = new DeletionsEasy(tester);
        System.out.print(testerArray.delete());
        
        
    }
}
