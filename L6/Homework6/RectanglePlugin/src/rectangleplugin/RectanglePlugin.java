package rectangleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class RectanglePlugin implements IPluginsApp {
	  @Override
	    public String getNameShape() {
	        return "RectanglePlugin";
	    }

	    @Override
	    public String getDisplayShape() {
	        return "Dreptunghi";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Rectangle();
	    }

}
