package fileioplugin;

import java.io.File;
import java.util.Scanner;

import iowithplugins.abstractions.IInputDevice;

public class FileInputDevice implements IInputDevice{

	public String ReadString()
	{
		try {
            File file = new File("D:\\Facultate CR2\\S2\\Informatica Aplicata\\IOWithPlugins.FileIOPlugin\\src\\fileioplugin\\input");
            Scanner scanner = new Scanner(file);
            String cuvinte="";
            while (scanner.hasNextLine()) {
                cuvinte+=scanner.nextLine();
                cuvinte+="\n";
            }
            return cuvinte;
        }
        catch(Exception e){
            System.out.println("nu vrea");
            return null;
        }

}
	}