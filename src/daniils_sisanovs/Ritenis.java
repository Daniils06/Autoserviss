package daniils_sisanovs;

public class Ritenis {
	private int diametrs;
	private String tips;
	private boolean ziemas;

	public Ritenis(int diametrs, String tips, boolean ziemas) {
		this.diametrs = diametrs;
		this.tips = tips;
		this.ziemas = ziemas;
	}
	
	public String toString() {
		return "Ritenis: " + diametrs + " collu," + tips +
				", ziemas: " + ziemas;
	}
}