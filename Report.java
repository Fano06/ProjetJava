package multisport;

import java.util.ArrayList;

public class Report {
	
	private int idreport;
	int idmatch;
	String datereport;
	String cause;
	private static int compteur = 0; 
	ArrayList<Report> reports = new ArrayList<Report>();
	
	public Report (int idmatch, String datereport, String cause){
		this.idreport = compteur++;
		this.idmatch = idmatch;
		this.datereport = datereport;
		this.cause = cause;
	}
	
	public int getId(){
		return this.idreport;
	}
	
	public String datereport(){
		return this.datereport;
	}
	
	public int getIdmatch(){
		return this.idmatch;
	}
	
	public String getcause(){
		return this.cause;
	}
	
	public void ajoutReport(Report a){
		reports.add(a);
	}

	public void suppressionReport(Report b){
		reports.remove(b);
	}
		
	public String listeReports(){  
		String s = new String();
		for(Report a : reports ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String rechercheReport (int idreport){
		for (int i=0; i<compteur; i++){
			if (idreport == i){
				return "ID: "+idreport+"\n"+"ID Match: "+idmatch+"\n"+"Date report: "+datereport+"\n"+"Cause : "+cause;
			}
		}
		return "Il n'y aucun report correspondant";
	}
	
	public void modifReport(){ /* a faire*/
		
	}
	
	public String toString(){
		return "ID: "+idreport+"\n"+"ID Match: "+idmatch+"\n"+"Date report: "+datereport+"\n"+"Cause : "+cause;
	}
}
