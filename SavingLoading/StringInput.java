import java.io.*; 

public class StringInput 
{ 
    private BufferedReader reader; 
     
    public StringInput() 
    { 
        reader = new BufferedReader(new InputStreamReader(System.in)); 
    } 
 
 
    public String enterData() //throws IOException 
    {          
        String input = null;
        boolean error = true;
        while(error){
            error = false;
            try{
                input = reader.readLine();
            } catch (IOException e) {
                error = true;
                System.out.println("There was a problem with your input, please enter again.");
            }
            if(input == null || input.equals("")){
                System.out.print("Please enter a value: ");
                error = true;
            }
        }
        return input;                        
    } 
} 
