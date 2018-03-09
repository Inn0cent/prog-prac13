
/**
 * Write a description of class TimeItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeItem extends Item
{
    
    private int playingTime;

    /**
     * Constructor for objects of class TimeItem
     */
    public TimeItem(String theTitle, int time)
    {
        super(theTitle);
        playingTime = time;
    }
    
    public void print(){
        super.print();
        System.out.println("time: " + playingTime + " mins");
    }
}
