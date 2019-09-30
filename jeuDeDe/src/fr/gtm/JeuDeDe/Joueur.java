package fr.gtm.JeuDeDe;

import java.lang.System.Logger;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Joueur {
	
	String nom;
	//int[] score;
	
	public Joueur(String string) {
		// TODO Auto-generated constructor stub
		nom =string;
	}


	//int d1, d2;
	public void jouer(De d1, De d2) {
		
		d1.deRoule();
		System.out.println(nom+ " fait un " +d1.resultat);
		d2.deRoule();
		System.out.println(nom+ " fait un " +d2.getResultat());
		//return {d1.resultat,d2.resultat};
		
		//System.out.println((d1.resultat==d2.resultat));
		
		//System.out.println(score);
		//int[] score = {d1.resultat,d2.resultat};
		return;
	}

}
