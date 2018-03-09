
/**
 * Write a description of class VideoGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VideoGame extends Item
{
    
    private String company;
    
    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String theTitle, String theCompany)
    {
        super(theTitle);
        company = theCompany;
    }
    
    public String getCompany(){
        return company;
    }
    
    public void print(){
        super.print();
        System.out.println("company: " + company);
    }
}
