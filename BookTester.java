
/**
 * Write a description of class BookTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Old Man and the Sea", "Ernest Hemingway", 345);
        Book b2 = new Book("The Highly Sensitive Person", "Elaine Aron", 200);
        System.out.println(b1);
        System.out.println(b2);
        
        System.out.println(b1.getTitle());
        b1.setTitle("Hey");
        System.out.println(b1.getTitle());
        
        System.out.println(b1.getAuthor());
        b1.setAuthor("Cara");
        System.out.println(b1.getAuthor());
        
        System.out.println(b1.getPageNumber());
        b1.setPageNumber(350);
        System.out.println(b1.getPageNumber());
    }
}
