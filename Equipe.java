package multisport;

import java.util.ArrayList;

public class Equipe {

	private int idequipe;
	String nom;
	int nbstaff;
	int nbjoueur;
	String sport;
	int idtournoi;
	int classement;
	private static int compteur = 0;
	//ArrayList<Sportif> sportifs = new ArrayList<Sportif>();
	ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	public Equipe(String nom, int nbstaff, int nbjoueur, String sport, int idtournoi, int classement){
		this.idequipe = compteur++;
		this.nom = nom;
		this.nbstaff = nbstaff;
		this.nbjoueur = nbjoueur;
		this.sport = sport;
		this.idtournoi= idtournoi;
		this.classement = classement;
	}
	
	public int getId(){
		return this.idequipe;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void ajoutEquipe(Equipe a){
		equipes.add(a);
	}

	public void suppressionEquipe(Equipe b){
		equipes.remove(b);
	}
	/*
	public void ajoutSportif(Sportif c, int id){  ajouter un sportif Ã  une Ã©quipe 
		equipes.id.add(c); 
	}

	public void suppressionSportif(Sportif b){ suppression sportif d'une Ã©quipe)
		equipes.remove(b); 
	}
	*/
	public String listeEquipes(){  /*afficher la liste des equipes*/ 
		String s = new String();
		for(Equipe a : equipes ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheEquipe (int idequipe){ 
		for (int i=0; i<compteur; i++){
			if (idequipe == i){
				return "ID: "+idequipe+"\n"+"Nom: "+nom+"\n"+"Nombre de staff: "+nbstaff+"\n"+"Sport: "+sport+"\n"+"Nombre de joueur: "+nbjoueur+"\n"+"Fait parti du tournoi numero: "+idtournoi;
			}				
		}
		return "L'Ã©quipe n'existe pas";
	}
	
	public void modifEquipe(){ /* a faire*/
		
	}
	
	public String toString(){
		return "ID: "+idequipe+"\n"+"Nom: "+nom+"\n"+"Nombre de staff: "+nbstaff+"\n"+"Sport: "+sport+"\n"+"Nombre de joueur: "+nbjoueur+"\n"+"Fait parti du tournoi nÂ°: "+idtournoi;

	}
}
