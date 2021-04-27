package fileiopluginv2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import iowithplugins.abstractions.IOutputDevice;

public class FileOutputDeviceV2 implements IOutputDevice{

	@Override
	public void WriteString(String s) {
		FileOutputStream fileoutput = null;
		
		 try {
	            fileoutput = new FileOutputStream("output.txt");
	          PrintWriter writer = new PrintWriter(fileoutput);
	          writer.print(s);
	          writer.flush();
	         
		 }catch(FileNotFoundException e)
		 {
			 System.out.println("Eroare la deschiderea fisierului " + e.getMessage());
		 }
	          
	        catch (Exception ex){
	            System.out.println("Eroare " + ex.getMessage());
	        }
		 if(fileoutput != null)
		 {
			 try {
				 fileoutput.close();
			 }
			 catch(IOException ex)
			 {
				 
			 }
		 }

}
}
