package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
		String n1 = showInputDialog("Skriv inn poengsummen din: ");
		
		int poengsum = parseInt(n1);
		
		
		if (poengsum <= 39 && poengsum >= 0) {
			showMessageDialog(null, "Din karakter er F.");
		}
		else if (poengsum >= 40 && poengsum <= 49) {
			showMessageDialog(null, "Din karakter er E.");
		}
		else if (poengsum >= 50 && poengsum <= 59) {
			showMessageDialog(null, "Din karakter er D.");
		}
		else if (poengsum >= 60 && poengsum <= 79) {
			showMessageDialog(null, "Din karakter er C");
		}
		else if (poengsum >= 80 && poengsum <= 89) {
			showMessageDialog(null, "Din karakter er B");
		}
		else if (poengsum >= 90 && poengsum <= 100) {
			showMessageDialog(null, "Din karakter er A");
		}
		else {
			showMessageDialog(null, "Ugyldig poengsum");
			i = -1;
		}
	}
		return;
	}

}
