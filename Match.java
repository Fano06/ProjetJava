package multisport;

import java.util.ArrayList;


public class Match {

	private int idmatch;
	int equipe1;
	int equipe2;
	int scoreEquipe1;
	int scoreEquipe2;
	int equipegagnante;
	private static int compteur = 0;
	ArrayList<Match> matchs = new ArrayList<Match>();
	
	public Match(int equipeDom, int equipeExt, int scoreEquipeDom, int scoreEquipeExt, int equipegagnante){
		this.idmatch = compteur++;
		this.equipe1 = equipeDom;
		this.equipe2 = equipeExt;
		this.scoreEquipe1 = scoreEquipeDom;
		this.scoreEquipe2 = scoreEquipeExt;	
		this.equipegagnante = equipegagnante;
	}
	
	public int getId(){
		return this.idmatch;
	}
	
	public void ajoutMatch(Match a){
		matchs.add(a);
	}

	public void suppressionMatch(Match b){
		matchs.remove(b);
	}
	
	public String rechercheMatch (int idmatch){
		for (int i=0; i<compteur; i++){
			if (idmatch == i){
				return "ID match: "+idmatch+" ,"+equipe1+" "+scoreEquipe1+" - "+scoreEquipe2+" "+equipe2;
			}				
		}
		return "Le match n'existe pas";
	}
	
	public String listeMatch(){  
		String s = new String();
		for(Match a : matchs ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public void modifMatch(){ /* a faire*/
		
	}
	
	public String toString(){
		String s = "ID match: "+idmatch+" ,"+equipe1+" "+scoreEquipe1+" - "+scoreEquipe2+" "+equipe2;
		return s;
	}
}

