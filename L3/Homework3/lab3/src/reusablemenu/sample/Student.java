package reusablemenu.sample;

import java.util.ArrayList;
import java.util.Collections;



public class Student implements Comparable<Student> { 
		
		
		private String nume;
		private String prenume;
		private int an;
		private String specializare;
		
		public Student (String nume, String prenume, int an, String specializare)
		{
			this.nume=nume;
			this.prenume=prenume;
			this.an=an;
			this.specializare=specializare;
		}


		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}

		public String getPrenume() {
			return prenume;
		}

		public void setPrenume(String prenume) {
			this.prenume = prenume;
		}

		public int getAn() {
			return an;
		}

		public void setAn(int an) {
			this.an = an;
		}

		public String getSpecializare() {
			return specializare;
		}

		public void setSpecializare(String specializare) {
			this.specializare = specializare;
		}

	
		public ArrayList<Student> sortAscending() {         
		    Collections.sort(this.studenti);         
		    return this.studenti;     
		  }   
		
		 private void studenti(Student curentstud)
		  { 
			   
			 System.out.println((studenti.indexOf(curentstud)+1)+ "\t" + curentstud.getNume() + "\t" + curentstud.getPrenume() + "\t" + curentstud.getAn() + "\t" + curentstud.getSpecializare() );
			
		}
		  
		// public ArrayList<Student> sortDescending() {         
		 //   Collections.sort(this.studenti, Collections.reverseOrder());         
		 //   return this.studenti;     
	//  } 
		  ArrayList<Student> studenti = new ArrayList<>();       

		  public Student(ArrayList<Student> studenti) {         
		    this.studenti = studenti;     
		  }
		 
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.nume.compareTo(o.getNume());
		}       


}
