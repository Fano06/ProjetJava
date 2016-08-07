package multisport;

import java.util.ArrayList;

public class Sportif {

	private int idsportif;
	String nom;
	String prenom;
	String datenais;
	int idequipe;
	String mail;
	private static int compteur = 0; 
	ArrayList<Sportif> sportifs = new ArrayList<Sportif>();
	
	public Sportif(String nom, String prenom, String datenais, String mail){
		this.idsportif=compteur++; 
		this.nom = nom;
		this.prenom = prenom;
		this.datenais = datenais;
		this.idequipe = 0; 
		this.mail = mail;
	}
	
	public int getId(){
		return this.idsportif;
	}
	
	public String getNom(){
		return this.nom;
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
	
	public String rechercheSportif (int idsportif){
		for (int i=0; i<compteur; i++){
			if (idsportif == i){
				return "ID: "+idsportif+"\n"+"Nom: "+nom+"\n"+"Prenom: "+prenom+"\n"+"Date de naissance: "+datenais+"\n"+"ID equipe: "+idequipe;
			}
		}
		return "Le sportif n'existe pas";
	}
	
	public void modifSportif(){ /* a faire*/
		
	}
	
	public String toString(){
		return "ID: "+idsportif+"\n"+"Nom: "+nom+"\n"+"PrÃ©nom: "+prenom+"\n"+"Date de naissance: "+datenais+"\n"+"ID equipe: "+idequipe;
	}
	
}

