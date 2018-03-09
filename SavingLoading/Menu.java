
public class Menu
{
    
    Database db;
    StringInput input;
    SaveDB saver;
    LoadDB loader;
    
    public Menu(Database db)
    {
        this.db = db;
        input = new StringInput();
        saver = new SaveDB();
        loader = new LoadDB();
    }
    
    public void selectOption(){
        int option = outputOptions();
        switch(option){
            case 1: db.addItem(addVG()); break;
            case 2: db.addItem(addCD()); break;
            case 3: db.addItem(addDVD()); break;
            case 4: save(); break;
            case 5: load(); break;
            default: System.out.println("Invalid entry");
        }
    }
    
    public VideoGame addVG(){
        String title;
        String comp;
        System.out.print("Title: ");
        title = input.enterData();
        System.out.println();
        System.out.print("Company: ");
        comp = input.enterData();
        return new VideoGame(title, comp);
    }
    
    public CD addCD(){
        String title;
        String artist;
        int tracks;
        int time;
        System.out.print("Title: ");
        title = input.enterData();
        System.out.println();
        System.out.print("Artist: ");
        artist = input.enterData();
        System.out.println();
        System.out.println("Num tracks: ");
        tracks = Integer.parseInt(input.enterData());
        System.out.println();
        System.out.println("Time: ");
        time = Integer.parseInt(input.enterData());
        return new CD(title, artist, tracks, time);
    }
    
    public DVD addDVD(){
        String title;
        String director;
        int time;
        System.out.print("Title: ");
        title = input.enterData();
        System.out.println();
        System.out.print("Director: ");
        director = input.enterData();
        System.out.println();
        System.out.println("Time: ");
        time = Integer.parseInt(input.enterData());
        return new DVD(title, director, time);
    }
    
    public void save(){
        String filename;
        System.out.print("Filename: ");
        filename = input.enterData();
        saver.serializeDB(filename, db);
    }
    
    public void load(){
        String filename;
        System.out.print("Filename: ");
        filename = input.enterData();
        db = loader.deserialize(filename);
    }
    
    public int outputOptions(){
        System.out.println();
        System.out.println("1: Add a video game");
        System.out.println("2: Add a CD");
        System.out.println("3: Add a DVD");
        System.out.println("4: Save the database");
        System.out.println("5: Load a database");
        System.out.print("Select: ");
        return Integer.parseInt(input.enterData());
    }
}
