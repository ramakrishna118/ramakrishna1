import java.io.*;
  
public class FileNotFound
{
  public static void main(String[] args) 
  {
         
   
    FileReader reader = new FileReader("file.txt");
      
    // passing FileReader to
    // buffered reader
    BufferedReader br = new BufferedReader(reader);
      
    // declaring empty string 
    String data =null;
      
    // while loop to read data 
    // and printing them
    while ((data = br.readLine()) != null) 
    {
        System.out.println(data);
    }
      
    // closing the object
    br.close();
  }
}