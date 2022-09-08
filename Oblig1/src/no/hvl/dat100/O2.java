package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i ++) {
			
			int poeng;
			
			do {
				String poengTxt = showInputDialog("Skriv inn Poengsum");
				
				poeng = parseInt(poengTxt);
				
				char karakter;	
					if(0 <= poeng && poeng <= 39) {
					
						karakter = 'F';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} else if(poeng <= 49) {
					
						karakter = 'E';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} else if(poeng <= 59) {
					
						karakter = 'D';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} else if(poeng <= 79) {
					
						karakter = 'C';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} else if(poeng <= 89) {
					
						karakter = 'B';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} else if(poeng <= 100) {
					
						karakter = 'A';
					
						showMessageDialog(null, "Du får karakteren " + karakter);
					
					} 
			} while (0 > poeng || poeng > 100);
		}		
	}
}


