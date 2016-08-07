package multisport;

import java.util.ArrayList;

public class Classement {
	
	private int idclassement;
	String sport;
	int nbequipes;
	ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	private static int compteur = 1;
	
	public int getId(){
		return this.idclassement;
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
	
	public boolean verifierEquipe(int id){
		for(Equipe a: equipes){
	    	if(a.getId() == id){
	    		return true;
	    	}
	    }
	    return false;
	}
}
