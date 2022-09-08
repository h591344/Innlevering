package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");
		
		String brukernavnK = "Stian";
		String passordK = "passord23";
		
		String utTxt;
		
		if (brukernavn.equals(brukernavnK) && passord.equals(passordK)) {
			utTxt = "Du er logget inn";
		} else {
			utTxt = "Passord eller brukernavn er feil";
		}
		
		showMessageDialog(null, utTxt);
	
	}

}