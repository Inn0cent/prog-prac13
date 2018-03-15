/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class DVD extends TimeItem 
{
    private String director;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }
    
    public DVD(String[] args){
        super(args[1], Integer.parseInt(args[4]));
        setOwn(Boolean.parseBoolean(args[2]));
        setComment(args[3]);
        director = args[5];
    }

    /**
     * @return The director for this DVD.
     */
    public String getDirector()
    {
        return director;
    }
    
    public String toString(){
        return "DVD," + super.toString() + "," + director;
    }
    
    public void print(){
        super.print() ;
        System.out.println("director: " + director );
    }
}
