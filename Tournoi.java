package multisport;

import java.util.ArrayList;

public class Tournoi {
	
	int idtournoi;
	String nom;
	String sport;
	int nbequipe;
	String dateD;
	String dateF;
	String lieu;
	private static int compteur = 0;
	
	ArrayList<Tournoi> tournois = new ArrayList<Tournoi>();
	
	public Tournoi (int idtournoi, String nom, String sport, int nbequipe, String dateD, String dateF, String lieu){
		this.idtournoi = 0;
		this.nom = nom;
		this.sport = sport;
		this.nbequipe = nbequipe;
		this.dateD = dateD;
		this.dateF = dateF;
		this.lieu = lieu;
	}
	
	public int getId(int a){
		return a;
	}
	
	public void ajoutTournoi(Tournoi a){
		tournois.add(a);
	}

	public void suppressionTournoi(Tournoi b){
		tournois.remove(b);
	}
	
	public int setNbEquipe(int e){
		return this.nbequipe;
	}
	
	public String setDateD(String d){
		return this.dateD;
	}
	
	public String setDateF(String f){
		return this.dateF;
	}
	
	public String setLieu(String l){
		return this.lieu;
	}
	
	public String rechercheTournois (int idrech){
		for (int i=0; i<compteur; i++){
			if (idrech == i){
				return "ID tournoi: "+idrech+" Nom: "+nom+" Sport: "+sport+"Nombre d'equipes "+nbequipe+"Date de debut: "+dateD+"Date de fin "+dateF+"Lieu du tournoi "+lieu;
			}				
		}
		return "Le match n'existe pas";
	}
	
	public String listeTournois(){  
		String s = new String();
		for(Tournoi a : tournois ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String toString(){			
		return "ID tournoi: "+idtournoi+" Nom: "+nom+" Sport: "+sport+"Nombre d'equipes "+nbequipe+"Date de debut: "+dateD+"Date de fin "+dateF+"Lieu du tournoi "+lieu;
	}

}
