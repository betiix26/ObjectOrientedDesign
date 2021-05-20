package menu;

import java.util.ArrayList;
import java.util.Scanner;

import group.Group;

public class MeniuApp {

	private Scanner consoleScanner=new Scanner(System.in);
    private Menu mainMenu = null;
  
    
	public void load(Group grup)
    {
        
        ArrayList<IMenuItem> menuItems = new ArrayList();
        ArrayList<IMenuItem> showStudentsOptions = new ArrayList();
        
     
       IMenuItem currentItem = grup.addForma(1);
       menuItems.add(currentItem);
       
       currentItem = new MenuItem("Sterge forma", 2, (parameters)->{
    	   System.out.println(" Introduceti pozitia elementului pe care doriti sa il stergeti ");
			int optiune = consoleScanner.nextInt();
			grup.removeElement(optiune);
			System.out.println("Elementul a fost sters");
       });     
       menuItems.add(currentItem);
       
       currentItem = new MenuItem("Modifica forma", 3, (parameters)->{
    	   System.out.println("Introduceti pozitia elementului pe care doriti sa il modificati ");
			int opt = consoleScanner.nextInt();
			grup.getElement(opt).modifyElement();
       });     
       menuItems.add(currentItem);
       
       currentItem = new MenuItem("Vizualizare plansa de lucru", 4, (parameters)->{
			grup.draw();
			
       });     
       menuItems.add(currentItem);
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
    
}

