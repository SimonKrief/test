package fr.gtm.JeuDeDe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Jeu {
	De d1 = new De();
	De d2 = new De();
	// Joueur[] joueurs;

	ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public void addJoueur(Joueur j) {
		joueurs.add(j);
	}

	public Joueur vainqueur() {

		while (true) {
			Joueur vainqueur = null;

// for each		

			for (Joueur j : joueurs) {
				j.jouer(d1, d2);
				if (d1.resultat == d2.resultat) {
					vainqueur = j;

					System.out.println(vainqueur.nom + " gagne la partie.");
					return vainqueur;
				}
			}

//for classique

			for (int i = 0; i < joueurs.size(); i++) {
				joueurs.get(i).jouer(d1, d2);
				if (d1.resultat == d2.resultat) {
					vainqueur = joueurs.get(i);
					System.out.println(vainqueur.nom + " gagne la partie.");
					return vainqueur;
				}
			}		

//El iterator			

			Iterator<Joueur> j = joueurs.iterator();
			while (j.hasNext()) {
				Joueur a = j.next();
				a.jouer(d1, d2);
				if (d1.resultat == d2.resultat) {
					vainqueur = a;
					System.out.println(vainqueur.nom + " gagne la partie.");
					return vainqueur;
				}
			}

		}
		
		
//		System.out.println(vainqueur.nom);
//		return vainqueur;

	}

}
