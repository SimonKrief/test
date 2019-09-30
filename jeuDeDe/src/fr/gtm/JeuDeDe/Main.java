package fr.gtm.JeuDeDe;


public class Main {
	public static void main(String[] args) {

		Joueur j1= new Joueur("Henry");
		Joueur j2= new Joueur("Jacques");

		Jeu partie = new Jeu();
		partie.addJoueur(j1);
		partie.addJoueur(j2);
		partie.vainqueur();
	}

}
