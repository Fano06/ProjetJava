package multisport;

import java.util.ArrayList;

public class Tournoi {
	
	private int idtournoi;
	String nom;
	String sport;
	int nbequipe;
	private static int compteur = 0;
	
	ArrayList<Tournoi> tournois = new ArrayList<Tournoi>();
	
	public Tournoi (int idtournoi, String nom, String sport, int nbequipe){
		this.idtournoi = compteur++;
		this.nom = nom;
		this.sport = sport;
		this.nbequipe = nbequipe;
	}
	
	public int getId(){
		return this.idtournoi;
	}
	
	public void ajoutTournoi(Tournoi a){
		tournois.add(a);
	}

	public void suppressionTournoi(Tournoi b){
		tournois.remove(b);
	}
	
	public String rechercheTournois (int idtournoi){
		for (int i=0; i<compteur; i++){
			if (idtournoi == i){
				return "ID tournoi: "+idtournoi+" ,"+nom+" "+sport+" - "+nbequipe;
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
	
	public void modifTournoi(){ /* a faire*/
		
	}
	
	public String toString(){
		String s = "ID tournoi: "+idtournoi+" ,"+nom+" "+sport+" , "+nbequipe;
		return s;
	}

}
