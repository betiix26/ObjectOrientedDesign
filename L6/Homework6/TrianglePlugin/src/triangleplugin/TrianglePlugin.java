package triangleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

	public class TrianglePlugin implements IPluginsApp {
		  @Override
		    public String getUniqueNameText() {
		        return "TrianglePlugin";
		    }

		    @Override
		    public String getDisplayText() {
		        return "Triunghi";
		    }

		    @Override
		    public IDrawableElement getShape() {
		        return new Triangle();
		    }
	}
