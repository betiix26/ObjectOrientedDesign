package circleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class CirclePlugin implements IPluginsApp{


	    @Override
	    public String getUniqueNameText() {
	        return "CirclePlugin";
	    }

	    @Override
	    public String getDisplayText() {
	        return "Cerc";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Circle();
	    }
}
