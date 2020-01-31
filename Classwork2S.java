import java.util.*;
import java.lang.Math.*;
/**
 * Write a description of class Classwork2S here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork2S
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        System.out.println("Question 1:");
        printElements(sports);
        System.out.println();
        
        System.out.println("Question 2:");
        insertElement(sports, "Football");
        printElements(sports);
        System.out.println();
        
        System.out.println("Question 3:");
        System.out.println(returnElement(sports, 3)); 
        System.out.println();
        
        System.out.println("Question 4:");
        removeThirdElement(sports);
        System.out.println();
        
        System.out.println("Question 5:");
        System.out.println(searchForElement(sports, "Soccer"));
        System.out.println();
        
        System.out.println("Question 6:");
        System.out.println(searchAndCountElement(sports, "Soccer"));
        System.out.println();
        
        System.out.println("Question 7:");
        copyAndReturnList(sports);
        printElements(copyAndReturnList(sports));
        System.out.println();
        
        System.out.println("Question 7:");
        System.out.println(shuffleElements(sports));
        System.out.println();
        
        System.out.println("Question 9:");
        reverseElements(sports);
        printElements(reverseElements(sports));
    }
    // #1
    public static void printElements(ArrayList<String> inList)
    {
        for(int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    // #2
    public static void insertElement(ArrayList<String> inList, String a)
    {
        inList.add(0, a);
    }
    // #3
    public static String returnElement(ArrayList<String> inList, int i)
    {
        return inList.get(i);
    }
    // #4
    public static void removeThirdElement(ArrayList<String> inList)
    {
        inList.remove(2);
        for(int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    // #5
    public static int searchForElement(ArrayList<String> inList, String a)
    {
        return inList.indexOf(a);
    }
    // #6
    public static int searchAndCountElement(ArrayList<String> inList, String a)
    {
        int count = 0;
        for(int i = 0; i < inList.size(); i++)
        {   if(inList.get(i).equals(a))
                count ++;
        }
        return count;
    }
    // #7
    public static ArrayList<String> copyAndReturnList(ArrayList<String> inList)
    {
        ArrayList<String> copy = new ArrayList<String>();
        for(int i = 0; i < inList.size(); i++)
            copy.add(inList.get(i));
        return copy;
    }
    // #8
    public static ArrayList<String> shuffleElements(ArrayList<String> inList)
    {
        ArrayList<String> shuffle = new ArrayList<String>();
        Random rand = new Random();
        for(int i = 0; i < 7; i++)
        {    shuffle.add(inList.get(rand.nextInt(inList.size())));
             inList.remove(inList.indexOf(inList.get(i)));
        }
        return shuffle;
    }
    // #9
    public static ArrayList<String> reverseElements(ArrayList<String> inList)
    {
        ArrayList<String> reverse = new ArrayList<String>();
        for(int i = inList.size()-1; i >= 0; i--)
            reverse.add(inList.get(i));
        return reverse;
    }
}
