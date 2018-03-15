
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
    
    public VideoGame(String args[]){
        super(args[1]);
        company = args[4];
        setOwn(Boolean.parseBoolean(args[2]));
        setComment(args[3]);
    }
    
    public String getCompany(){
        return company;
    }
    
    public String toString(){
        return "VG," + super.toString() + "," + company;
    }
    
    public void print(){
        super.print();
        System.out.println("company: " + company);
    }
}
