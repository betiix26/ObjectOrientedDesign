package l2v2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Meniu {

	
	
	private static Scanner in = new Scanner(System.in);
	private static ArrayList<Student> studenti = new ArrayList<>();
			
	protected void DisplayMenu()
	{
		System.out.println("0 --> Iesire ");
		System.out.println("1 --> Adauga student ");
		System.out.println("2 --> Modifica student ");
		System.out.println("3 --> Sterge student ");
		System.out.println("4 --> Afisare studenti ");
		System.out.println("\n Introduceti optiunea dorita ");
		
	}
	public void Run()
	{
		int alegere = 0;
		
		do {
			
			try {
				
				DisplayMenu();
				alegere=in.nextInt();
				switch (alegere)
				{
				case 1 :
					adaugareStudent();
					break;
				case 2 :
					modificareStudent();
					break;
				case 3 :
					stergereStudent();
					break;
				case 4 :
					afisareStudenti();
					break;
				default :
					System.out.println("\n Alegeti o optiune valida ");
			}
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				continue;
			}
			finally 
			{
				System.out.println("\n");
			}
			}while (alegere !=0);
			System.out.println("Aplicatia se inchide ...");;
		}
		private void afisareStudenti()
		{
			System.out.println("Index\tNume\tPrenume\tAn\tSpecializare");
			
			for(Student curent: studenti)
			{
				studenti(curent);
			}
			in.nextLine();
			in.nextLine();
		}
		
		private void studenti(Student curentstud)
		{
			System.out.println((studenti.indexOf(curentstud)+1)+ "\t" + curentstud.getNume() + "\t" + curentstud.getPrenume() + "\t" + curentstud.getAn() + "\t" + curentstud.getSpecializare() );
		}
		
		private void modificareStudent()
		{
			System.out.println("Introduceti indexul studentului: ");
			int index = in.nextInt();
			System.out.println("Modificati numele studentului: ");
			String nume = in.next();
			System.out.println("Modificati prenumele studentului: ");
			String prenume = in.next();
			System.out.println("Modificati anul studentului: ");
			int an = in.nextInt();
			System.out.println("Modificati specializarea studentului: ");
			String specializare = in.next();
			
			studenti.set(index, new Student(nume, prenume, an, specializare));
		}
		
		private void adaugareStudent()
		{
			try
			{
				System.out.println("Nume ");
				String nume = in.next();
				System.out.println("Prenume ");
				String prenume = in.next();
				System.out.println("An ");
				int an = in.nextInt();
				System.out.println("Specializare ");
				String specializare = in.next();
				
				studenti.add(new Student(nume, prenume, an, specializare));
			}
			catch (InputMismatchException ex)
			{
				System.out.println("Eroare: " + ex.toString());
			}
		}
		
		private void stergereStudent()
		{
			System.out.println("Introduceti numele persoanei pe care doriti sa o modificati ");
			String nume = in.next();
			try {
				for(int i=0; i<studenti.size()-1;i++)
				{
					if(studenti.get(i).getNume().equals(nume) && studenti.get(i+1).getNume().equals(nume))
					{
						System.out.println("Introduceti prenumele persoanei pe care doriti sa o modificati ");
						String prenume = in.next();
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
	}

