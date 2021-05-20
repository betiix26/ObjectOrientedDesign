package group;

import java.util.ArrayList;
import java.util.Scanner;

import circleplugin.Circle;
import interfaces.IDrawableElement;
import menu.IMenuItem;
import menu.Menu;
import menu.MenuItem;
import rectangleplugin.Rectangle;
import squareplugin.Square;
import triangleplugin.Triangle;

public class Group {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<IDrawableElement> elements = new ArrayList();
	
	public void addElement(IDrawableElement elementToAdd)
	
	{
		elements.add(elementToAdd);
	}
	public void removeElement(int i)
	{
		elements.remove(i);
	}
	
	public IDrawableElement getElement(int poz)
	{
		return elements.get(poz);
	}
	
	
	
	 public Menu addForma(int i)
	 
	    {
	    	ArrayList<IMenuItem> optiuni = new ArrayList<>();
	    	optiuni.add(new MenuItem("Adaugare patrat: ", 1, (parameters) -> {
	            
				System.out.println("Introduceti latura");
				double latura = scan.nextDouble();
				Square patrat = new Square(latura);
				elements.add(patrat);
				
	          }));
	    	optiuni.add(new MenuItem("Adaugare triunghi: ", 2, (parameters) -> {
	    	       
	    		System.out.println("Introduceti latura1");
				double latura1 = scan.nextDouble();
				System.out.println("Introduceti latura2");
				double latura2 = scan.nextDouble();
				System.out.println("Introduceti latura3");
				double latura3 = scan.nextDouble();
				Triangle triunghi = new Triangle(latura1, latura2, latura3);
				elements.add(triunghi);
	           }));
	    	optiuni.add(new MenuItem("Adaugare cerc: ", 3, (parameters) -> {
	 	       
	    		System.out.println("Introduceti ox");
				double ox1 = scan.nextDouble();
				System.out.println("Introduceti oy");
				double oy1 = scan.nextDouble();
				System.out.println("Introduceti raza");
				double radius1 = scan.nextDouble();
				Circle cerc = new Circle(ox1, oy1, radius1);
				elements.add(cerc);
	            }));
	    	
	    	optiuni.add(new MenuItem("Adaugare dreptunghi: ", 4, (parameters) -> {
		 	       
	    		System.out.println("Introduceti latime");
				double l1 = scan.nextDouble();
				System.out.println("Introduceti lungime");
				double l2 = scan.nextDouble();
				
				Rectangle rectangle = new Rectangle(l1,l2);
				elements.add(rectangle);
	            }));
	    	
	    	Menu menu = new Menu("Adauga forma: ", i, optiuni);
	    	
	    	return menu;
	    	
	    }

	public void draw() {
		
		 for(IDrawableElement element:elements)
		{
			element.draw();
		}
		
		
	}
}
