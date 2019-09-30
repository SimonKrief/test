package fr.gtm.JeuDeDe;

import java.util.Random;

public class De {
	final int faces=6;
	static final Random random = new Random(); /* <-- this is a constructor */
	
	int resultat =0;
	public  int deRoule() {
		
		resultat=random.nextInt(faces) + 1;
		//System.out.println (resultat); 
        return resultat;
		
		
	}
	public int getResultat() {
		return resultat;

	}

}
