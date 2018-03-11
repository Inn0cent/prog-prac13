import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * Write a description of class SaveDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveDB
{
    
    LoadDB loader;
    
    public SaveDB()
    {
        loader = new LoadDB();
    }
    
    public void saveItem(String filename, Item item){
        ArrayList<Item> = loader.loadItems(filename);
    }

    public void serializeDB(String filename, Database db){
        FileOutputStream fout= null;
        ObjectOutputStream oos = null;
        try{
            fout = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(db);

            System.out.println("Done");
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
