

/**
 * @author Charlie Osborn
 */
public class Cara
{
    private double height;
    private String hairColor;
    private int age;
    
    /**
     * no-args constructor
     */
    public Cara()
    {
        height = 63;
        hairColor = "brown";
        age = 17;
    }
    
    /**
     * constructor will take three parameters
     * @param h height
     * @param hc hair color
     * @param a age
     */
    public Cara(double h, String hc, int a)
    {
        height = h;
        hairColor = hc;
        age = a;
    }
    
    /**
     * mutator method to change height
     * @param h new height
     */
    public void setHeight(double h)
    {
        height = h;
    }
    
    /**
     * mutator method to change hair color
     * @param hc new hair color
     */
    public void setHairColor(String hc)
    {
        hairColor = hc;
    }
    
    /**
     * mutator method to change age
     * @param a new age
     */
    public void setAge(int a)
    {
        age = a;
    }
    
    /**
     * accesor method to get height
     * @return height
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * accessor method to get hair color
     * @return hair color
     */
    public String getHairColor()
    {
        return hairColor;
    }
    
    /**
     * accesor method to get age
     * @return age
     */
    public int getAge()
    {
        return age;
    }
    
    public String toString()
    {
        String caraData = "Cara's height: " + height;
        caraData += "  Cara's hair color: " + hairColor;
        caraData += "  Cara's age: " + age;
        return caraData;
    }
    
    
    
    
    
}
