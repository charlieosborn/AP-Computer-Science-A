
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private String author;
    private int pageNumber;
    
    public Book(String t, String a, int p)
    {
        title = t;
        author = a;
        pageNumber = p;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setAuthor(String a)
    {
        author = a;
    }
    
    public void setPageNumber(int p)
    {
        pageNumber = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getPageNumber()
    {
        return pageNumber;
    }
    
    public String toString()
    {
        String objectData = "Title: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + pageNumber;
        return objectData;
    }
}
