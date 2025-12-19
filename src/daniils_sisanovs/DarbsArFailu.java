package daniils_sisanovs;

import java.io.*;
import javax.swing.*;

public class DarbsArFailu {
	static String fails = "Faili/automobili.txt";
	
	static void saglabat(Automasina a) {
		try {
			FileWriter fw = new FileWriter(fails, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(a.toString());
			pw.println("-----");
			pw.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Kļūda saglabājos failā");
		}
	}
	
	static void nolasit() {
		try {
			FileReader fr = new FileReader(fails);
			BufferedReader br = new BufferedReader(fr);
			String rinda, teksts = "";
			while ((rinda = br.readLine()) != null) {
				teksts += rinda + "\n";
			}
			br.close();
			
			JTextArea area = new JTextArea(teksts);
			JScrollPane sp = new JScrollPane(area);
			JOptionPane.showMessageDialog(null, sp, "Fails", 
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Kļūda nolasot failu");
		}
	}
}