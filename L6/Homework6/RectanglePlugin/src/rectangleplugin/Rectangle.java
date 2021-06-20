package rectangleplugin;

import java.awt.Point;
import java.util.Scanner;

import interfaces.IDrawableElement;

public class Rectangle implements IDrawableElement{
    private Scanner scanner = new Scanner(System.in);
    private Point point1;
    private Point point2;
    private String nume;

    public Rectangle(){}

    public Rectangle(Point p1, Point p2) {
        this.nume = "Dreptunghi";
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
        System.out.print("Coordonatele: P1(" + (int)this.point1.getX() + " , " + (int)this.point1.getY() + "), P2(" + (int)this.point2.getX() + " , " + (int)this.point2.getY() + ")");
    }

    @Override
    public void draw() {
        System.out.println("Dreptunghi desenat");
    }

    @Override
    public void showShapeDetails() {
        System.out.print(this.nume);
        System.out.println();
        getCoord();
        System.out.println();
    }

    @Override
    public void readDetails() {
        this.nume = "Dreptunghi";
        System.out.println("Introduceti coordonatele pentru P1 si P2:");
        this.point1 = new Point(scanner.nextInt(), scanner.nextInt());
        this.point2 = new Point(scanner.nextInt(), scanner.nextInt());
    }
    }
	
	