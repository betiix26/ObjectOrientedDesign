package squareplugin;

import interfaces.IDrawableElement;
import interfaces.IPluginsApp;

public class SquarePlugin implements IPluginsApp{

    @Override
    public String getNameShape() {
        return "SquarePlugin";
    }

    @Override
    public String getDisplayShape() {
        return "Patrat";
    }

    public IDrawableElement getShape() {
        return new Square();
    }
}
