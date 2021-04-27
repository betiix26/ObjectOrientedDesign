package fileioplugin;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import iowithplugins.abstractions.IOutputDevice;

public class FileOutputDevice implements IOutputDevice{

	@Override
	public void WriteString(String s) {
		// TODO Auto-generated method stub
		 try {
	            File file = new File("D:\\Facultate CR2\\S2\\Informatica Aplicata\\IOWithPlugins.FileIOPlugin\\src\\fileioplugin\\output");
	            FileWriter fw = new FileWriter(file);
	            PrintWriter pw=new PrintWriter(fw);
	                pw.println(s);
	            pw.close();
	        }
	        catch (Exception e){
	            System.out.println("nu mere");
	        }
	}

}
