package multisport;

import java.util.ArrayList;

public class Sportif {

	int idsportif=0;
	String nom;
	String prenom;
	String datenais;
	int idequipe;
	String sport;
	int compteur = 0;
	ArrayList<Sportif> sportifs = new ArrayList<Sportif>();
	
	public Sportif(String nom, String prenom, String datenais, String sport){
		this.nom = nom;
		this.prenom = prenom;
		this.datenais = datenais;
		this.idequipe = 0; 
		this.sport = sport;
	}
	
	public int getId(int a){
		return a;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String setNom(String n){
		return this.nom;
	}
	
	public int setIdEquipe(int i){
		return this.idequipe;
	}
	
	public void ajoutSportif(Sportif a){
		sportifs.add(a);
	}

	public void suppressionSportif(Sportif b){
		sportifs.remove(b);
	}
		
	public String listeSportifs(){  
		String s = new String();
		for(Sportif a : sportifs ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheSportif (int idrech){
		for (int i=0; i<compteur; i++){
			if (idrech == i){
				return "ID: "+idrech+"\n"+"Nom: "+nom+"\n"+"Prenom: "+prenom+"\n"+"Date de naissance: "+datenais+"\n"+"ID equipe: "+idequipe+"\n"+"Sport :"+sport;
			}
		}
		return "Le sportif n'existe pas";
	}
	
	public String toString(int idrech){
		return "ID: "+idrech+"\n"+"Nom: "+nom+"\n"+"Prenom: "+prenom+"\n"+"Date de naissance: "+datenais+"\n"+"ID equipe: "+idequipe+"\n"+"Sport :"+sport;
	}
	
}

