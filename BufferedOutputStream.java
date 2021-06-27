import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;


public class BufferedOutputStream
 {
    public static void main(String[] args) throws IOException
 {
		
	BufferedReader br = null;
	FileReader fr =null;


	try {

		fr = new FileReader("japanese.txt");
		br = new BufferedReader(fr);


		int c;
		while ((c = br.read()) != -1) 
{
			System.out.print((char)c);
		}

			
	}
	catch(IOException ex)
 {
		
		System.err.println(ex.getMessage());
		
	}
	
	finally 
{
			if(fr!=null) fr.close();
			if(br!=null) br.close();

	}

}
}
