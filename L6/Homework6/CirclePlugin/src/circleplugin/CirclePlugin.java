package circleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class CirclePlugin implements IPluginsApp{


	    @Override
	    public String getNameShape() {
	        return "CirclePlugin";
	    }

	    @Override
	    public String getDisplayShape() {
	        return "Cerc";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Circle();
	    }
}
