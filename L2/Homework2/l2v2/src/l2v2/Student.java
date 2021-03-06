package l2v2;

public class Student {
	
	
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

	@Override
	public String toString() {
		return "Student [nume=" + nume + ", prenume=" + prenume + ", an=" + an + ", specializare=" + specializare + "]";
	}
	
	

}
