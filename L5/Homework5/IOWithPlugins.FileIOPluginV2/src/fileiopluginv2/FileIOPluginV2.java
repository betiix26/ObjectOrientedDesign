package fileiopluginv2;

import iowithplugins.abstractions.IIOPlugin;
import iowithplugins.abstractions.IInputDevice;
import iowithplugins.abstractions.IOutputDevice;

public class FileIOPluginV2 implements IIOPlugin{

	@Override
	public String getPluginName() {
		// TODO Auto-generated method stub
		return "FileIO" ;
	}

	@Override
	public IOutputDevice getOutputDevice() {
		// TODO Auto-generated method stub
		return new FileOutputDeviceV2();
	}

	@Override
	public IInputDevice getInputDevice() {
		// TODO Auto-generated method stub
		return new FileInputDeviceV2();
	}

}
