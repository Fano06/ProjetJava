package multisport;

import java.util.Scanner;

public class Menu{
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
	int menu1=11;
	
	///////// MENU PRINCIPAL /////////////
	
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
		
		////// APPEL DES SOUS-MENUS
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
	
	////------------MENU EQUIPE-----------///////
	
	public static void menuequipe(){
		int cpt = 11;
		
		while(cpt!=0){
			System.out.println("+------------------------------------------------+");
			System.out.println("|    Affichage et gestion des equipes            |");
			System.out.println("| 1- Ajouter une equipe                          |");
			System.out.println("| 2- Afficher les sportifs d'une equipe          |");
			System.out.println("| 3- Afficher les compositions de chaque equipe  |");
			System.out.println("| 4- Avoir la liste des equipes                  |");
			System.out.println("| 5- Rechercher une equipe                       |");
			System.out.println("| 6- Modifier une equipe                         |");
			System.out.println("| 0- Quitter           	                         |");
			System.out.println("| Choix:                                         |");
			System.out.println("+------------------------------------------------+");
			
			cpt = scan.nextInt();
			scan.nextLine();
			
			switch (cpt){
			
			case 1: 
				ajoutEquipe();
				break;
			case 2:
				int idrech=0;
				AffichSportif(idrech);
				break;
			case 3:
				affichAllSportif();
				break;
			case 4:
				affichEquipe();
				break;
			case 5:
				int id=0;
				rechEquipe(id);
				break;
			case 6: 
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
		System.out.println("Veuillez saisir les donnees suivantes:");
		System.out.println("Nom de l'equipe:");
		String nom = scan.nextLine();
		System.out.println("Nombre de personnes membres du staff: ");
		int nbstaff = scan.nextInt();
		System.out.println("Nombre de joueurs: ");
		int nbjoueur = scan.nextInt();
		System.out.println("Nom du sport: ");
		scan.nextLine();
		String sport = scan.nextLine();
		System.out.println("ID du tournoi: ");
		int idtournoi = scan.nextInt();
		System.out.println("Position dans le classement: ");
		int classement = scan.nextInt();
		//Equipe a = new Equipe(nom, nbstaff, nbjoueur, sport, idtournoi, classement);
		AjoutSQL.connexionAjoutEquipe(idequipe, nom, nbstaff, nbjoueur, sport, idtournoi, classement);
			
	}
	
	// Afficher les equipes
	private static void affichEquipe(){
		System.out.println("Liste des equipes: ");
		LectureSQL.LectEquipes();
		
	}
	
	// Affection sportif
	private static void AffichSportif(int idrech){
		System.out.println("Entrez le nom de l'équipe: ");
		idrech = scan.nextInt();
		LectureSQL.LectSportifInEquipe(idrech);	
	}
	
	// Supprimer affectation du sportif
	private static void affichAllSportif(){
		LectureSQL.LectSportifByEquipe();
	}
	
	// Rechercher une equipe
	private static void rechEquipe(int id){
		System.out.println("Entrez l'identifiant de l'équipe: ");
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
			System.out.println("| 2- Recherche un sportif               |");
			System.out.println("| 3- Afficher la liste des sportifs     |");
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
				int id=0;
				recherSportif(id);
				break;
			case 3:
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
	
	// Ajout d'un sportif
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
		scan.nextLine();
		String sport = scan.nextLine();
		AjoutSQL.connexionAjoutSportif(idsportif, nom, prenom, datenais, idequipe, sport);
	}
	
	/// Recherche d'un sportif
	private static void recherSportif(int id){
		System.out.println("Entrer l'identifiant du sport: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	// Affichage des sportifs
	private static void affichSportif(){
		System.out.println("Liste des sportifs: ");
		LectureSQL.LectSportifs();
	}
	
	
	
	// Menu Inscription
	
	public static void menuinscription(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------------+");
			System.out.println("|    Affichage et gestion des inscriptions    |");
			System.out.println("| 1- Ajouter une inscription                  |");
			System.out.println("| 2- Rechercher une inscription               |");
			System.out.println("| 3- Afficher la liste des inscriptions       |");
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
				int id=0;
				recherInscription(id);
				break;
			case 3:
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
	
	// Ajout d'une inscription
	private static void ajoutInscription(){
		int idinscription= 0;
		System.out.println("Nous allons proceder a l'inscription d'une equipe");
		System.out.println("Veuillez saisir les donnees suivantes: ");
		System.out.println("ID tournoi: ");
		int idtournoi = scan.nextInt();
		System.out.println("Nom tournoi: ");
		scan.nextLine();
		String tournoi = scan.nextLine();
		System.out.println("Nom de l'equipe: ");
		String equipe = scan.nextLine();
		System.out.println("Date d'inscription: ");
		String date = scan.nextLine();
		AjoutSQL.connexionAjoutInscription(idinscription, idtournoi, tournoi, equipe, date);
		ajoutEquipe();
	}
	
	
	// Recherche d'une inscription
	private static void recherInscription(int id){
		System.out.println("Entrer l'identifiant de l'inscription: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	// Affichage des inscriptions
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
			System.out.println("| 2- Rechercher un tournoi              |");
			System.out.println("| 3- Afficher la liste des tournois     |");
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
				int id = 0;
				recherTournoi(id);
				break;
			case 3:
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
	
	// Ajout d'un tounoir
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
		scan.nextLine();
		System.out.println("Ce tournoi commence le: ");
		String dateD = scan.nextLine();
		System.out.println("Ce tournoi fini le: ");
		String dateF = scan.nextLine();
		System.out.println("Il se deroulera: ");
		String lieu = scan.nextLine();
		AjoutSQL.connexionAjoutTournoi(idtournoi, nom, sport, nbequipe, dateD, dateF, lieu);
	}
	
	// Recherche d'un tournoi
	private static void recherTournoi(int id){
		System.out.println("Entrer le numéro de l'équipe: ");
		id = scan.nextInt();
		LectureSQL.LectUneEquipe(id);
	}
	
	// Affichage des tournois
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
			System.out.println("| 2- Recherche un match                 |");
			System.out.println("| 3- Afficher la liste des matchs       |");
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
				int id = 0;
				recherMatch(id);
				break;
			case 3:
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
	
	// Ajout d'un match
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
		scan.nextLine();
		String lieu = scan.nextLine();
		System.out.println("Score (format X-X): ");
		String score = scan.nextLine();
		System.out.println("ID de l'equipe gagnante: ");
		int equipegagnante = scan.nextInt();
		AjoutSQL.connexionAjoutMatch(idmatch, idtournoi,idequipe1, idequipe2, date, lieu, score, equipegagnante);
	}
	
	// Recherche d'un match
	private static void recherMatch(int id){
		System.out.println("Entrer l'identifiant du match: ");
		id = scan.nextInt();
		LectureSQL.LectUnMatch(id);
		
	}
	
	// Affichage des matchs
	private static void affichMatch(){
		System.out.println("Liste des matchs: ");
		LectureSQL.LectMatchs();
	}
	
	
	// Menu classement
	public static void menuclassement(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+-------------------------------------------+");
			System.out.println("|    Affichage et gestion des classements   |");
			System.out.println("| 1- Afficher l'ensemble des classements    |");
			System.out.println("| 2- Rechercher un classement               |");
			System.out.println("| 3- Afficher le classement par tournoi     |");
			System.out.println("| 4- Rechercher le classement d'un tournoi  |");
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
			case 3:
				affichClassementByTournoi();
				break;
			case 4:
				int id2 = 0;
				recherClassementTournoi(id2);
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
	
	// Affichage du classement
	private static void affichClassement(){
		System.out.println("Liste des classements: ");
		LectureSQL.LectClassements();
	}
	
	// Recherche d'un classement
	private static void recherClassement(int id){
		System.out.println("Entrer l'identifiant du classement: ");
		id = scan.nextInt();
		LectureSQL.LectUnClassement(id);
	}
	
	// Affichage des classements par tournoi
	
	private static void affichClassementByTournoi(){
		System.out.println("Liste des classements par tournoi: ");
		LectureSQL.LectClassementBySport();
	}
	
	// Recherche d'un classement d'un tournoi
	
	private static void recherClassementTournoi(int id2){
		System.out.println("Entrer l'identifiant du tournoi: ");
		id2 = scan.nextInt();
		LectureSQL.LectClassementRechSport(id2);
	}
	
	// Menu Staff
	
	public static void menustaff(){
		int cpt = 11;
		
		while (cpt!=0){
			System.out.println("+---------------------------------------+");
			System.out.println("|    Affichage et gestion des staffs    |");
			System.out.println("| 1- Ajouter un staff                   |");
			System.out.println("| 2- Rechercher un staff                |");
			System.out.println("| 3- Afficher la liste des staffs       |");
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
				int id = 0;
				recherStaff(id);
				break;
			case 3:
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
	
		// Ajout d'un membre du staff
	
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
			scan.nextLine();
			String fonction = scan.nextLine();
			AjoutSQL.connexionAjoutStaff(idmembre, nom, prenom, idequipe, fonction);
		}
		
		// Recherche d'un membre du staff
		
		private static void recherStaff(int id){
			System.out.println("Entrer l'identifiant du membre: ");
			id = scan.nextInt();
			LectureSQL.LectUnStaff(id);
		}
		
		//Affichage des membres des staffs
		
		private static void affichStaff(){
			System.out.println("Liste des membres des staffs: ");
			LectureSQL.LectStaffs();
		}
		
		
}

