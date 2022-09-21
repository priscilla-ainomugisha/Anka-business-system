import java.io.*;

public class main {
    public static void maint(String [] uuu) throws FileNotFoundException, IOException{
        String filename = "my.txt";
        PrintWriter p=null;  
        System.out.print("This is the menu");
        BufferedReader b = null;
        String command= null;
        do{
        System.out.println("Enter a command");
        b=new BufferedReader(new InputStreamReader(System.in));
        //enter through keyboard

        b.readLine();
        p=new PrintWriter(new FileWriter (filename,true),true) ;
        p.print(command);

        p.println();
        p.close();
       }while(command.equalsIgnoreCase("Exit"));
    }
    
} 
