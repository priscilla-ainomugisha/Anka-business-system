import java.util.*;

import javax.tools.JavaCompiler;

import java.io.*;
public class Participant{
    public String name;
    public String password;
    public Date date_of_birth;
    
    public void setfirst_name (String first_name){
        name=first_name;
    }
    public void setparticipant_password (String participant_password){
        password= participant_password;
    }
    public static void main (String[]args) throws FileNotFoundException, IOException{
        //registering of participant
        String filename = "Ankaregister.txt";
        PrintWriter p;  
        BufferedReader b;
        String command=null;
        System.out.println("ENTER COMMAND");
        Scanner sc=new Scanner(System.in);
        command=sc.nextLine();
        
        if(command.contentEquals("register")){
        do{
        System.out.println("Enter name paswsword product date_of_birth");
        b=new BufferedReader(new InputStreamReader(System.in));//enter through keyboard
       command= b.readLine();

        p=new PrintWriter(new FileWriter (filename,true),true) ;
        p.print(command);

        p.println();
        p.close();
       }while(!("\n" != null));
       System.out.println("You have been registered");
    }

       //posting of product
    if(command.contentEquals("post_product")){
       System.out.println(" ");
       
        System.out.println("Enter product_name Description(quantity avilable and rate per item)");
        b=new BufferedReader(new InputStreamReader(System.in));//enter through keyboard
       command= b.readLine();

        p=new PrintWriter(new FileWriter (filename,true),true) ;
        p.println();
        p.print(command);
        p.println();
        if("\n" != null){System.out.println(" ");
            System.out.println("Product posted");
    }
        p.close();
       
       }
       if(command.contentEquals("performance")){
        System.out.println(" ");
    
}
} 
}  






 
    


  
 

