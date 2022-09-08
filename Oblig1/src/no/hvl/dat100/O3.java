package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		String fakultetTxt = showInputDialog("Tall du vil regne fakulteten til");
		
		int fakTall = parseInt(fakultetTxt);
		
		int fak = fakultet(fakTall);
		
		showMessageDialog(null, fak);
		

	}
	
	private static int fakultet(int n) {

		int fak = 1;
		
		for (int i = 2; i <= n; i++ ) {
			
			fak = fak * i;
			
		}
		return fak;
		
	}
}
