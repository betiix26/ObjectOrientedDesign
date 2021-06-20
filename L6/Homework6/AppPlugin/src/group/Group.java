package group;
import interfaces.IDrawableElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.IDrawableElement;

import java.awt.Point;

public class Group {
    private IDrawableElement shape;
    private ArrayList<IDrawableElement> shapes = new ArrayList<>();

    public List<IDrawableElement> getShapeList() {
        return shapes;
    }
    
    public void setShape(IDrawableElement shape){
        this.shape = shape;
    }
   

    public void add(){
        shape.readDetails();
        shapes.add(shape);
        shape.draw();
        shape.showShapeDetails();
    }

    public void printShapes() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.print((i + 1) + ". ");
            shapes.get(i).showShapeDetails();
        }
    }

    public void editShape(int position) {
        position = position - 1;
        if(shapes.get(position) != null){
            shapes.get(position).readDetails();
        }
    }
    
    public void deleteShape(int pos) {
        pos = pos - 1;
        for (int i = 0; i < shapes.size(); i++) {
            if (pos == i) {
                shapes.remove(i);
            }
        }
    }

}