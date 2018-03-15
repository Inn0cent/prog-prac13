import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
/**
 * Write a description of class SaveDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveDB
{
    
    public SaveDB()
    {
        
    }
    
    public void saveItem(String filename, Item item){
        String data = item.toString();
        try{
            PrintWriter out = new PrintWriter(new FileWriter(filename, true));
            out.println(data);
            out.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + filename + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "' instansiating with curent string");                  
        }
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
