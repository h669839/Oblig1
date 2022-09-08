package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args){
		
		String t1 = showInputDialog("Skriv inn ett nummer: ");
		
		int n= parseInt(t1);
		
		long fakultet = 1;
		
		for (int i=2; i<=n; i++) {
			
			fakultet = fakultet*i;
			
		}
		System.out.print(n + "!=" + n);
		
		while (n>1) {
			
			n -= 1;
			
			System.out.print("*" + n);
		}
		
		System.out.print("=" + fakultet);
	
	}
	

}
