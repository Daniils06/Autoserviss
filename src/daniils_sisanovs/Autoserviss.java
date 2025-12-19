package daniils_sisanovs;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autoserviss {
	static ArrayList<Automasina> saraksts = new ArrayList<>();
	
	public static void main(String[] args) {
		int izvele;
		do {
			izvele = Integer.parseInt(
					JOptionPane.showInputDialog(
							"1 - Jauna automašīna\n" +
							"2 - Apskatīt\n" +
							"3 - Spiest gazi\n" +
							"4 - Saglabāt failā\n" +
							"5 - Nolasīt failu\n" +
							"6 - Beigt\n"));
			
			switch(izvele) {
			case 1:
				izveidot();
				break;
			
			case 2:
				paradit();
				break;
				
			case 3:
			    if (saraksts.size() == 0) {
			        JOptionPane.showMessageDialog(null, 
			        "Nav nevienas automašīnas!");
			    } else {
			        saraksts.get(0).spiestGazi();
			        JOptionPane.showMessageDialog(null,
			        "Jaunais ātrums: " + 
			        saraksts.get(0).getAtrums() + " km/h");
			    }
			    break;
				
			case 4:
			    if (saraksts.size() == 0) {
			        JOptionPane.showMessageDialog(null, 
			        "Nav nevienas automašīnas saglabāšanai!");
			    } else {
			        DarbsArFailu.saglabat(saraksts.get(0));
			    }
			    break;
			
			case 5:
				DarbsArFailu.nolasit();
				break;
			}
		} while(izvele != 6);
	}
	
	static void izveidot() {
		Motors m = new Motors("Benzīns", 150, 2000);
		Atrumkarba a = new Atrumkarba("Manuāla", 6, false);
		Ritenis r = new Ritenis(17, "Vasars", false);
		Sture s = new Sture("Āda", true, false);
		
		saraksts.add(new Automasina(m, a, r, s));
	}
	
	static void paradit() {
		if (saraksts.size() == 0) {
	        JOptionPane.showMessageDialog(null, 
	        "Nav nevienas automašīnas sarakstā!");
	    } else {
	        JOptionPane.showMessageDialog(null, saraksts.get(0).toString());
	    }
	}
}