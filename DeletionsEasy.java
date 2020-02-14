import java.util.*;

public class DeletionsEasy
{
    ArrayList<Integer> numbers = new ArrayList<>();
    
    public DeletionsEasy(ArrayList<Integer> a)
    {
        numbers = a;
    }
    
    public int delete()
    {
        int count = 0;
        
        while(numbers.size()>0)
        {
            
            int index = 0;
            for(int i = 0; i < numbers.size(); i++)
            {
                if(numbers.get(i) == 0)
                    index = i; 
            }
            if(index>0)
                {for(int i = index; i >= 0; i--)
                    numbers.remove(i);
                 count ++;
                 }
            
            int max = 0;
            int loc = 0;
            for(int i = 0; i < numbers.size(); i++)
            {
                if(numbers.get(i)>=max)
                    {max = numbers.get(i);
                     loc = i;}
            }
            
            if(max%2==0 && numbers.size() > 0)
                {numbers.set(loc, max-2);
                 count ++;}
            else if(max%2!= 0)
                {numbers.set(loc, max-1);
                 count ++;}
        }
        return count;
    }
}
