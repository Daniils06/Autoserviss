package daniils_sisanovs;

public class Sture {
	private String materials;
	private boolean apsilde;
	private boolean sporta;
	
	public Sture(String materials, boolean apsilde, boolean sporta) {
		this.materials = materials;
		this.apsilde = apsilde;
		this.sporta = sporta;
	}
	
	public String toString() {
		return "Stūre: " + materials +
				", apsilde: " + apsilde +
				", sporta: " + sporta;
	}
}