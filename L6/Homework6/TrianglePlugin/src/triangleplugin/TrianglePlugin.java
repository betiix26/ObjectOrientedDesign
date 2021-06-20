package triangleplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

	public class TrianglePlugin implements IPluginsApp {
		  @Override
		    public String getNameShape() {
		        return "TriunghiPlugin";
		    }

		    @Override
		    public String getDisplayShape() {
		        return "Triunghi";
		    }

		    @Override
		    public IDrawableElement getShape() {
		        return new Triangle();
		    }
	}
