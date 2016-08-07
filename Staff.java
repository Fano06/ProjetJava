package multisport;

import java.util.ArrayList;

public class Staff {
	
	int idmembre;
	String nom;
	String prenom;
	int idequipe;
	String fonction;
	private static int compteur = 0; 
	
	ArrayList<Staff> staffs = new ArrayList<Staff>();
	
	public Staff(String nom, String prenom, int idequipe, String fonction){
		this.idmembre = 0;
		this.nom=nom;
		this.prenom=prenom;
		this.idequipe=idequipe;
		this.fonction=fonction;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getEquipe(){
		return this.idequipe;
	}
	
	public String getFonction(){
		return this.fonction;
	}
	
	public void ajoutMembre(Staff a){
		staffs.add(a);
	}

	public void suppressionMembre(Staff b){
		staffs.remove(b);
	}
		
	public String listeMembres(){  
		String s = new String();
		for(Staff a : staffs ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheMembre (int idinscription){
		for (int i=0; i<compteur; i++){
			if (idmembre == i){
				return "ID: "+idmembre+"\n"+"Nom : "+nom+"\n"+"Prenom: "+prenom+"\n"+"ID equipe: "+idequipe+"\n"+"Fonction : "+fonction+"\n";
			}
		}
		return "Nous n'avons pas retrouve l'inscription";
	}
	
	
}

