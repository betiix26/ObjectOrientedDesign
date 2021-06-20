package squareplugin;

import java.awt.Point;
import java.util.Scanner;

import interfaces.IDrawableElement;

public class Square implements IDrawableElement {
	private Scanner scanner = new Scanner(System.in);
    private Point point1;
    private Point point2;
    private String nume;
    
    public Square(){}

    public Square(Point p1, Point p2) {
        this.nume = "Patrat";
        this.point1 = new Point(Math.min(p1.x, p2.x), Math.max(p1.y, p2.y));
        this.point2 = new Point(Math.max(p1.x, p2.x), Math.min(p1.y, p2.y));
    }
    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public void getCoord() {
        System.out.print("Coordonatele sunt: P1(" + (int)this.point1.getX() + " , " + (int)this.point1.getY() + "), P2(" + (int)this.point2.getX() + " , " + (int)this.point2.getY() + ")");
    }

    @Override
    public void draw() {
        System.out.println("Patrat desenat");
    }

    @Override
    public void showShapeDetails() {
    	 int l = (int) (point1.getY() - point2.getY());
        System.out.print(this.nume);
        System.out.println();
        getCoord();
        System.out.println();
    }

    @Override
    public void readDetails() {
        this.nume = "Patrat";
        System.out.println("Introduceti coordonatele P1 si P2");
        this.point1 = new Point(scanner.nextInt(), scanner.nextInt());
        this.point2 = new Point(scanner.nextInt(), scanner.nextInt());
    }
}