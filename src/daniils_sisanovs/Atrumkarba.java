package daniils_sisanovs;

public class Atrumkarba {
	private String tips;
	private int atrumuSkaits;
	private boolean automats;
	
	public Atrumkarba(String tips, int atrumuSkaits, boolean automats) {
		this.tips = tips;
		this.atrumuSkaits = atrumuSkaits;
		this.automats = automats;
	}
	
	public String toString() {
		return "Ātrumkarba: " + tips +
				", ātrumi: " + atrumuSkaits +
				", automāts: " + automats; 
	}
}