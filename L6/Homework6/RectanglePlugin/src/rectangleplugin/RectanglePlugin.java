package rectangleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class RectanglePlugin implements IPluginsApp {
	  @Override
	    public String getUniqueNameText() {
	        return "RectanglePlugin";
	    }

	    @Override
	    public String getDisplayText() {
	        return "Dreptunghi";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Rectangle();
	    }

}
