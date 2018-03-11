import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 * Write a description of class LoadDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadDB
{ 
    
    public LoadDB()
    {
        
    }
    
    public ArrayList<Item> loadItems(String filename){
        
    }
    
    public Database deserialize(String filename){
        Database db = null;
        
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        
        try{
            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            
            db = (Database) ois.readObject();
        } catch (Exception ex){
            ex.printStackTrace();
        }  finally {

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
		return db;
    }
}
