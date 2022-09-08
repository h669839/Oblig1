package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class O1 {

	public static void main(String[] args) {
		String Bruttolonn = showInputDialog("Skriv inn din bruttolønn: ");
		int brutto = parseInt(Bruttolonn); 
		
			if (brutto <= 164100) {
				showMessageDialog(null, "Din trinnskatt er 0kr");
			}
			else if (brutto >= 164101 && brutto <= 230950) {
				showMessageDialog(null, "Din trinnskatt er " + brutto*0.0093 + "kr");
			}
			else if (brutto >= 230951 && brutto <= 580650) {
				showMessageDialog(null, "Din trinnskatt er " + brutto*0.0241 + "kr");
			}
			else if (brutto >= 580651 && brutto <= 934050) {
				showMessageDialog(null, "Din trinnskatt er " + brutto*0.1152 + "kr");
			}
			else if (brutto >= 934051) {
				showMessageDialog(null, "Din trinnskatt er " + brutto*0.1452 + "kr");
			}
		
	}

}
