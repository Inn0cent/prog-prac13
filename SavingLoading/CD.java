/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends TimeItem
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }
    
    public CD(String args[]){
        super(args[1], Integer.parseInt(args[4]));
        setOwn(Boolean.parseBoolean(args[2]));
        setComment(args[3]);
        artist = args[5];
        numberOfTracks = Integer.parseInt(args[6]);
    }

    /**
     * @return The artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
    public String toString(){
        return "CD," + super.toString() + "," + artist + "," + numberOfTracks;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        super.print() ;
        System.out.println("artist: " + artist );
        System.out.println("tracks: " + numberOfTracks );
    }
   
}
