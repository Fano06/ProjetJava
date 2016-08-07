package multisport;

import java.util.ArrayList;

public class Classement {
	
	int idclassement;
	int idtournoi;
	int idequipe;
	String sport;
	int nbequipes;
	ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	private static int compteur = 1;
	
	public int getId(int a){
		return a;
	}
	
	public String getSport(){
		return this.sport;
	}
	
	public Classement(String sport){
		this.idclassement = compteur;
		this.sport = sport;
	}
	
	public String tostring(){
		String s= "";
		int i = 1;
		while (i < nbequipes){
			for (Equipe a: equipes){
				if (a.classement == i){
					s += "NÂ°"+i+": "+a+"\n";
					i++;
				}
			}	
		}
		return s;
	}
	
	public void ajoutEquipe(Equipe a){
		equipes.add(a);
		nbequipes++;
	}

	public void suppressionEquipe(Equipe b){
		equipes.remove(b);
		nbequipes--;
	}
	
	public String rechercheClassement (int idrech){
		for (int i=0; i<compteur; i++){
			if (idrech== i){
				return "ID classement: "+idrech+"\n"+"ID tournoi: "+idtournoi+"\n"+"ID Equipe: "+idequipe+"\n"+"Sport: "+sport+"\n";
			}				
		}
		return "Le classement n'existe pas";
	}
}
