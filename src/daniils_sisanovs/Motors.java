package daniils_sisanovs;

public class Motors {
	private String tips;
	private int jauda;
	private int tilpums;
	
	public Motors(String tips, int jauda, int tilpums) {
		this.tips = tips;
		this.jauda = jauda;
		this.tilpums = tilpums;
	}
	
	public String getTips() {
		return tips;
	}

	public int getJauda() {
		return jauda;
	}

	public int getTilpums() {
		return tilpums;
	}
	
	public String toString() {
		return "Motors: " + tips + ", " + jauda + 
				" ZS, " + tilpums + " cms3";
	}	
}