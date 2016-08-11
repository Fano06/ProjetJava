package multisport;

import java.util.ArrayList;

public class Annulation {
	
	private int idannul;
	int idmatch;
	String cause;
	private static int compteur;
	ArrayList<Annulation> annulations = new ArrayList<Annulation>();
	
	public Annulation (int idmatch, String cause){
		this.idannul = compteur++;
		this.idmatch = idmatch;
		this.cause = cause;
	}
	
	public int getId(){
		return this.idannul;
	}
	
	public String getcause(){
		return this.cause;
	}
	
	public int getIdmatch(){
		return this.idmatch;
	}
	
	public void ajoutAnnulation(Annulation a){
		annulations.add(a);
	}

	public void suppressionAnnulation(Annulation b){
		annulations.remove(b);
	}
		
	public String listeAnnulations(){  
		String s = new String();
		for(Annulation a : annulations ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheAnnulation (int idannul){
		for (int i=0; i<compteur; i++){
			if (idannul == i){
				return "ID: "+idannul+"\n"+"ID Match: "+idmatch+"\n"+"Cause : "+cause;
			}
		}
		return "Il n'y aucune annulation correspondante";
	}
	
	
	public String toString(){
		return "ID: "+idannul+"\n"+"ID Match: "+idmatch+"\n"+"Cause : "+cause;
	}
}
