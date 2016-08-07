package multisport;

import java.util.Scanner;

public class Menu{
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
	int menu1=11;
	
	
	while (menu1!=0){
		System.out.println("+-----------------------MENU-------------------+");
		System.out.println("| Que souhaitez vous faire? (taper le numero)  |");
		System.out.println("| 1- Gestion des sportifs                      |");
		System.out.println("| 2- Gestion des equipes                       |");
		System.out.println("| 3- Gestion des matchs                        |");
		System.out.println("| 4- Gestion des inscriptions                  |");
		System.out.println("| 5- Gestion des tournois                      |");
		System.out.println("| 6- Gestion des annulations                   |");
		System.out.println("| 7- Gestion des classements                   |");
		System.out.println("| 8- Gestion des staffs                        |");
		System.out.println("| Choix:                                       |");
		System.out.println("+----------------------------------------------+");
		menu1= scan.nextInt();
		
		switch(menu1){
		case 1:
			menusportif();
			break;	
		case 2:
			menuequipe();
			break;
		case 3: 
			menumatch();
			break;
		case 4:
			menuinscription();
			break;
		case 5: 
			menutournoi();
			break;
		case 6:
			menuannulation();
			break;
		case 7:
			menuclassement();
			break;
		case 8: 
			menustaff();
			break;
		case 0:
			System.out.println("Nous vous remercions de votre visite. A bientot\n");
		default:
			System.out.println("Vous vous etes trompe de choix. Veuillez recommencez\n");
			
			}
		}
	scan.close();
	
	}
	
	//-------Affichage des menus/fonctions hors du main 
	
	public static void menuequipe(){
		int cpt = 11;
		
		while(cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des equipes   |");
			System.out.println("| 1- Ajouter une equipe                 |");
			System.out.println("| 2- Supprimer une equipe               |");
			System.out.println("| 3- Ajouter un sportif dans une equipe |");
			System.out.println("| 4- Supprimer un sportif d'une equipe  |");
			System.out.println("| 5- Avoir la liste des equipes         |");
			System.out.println("| 6- Rechercher une equipe              |");
			System.out.println("| 7- Modifier une equipe                |");
			System.out.println("| 0- Quitter           	                |");
			System.out.println("| Choix:                                |");
			System.out.println("+---------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutEquipe();
				break;
			case 2:
				suppEquipe();
				break;
			case 3:
				AffectationSportif();
				break;
			case 4:
				suppAffectation();
				break;
			case 5:
				affichEquipe();
				break;
			case 6:
				int id=0;
				rechEquipe(id);
				break;
			case 7: 
				modifEquipe();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}
	
	// Ajout Equipe
	private static void ajoutEquipe(){
		int idequipe= 0;
		System.out.println("Nous allons proceder a l'ajout d'une equipe");
		System.out.println("Veuillez saisir les donnees suivantes: \n");
		System.out.println("Nom de l'equipe:\n");
		String nom = scan.nextLine();
		System.out.println("Nombre de personnes membres du staff: \n");
		int nbstaff = scan.nextInt();
		System.out.println("Nombre de joueurs: \n");
		int nbjoueur = scan.nextInt();
		System.out.println("Nom du sport: \n");
		String sport = scan.nextLine();
		System.out.println("ID du tournoi: \n");
		int idtournoi = scan.nextInt();
		System.out.println("Position dans le classement: \n");
		int classement = scan.nextInt();
		//Equipe a = new Equipe(nom, nbstaff, nbjoueur, sport, idtournoi, classement);
		bdd_ajout.connexionAjoutEquipe(idequipe, nom, nbstaff, nbjoueur, sport, idtournoi, classement);
			
	}
	
	// Afficher les equipes
	private static void affichEquipe(){
		System.out.println("Liste des equipes: ");
		LectureSQL.LectEquipes();
		
	}
	
	// Supprimer une equipe
	private static void suppEquipe(){
		
	}
	
	// Affection sportif
	private static void AffectationSportif(){
		
	}
	
	// Supprimer affectation du sportif
	private static void suppAffectation(){
		
	}
	
	// Rechercher une equipe
	private static void rechEquipe(int id){
		System.out.println("Entrer le numéro de l'équipe: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	// Modifier une equipe
	private static void modifEquipe(){

	}
	
	// Menu sportif
	public static void menusportif(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des sports    |");
			System.out.println("| 1- Ajouter un sportif                 |");
			System.out.println("| 2- Supprimer un sportif               |");
			System.out.println("| 3- Recherche un sportif               |");
			System.out.println("| 4- Afficher la liste des sportifs     |");
			System.out.println("| 0- Quitter           	                |");
			System.out.println("| Choix:                                |");
			System.out.println("+---------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutSportif();
				break;
			case 2:
				suppSportif();
				break;
			case 3:
				int id=0;
				recherSportif(id);
				break;
			case 4:
				affichSportif();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
		
	}
	
	private static void ajoutSportif(){
		int idsportif= 0;
		System.out.println("Nous allons proceder a l'ajout d'un sportif");
		System.out.println("Veuillez saisir les donnees suivantes: ");
		System.out.println("Nom:");
		String nom = scan.nextLine();
		System.out.println("Prenom ");
		String prenom = scan.nextLine();
		System.out.println("Date de naissance (JJ-MM-AAAA: ");
		String datenais = scan.nextLine();
		System.out.println("ID de l'equipe: ");
		int idequipe = scan.nextInt();
		System.out.println("Adresse Mail: ");
		String sport = scan.nextLine();
		AjoutSQL.connexionAjoutSportif(idsportif, nom, prenom, datenais, idequipe, sport);
	}
	
	private static void suppSportif(){
		
	}
	
	private static void recherSportif(int id){
		System.out.println("Entrer l'identifiant du sport: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	private static void affichSportif(){
		System.out.println("Liste des sportifs: ");
		LectureSQL.LectSportifs();
	}
	
	
	
	// Menu Inscription
	
	public static void menuinscription(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------------+");
			System.out.println("|    Affichage et gestion des inscriptins     |");
			System.out.println("| 1- Ajouter une inscription                  |");
			System.out.println("| 2- Supprimer une inscription                |");
			System.out.println("| 3- Rechercher une inscription               |");
			System.out.println("| 4- Afficher la liste des inscriptions       |");
			System.out.println("| 0- Quitter           	                      |");
			System.out.println("| Choix:                                      |");
			System.out.println("+---------------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutInscription();
				break;
			case 2:
				suppInscription();
				break;
			case 3:
				int id=0;
				recherInscription(id);
				break;
			case 4:
				affichInscription();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}
	
	private static void ajoutInscription(){
		int idinscription= 0;
		System.out.println("Nous allons proceder a l'inscription d'une equipe");
		System.out.println("Veuillez saisir les donnees suivantes: ");
		System.out.println("ID tournoi: ");
		int idtournoi = scan.nextInt();
		System.out.println("Nom tournoi: ");
		String tournoi = scan.nextLine();
		System.out.println("Nom de l'equipe: ");
		String equipe = scan.nextLine();
		System.out.println("Date d'inscription: ");
		String date = scan.nextLine();
		AjoutSQL.connexionAjoutInscription(idinscription, idtournoi, tournoi, equipe, date);
		ajoutEquipe();
	}
	
	private static void suppInscription(){
		
	}
	
	private static void recherInscription(int id){
		System.out.println("Entrer l'identifiant de l'inscription: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	private static void affichInscription(){
		System.out.println("Liste des inscriptions: ");
		LectureSQL.LectInscriptions();
	}
	// Menu tournoi
	
	public static void menutournoi(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des tournois  |");
			System.out.println("| 1- Ajouter un tournoi                 |");
			System.out.println("| 2- Supprimer un tournoi               |");
			System.out.println("| 3- Rechercher un tournoi              |");
			System.out.println("| 4- Afficher la liste des tournois     |");
			System.out.println("| 0- Quitter           	                |");
			System.out.println("| Choix:                                |");
			System.out.println("+---------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutTournoi();
				break;
			case 2:
				suppTournoi();
				break;
			case 3:
				int id = 0;
				recherTournoi(id);
				break;
			case 4:
				affichTournoi();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}
	
	private static void ajoutTournoi(){
		int idtournoi= 0;
		System.out.println("Nous allons proceder a l'ajout d'un tournoi");
		System.out.println("Veuillez saisir les donnees suivantes: ");
		System.out.println("Nom du tournoi: ");
		String nom = scan.nextLine();
		System.out.println("Ce tournoi concerne le sport: ");
		String sport = scan.nextLine();
		System.out.println("Nombre d'equipes: ");
		int nbequipe = scan.nextInt();
		System.out.println("Ce tournoi commence le: ");
		String dateD = scan.nextLine();
		System.out.println("Ce tournoi fini le: ");
		String dateF = scan.nextLine();
		System.out.println("Il se deroulera: ");
		String lieu = scan.nextLine();
		AjoutSQL.connexionAjoutTournoi(idtournoi, nom, sport, nbequipe, dateD, dateF, lieu);
	}
	
	private static void suppTournoi(){
		
	}
	
	private static void recherTournoi(int id){
		System.out.println("Entrer le numéro de l'équipe: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	private static void affichTournoi(){
		System.out.println("Liste des tournois: ");
		LectureSQL.LectTournois();
		
	}
	
	// Menu match
	public static void menumatch(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des matchs    |");
			System.out.println("| 1- Ajouter un match                   |");
			System.out.println("| 2- Supprimer un match                 |");
			System.out.println("| 3- Recherche un match                 |");
			System.out.println("| 4- Afficher la liste des matchs       |");
			System.out.println("| 0- Quitter           	                |");
			System.out.println("| Choix:                                |");
			System.out.println("+---------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutMatch();
				break;
			case 2:
				suppMatch();
				break;
			case 3:
				int id = 0;
				recherMatch(id);
				break;
			case 4:
				affichMatch();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}
	
	private static void ajoutMatch(){
		int idmatch= 0;
		System.out.println("Nous allons proceder a l'ajout d'un sportif");
		System.out.println("Veuillez saisir les donnees suivantes: ");
		System.out.println("ID tournoi: ");
		int idtournoi = scan.nextInt();
		System.out.println("ID equipe 1: ");
		int idequipe1 = scan.nextInt();
		System.out.println("Id equipe 1: ");
		int idequipe2 = scan.nextInt();
		System.out.println("Date du match: ");
		String date = scan.nextLine();
		System.out.println("Lieu du match: ");
		String lieu = scan.nextLine();
		System.out.println("Score (format X-X): ");
		String score = scan.nextLine();
		System.out.println("ID de l'equipe gagnante: ");
		int equipegagnante = scan.nextInt();
		AjoutSQL.connexionAjoutMatch(idmatch, idtournoi,idequipe1, idequipe2, date, lieu, score, equipegagnante);
	}
	
	private static void suppMatch(){
		
	}
	
	private static void recherMatch(int id){
		System.out.println("Entrer l'identifiant du match: ");
		id = scan.nextInt();
		LectureSQL.LectUnMatch(id);
		
	}
	
	private static void affichMatch(){
		System.out.println("Liste des matchs: ");
		LectureSQL.LectMatchs();
	}
	
	// Menu Annulation
	public static void menuannulation(){
		
	}
	
	// Menu classement
	public static void menuclassement(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+-------------------------------------------+");
			System.out.println("|    Affichage et gestion des classements   |");
			System.out.println("| 1- Afficher l'ensemble des classements    |");
			System.out.println("| 2- Rechercher un classement               |");
			System.out.println("| 0- Quitter           	                    |");
			System.out.println("| Choix:                                    |");
			System.out.println("+-------------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				affichClassement();
				break;
			case 2:
				int id = 0;
				recherClassement(id);
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}
	
	private static void affichClassement(){
		System.out.println("Liste des classements: ");
		bdd_lecture.LectClassements();
	}
	
	private static void recherClassement(int id){
		System.out.println("Entrer l'identifiant du classement: ");
		id = scan.nextInt();
		LectureSQL.LectUnClassement(id);
	}
	
	// Menu Staff
	
	public static void menustaff(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des staffs    |");
			System.out.println("| 1- Ajouter un staff                   |");
			System.out.println("| 2- Supprimer un staff                 |");
			System.out.println("| 3- Rechercher un staff                |");
			System.out.println("| 4- Afficher la liste des staffs       |");
			System.out.println("| 0- Quitter           	                |");
			System.out.println("| Choix:                                |");
			System.out.println("+---------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutStaff();
				break;
			case 2:
				suppStaff();
				break;
			case 3:
				int id = 0;
				recherStaff(id);
				break;
			case 4:
				affichStaff();
				break;
			case 0:
				System.out.println("Merci de votre visite\n");
				break;
			default:
				System.out.println("Vous n'avez pas saisi le bon chiffre\n");
				break;
			
			}
		}
	}	
	
		private static void ajoutStaff() {
			int idmembre= 0;
			System.out.println("Nous allons proceder a l'ajout d'un staff");
			System.out.println("Veuillez saisir les donnees suivantes: ");
			System.out.println("Nom du membre: ");
			String nom = scan.nextLine();
			System.out.println("Prenom: ");
			String prenom = scan.nextLine();
			System.out.println("ID de l'equipe affiliee: ");
			int idequipe = scan.nextInt();
			System.out.println("Fonction: ");
			String fonction = scan.nextLine();
			AjoutSQL.connexionAjoutStaff(idmembre, nom, prenom, idequipe, fonction);
		}
		
		private static void suppStaff(){
			
		}
		
		private static void recherStaff(int id){
			System.out.println("Entrer l'identifiant du membre: ");
			id = scan.nextInt();
			LectureSQL.LectUnStaff(id);
		}
		
		private static void affichStaff(){
			System.out.println("Liste des membres des staffs: ");
			LectureSQL.LectStaffs();
		}
		
		
}

