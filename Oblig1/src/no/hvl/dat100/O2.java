package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		String inntektTxt = showInputDialog("Hva er inntekten din?");
		
		int inntekt = parseInt(inntektTxt);
		
		double trinnskatt;
		double sats;
		String utTxt;
		
		if(0 < inntekt && inntekt <= 190349) {
			
			utTxt = "Siden inntekten din er " + inntekt + "kr og er under 190349kr vil "
					+ "du ikke ha trinnskatt";
			
		}  else if (inntekt <= 267899) {
			
			sats = 1.7 / 100;
			trinnskatt = inntekt * sats;
			utTxt = "Siden inntekten din er " + inntekt + "kr og er mellom 190350kr og 267899kr er "
					+ "satsen din 1.7% og da blir trinnskatten din "
					+ trinnskatt + "kr";
			
		} else if (inntekt <= 643799) {
			
			sats = 4.0 / 100;
			trinnskatt = inntekt * sats;
			utTxt = "Siden inntekten din er " + inntekt + "kr og er mellom 267900kr og 643799kr er "
					+ "satsen din 4.0% og da blir trinnskatten din "
					+ trinnskatt + "kr";
			
		} else if (inntekt <= 969199) {
			
			sats = 13.4 / 100;
			trinnskatt = inntekt * sats;
			utTxt = "Siden inntekten din er " + inntekt + "kr og er mellom 643800kr og 969199kr er "
					+ "satsen din 13.4% og da blir trinnskatten din "
					+ trinnskatt + "kr";
			
			
		} else if (inntekt <= 1999999) {
			
			sats = 16.4 / 100;
			trinnskatt = inntekt * sats;
			utTxt = "Siden inntekten din er " + inntekt + "kr og er mellom 969200kr og 1999999kr er "
					+ "satsen din 16.4% og da blir trinnskatten din "
					+ trinnskatt + "kr";
			
			
		} else if (2000000 <= inntekt) {
			
			sats = 17.4 / 100;
			trinnskatt = inntekt * sats;
			utTxt = "Siden inntekten din er " + inntekt + "kr og er over 200000kr er "
					+ "satsen din 17.4% og da blir trinnskatten din "
					+ trinnskatt + "kr";
			
		} else {
			
			utTxt = "Du har skrevet en ugyldig inntekt";
			
		}
		
		showMessageDialog(null, utTxt);
		
	}
}
