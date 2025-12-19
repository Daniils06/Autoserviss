package daniils_sisanovs;

public class Automasina {
	private Motors motors;
	private Atrumkarba atrumkarba;
	private Ritenis ritenis;
	private Sture sture;
	private int atrums;
	
	public Automasina(Motors motors, Atrumkarba atrumkarba, 
			Ritenis ritenis, Sture sture) {
		this.motors = motors;
		this.atrumkarba = atrumkarba;
		this.ritenis = ritenis;
		this.sture = sture;
		this.atrums = 0;
	}
	
	public void spiestGazi() {
		atrums += 10;
	}
	
    public int getAtrums() {
        return atrums;
    }
	
	public String toString() {
		return motors + "\n" +
				atrumkarba + "\n" +
				ritenis + "\n" +
				sture + "\n" +
				"Ātrums: " + atrums + "km/h";
	}
}