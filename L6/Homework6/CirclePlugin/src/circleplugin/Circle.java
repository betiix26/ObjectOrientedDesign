package circleplugin;

import java.awt.Point;
import java.util.Scanner;

import interfaces.IDrawableElement;

public class Circle implements IDrawableElement {
	private Scanner scanner = new Scanner(System.in);
	private double raza;
    private Point punct;
    private String nume;

    public Circle(){}
    public Circle(Point p, double raza) {
        this.punct = p;
        this.raza = raza;
        this.nume = "Cerc";
    }

    @Override
    public void showShapeDetails() {
        System.out.print(this.nume);
        System.out.println();
        getCoord();
        System.out.println("\nRaza: " + this.getRaza());
        System.out.println();

    }

    @Override
    public void readDetails() {
        this.nume = "Cerc";
        System.out.println("Introduceti coordonatele P1 si P2:");
        this.punct = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println("Introduceti raza:");
        this.raza = scanner.nextInt();
    }

    public double getRaza() {
        return raza;
    }

    @Override
    public void getCoord() {
        System.out.print("Centru de coordonate: " + "P( " + (int)this.punct.getX() + " , " + (int)this.punct.getX() + " )");
    }

    @Override
    public void draw() {
        System.out.println("Cerc desenat");
    }

}
