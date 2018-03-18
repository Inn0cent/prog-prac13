
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
/**
 * Write a description of class LoadDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadDB
{ 
    
    ArrayList<String> itemString;
    ArrayList<Item> items;
    
    public LoadDB()
    {
        itemString = new ArrayList<String>();
        items = new ArrayList<Item>();
    }

    public void loadItems(String filename){
        String line = null;
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                itemString.add(line);
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + filename + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "' instansiating with curent string");                  
        }
    }
    
    public ArrayList<Item> convertItems(){
        for(String its : itemString){
            String[] values = its.split(",");
            switch(values[0]){
                case "VG": items.add(new VideoGame(values)); break;
                case "CD": items.add(new CD(values)); break;
                case "DVD": items.add(new DVD(values)); break;
            }
        }
        return items;
    }
    
    public ArrayList<String> getItemString(){
        return itemString;
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
            System.out.println("Error reading file '" + filename + "'");
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
