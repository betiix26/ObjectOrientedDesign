package squareplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class SquarePlugin implements IPluginsApp{

    @Override
    public String getUniqueNameText() {
        return "SquarePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Patrat";
    }

    public IDrawableElement getShape() {
        return new Square();
    }
}
