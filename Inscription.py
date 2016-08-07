package multisport;

import java.util.ArrayList;

public class Inscription {
	
	private int idinscription;
	String tournoi;
	String equipe;
	String dateInscription;
	private static int compteur = 0; 
	String statut = "Confirme";
	
	ArrayList<Inscription> inscriptions = new ArrayList<Inscription>();
	
	public Inscription (String tournoi, String equipe, String dateInscription){
		this.idinscription=compteur++;
		this.tournoi=tournoi;
		this.equipe=equipe;
		this.dateInscription=dateInscription;
	}
	
	public String getTournoi(){
		return this.tournoi;
	}
	
	public String getEquipe(){
		return this.equipe;
	}
	
	public String getDate(){
		return this.dateInscription;
	}
	
	public void ajoutInscriptions(Inscription a){
		inscriptions.add(a);
	}

	public void suppressionInsccriptions(Inscription b){
		inscriptions.remove(b);
	}
		
	public String listeInscriptions(){  
		String s = new String();
		for(Inscription a : inscriptions ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheInscription (int idinscription){
		for (int i=0; i<compteur; i++){
			if (idinscription == i){
				return "ID: "+idinscription+"\n"+"Nom tournoi: "+tournoi+"\n"+"Nom equipe: "+equipe+"\n"+"Date inscription: "+dateInscription+"\n";
			}
		}
		return "Nous n'avons pas retrouve l'inscription";
	}
	
}

