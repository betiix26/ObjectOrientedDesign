/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reusablemenu.sample;



import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


import reusablemenu.abstractions.IMenuItem;
import reusablemenu.implementation.Menu;
import reusablemenu.implementation.MenuItem;



/**
 *
 * @author catalin
 */
public class ApplicationMenu{
    
	private Scanner consoleScanner=new Scanner(System.in);
	private static ArrayList<Student> studenti = new ArrayList<>();
    private Menu mainMenu = null;
    public ApplicationMenu()
    {
                 
    }
    
	private void uiDeleteStudent() {
		System.out.println("Sterge student");
		System.out.println("Introduceti numele persoanei pe care doriti sa o stergeti ");
		String nume = consoleScanner.next();
		try {
			for(int i=0; i<studenti.size()-1;i++)
			{
				if(studenti.get(i).getNume().equals(nume) && studenti.get(i+1).getNume().equals(nume))
				{
					System.out.println("Introduceti prenumele persoanei pe care doriti sa o stergeti ");
					String prenume = consoleScanner.next();
					if(studenti.get(i).getPrenume().equals(prenume))
					{
						studenti.remove(i);
						System.out.println("Stergerea a fost efectuata ");
						break;
					}
				}
			}
			
		} catch(Exception ex) {
			System.out.println("Nu se poate sterge ");
		}
		
	}
    private void uiAddStudent() {
		System.out.println("Adauga student");
		
		try
		{
			System.out.println("Nume ");
			String nume = consoleScanner.next();
			System.out.println("Prenume ");
			String prenume = consoleScanner.next();
			System.out.println("An ");
			int an = consoleScanner.nextInt();
			System.out.println("Specializare ");
			String specializare = consoleScanner.next();
			
			studenti.add(new Student(nume, prenume, an, specializare));
		}
		catch (InputMismatchException ex)
		{
			System.out.println("Eroare: " + ex.toString());
		}
	}
    
    private void uiModifyStudent()
	{
		System.out.println("Introduceti indexul studentului: ");
		int index = consoleScanner.nextInt();
		System.out.println("Modificati numele studentului: ");
		String nume = consoleScanner.next();
		System.out.println("Modificati prenumele studentului: ");
		String prenume = consoleScanner.next();
		System.out.println("Modificati anul studentului: ");
		int an = consoleScanner.nextInt();
		System.out.println("Modificati specializarea studentului: ");
		String specializare = consoleScanner.next();
		
		studenti.set(index, new Student(nume, prenume, an, specializare));
	}
    
    private void studenti(reusablemenu.sample.Student curent) {
		// TODO Auto-generated method stub
		
	}
    
	public void load()
    {
        
        ArrayList<IMenuItem> menuItems = new ArrayList();
        ArrayList<IMenuItem> showStudentsOptions = new ArrayList();
        
        int shortCut = 1;    
        
         
       IMenuItem currentItem = new MenuItem("Adaugare student", shortCut++, (parameters)->{
           uiAddStudent();
       });       
       menuItems.add(currentItem);
       
       currentItem = new MenuItem("Sterge student", shortCut++, (parameters)->{
    	   	uiDeleteStudent();
       });     
       menuItems.add(currentItem);
       currentItem = new MenuItem("Modifica student", shortCut++, (parameters)->{
    	   uiModifyStudent();
       });
       menuItems.add(currentItem);      
       
       showStudentsOptions.add(new MenuItem("Ordonat crescator", 1, (parameters) -> {
    	 
    	   
    	   Collections.sort(studenti);
    	   System.out.println("Index\tNume\tPrenume\tAn\tSpecializare");
    	   
    	   for(int i=0; i<studenti.size();i++)
    	   {
    		  afisareStudent(studenti.get(i));
    	   }
    	System.out.println("Ordonare crescatoare executata");   
    	
       }));
       
       showStudentsOptions.add(new MenuItem("Ordonat decrescator", 2, (parameters) -> {
    	   
   
    	   Collections.sort(studenti);
    	   System.out.println("Index\tNume\tPrenume\tAn\tSpecializare");
    	   for(int i=studenti.size()-1; i>=0 ;i--)
    	   {
    		   afisareStudent(studenti.get(i));
    	   }
    	   
       	System.out.println("Ordonare descrescatoare executata");   
          }));
       
       
       currentItem = new Menu("Afiseaza studenti", shortCut++, showStudentsOptions);       
       menuItems.add(currentItem);
       
       
        
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
    
    
    private void afisareStudent(Student student)
	{
    	
		System.out.println((studenti.indexOf(student)+1)+ "\t" + student.getNume() + "\t" + student.getPrenume() + "\t" + student.getAn() + "\t" + student.getSpecializare() );
	}
    
}
