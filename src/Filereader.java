import java.io.*;
public class Filereader{
    public static void main(String[] args) throws Exception{
        File file =new File("participant.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line =br.readLine()) !=null)
        System.out.println(line);
    }
}