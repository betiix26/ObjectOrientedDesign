package fileioplugin;

import iowithplugins.abstractions.IIOPlugin;
import iowithplugins.abstractions.IInputDevice;
import iowithplugins.abstractions.IOutputDevice;

public class FileIOPlugin implements IIOPlugin {

	@Override
	public String getPluginName() {
		// TODO Auto-generated method stub
		return "FileIO";
	}

	@Override
	public IOutputDevice getOutputDevice() {
		// TODO Auto-generated method stub
		return new FileOutputDevice();
	}

	@Override
	public IInputDevice getInputDevice() {
		// TODO Auto-generated method stub
		return new FileInputDevice();
	}

}
