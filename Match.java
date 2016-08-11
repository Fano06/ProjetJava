package multisport;

import java.util.ArrayList;


public class Match {

	int idmatch;
	int idtournoi;
	int equipe1;
	int equipe2;
	String date;
	String lieu;
	String score;
	int equipegagnante;
	private static int compteur = 0;
	ArrayList<Match> matchs = new ArrayList<Match>();
	
	public Match(int idtournoi, int equipe1, int equipe2, String date, String lieu, String score, int equipegagnante){
		this.idmatch = 0;
		this.idtournoi = idtournoi;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.date = date;
		this.lieu = lieu;
		this.score = score;
		this.equipegagnante = equipegagnante;
		
	}
	
	public int getId(int a ){
		return a;
	}
	
	public void ajoutMatch(Match a){
		matchs.add(a);
	}

	public void suppressionMatch(Match b){
		matchs.remove(b);
	}
	
	public String setScore(String s){
		return this.score;
	}
	
	public String rechercheMatch (int idrech){
		for (int i=0; i<compteur; i++){
			if (idrech== i){
				return "ID match: "+idrech+"\n"+"ID tournoi: "+idtournoi+"\n"+"Equipe: "+equipe1+"\n"+"Contre: "+equipe2+"\n"+"Date: "+date+"\n"+"Lieu: "+lieu+"\n"+"Score: "+score+"\n"+"Equipe gagnante: "+equipegagnante+"\n";
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
	
	public String toString(int idrech){
		return "ID match: "+idrech+"\n"+"ID tournoi: "+idtournoi+"\n"+"Equipe: "+equipe1+"\n"+"Contre: "+equipe2+"\n"+"Date: "+date+"\n"+"Lieu: "+lieu+"\n"+"Score: "+score+"\n"+"Equipe gagnante: "+equipegagnante+"\n";
	}
}

