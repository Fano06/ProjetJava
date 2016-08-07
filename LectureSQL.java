package multisport;

//Etape 1: Import des packages requis
import java.sql.*;

public class LectureSQL {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";

	public static void LectEquipes() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idequipe, nom, nbstaff, nbjoueur, sport, idtournoi, classement FROM equipe)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  int nbstaff = rs.getInt("nbstaff");
		    	  int nbjoueur = rs.getInt("nbjoueur");
		    	  String sport = rs.getString("sport");
		    	  int idtournoi = rs.getInt("idtounoir");
		    	  int classement = rs.getInt("classement");
		    	  int idequipe = rs.getInt("idequipe");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID equie: "+idequipe);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Nombre de personnes composant le staff:"+nbstaff);
		    	  System.out.print(", Nombre de joueurs: "+nbjoueur);
		    	  System.out.print(", Sport concerne: "+sport);
		    	  System.out.print(", ID tournoi: "+idtournoi);
		    	  System.out.println(", Classement: "+classement);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUneEquipe(int id) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idequipe, nom, nbstaff, nbjoueur, sport, idtournoi, classement FROM equipe WHERE idequipe='"+id+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  int nbstaff = rs.getInt("nbstaff");
		    	  int nbjoueur = rs.getInt("nbjoueur");
		    	  String sport = rs.getString("sport");
		    	  int idtournoi = rs.getInt("idtounoi");
		    	  int classement = rs.getInt("classement");
		    	  int idequipe = rs.getInt("idequipe");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID equipe: "+idequipe);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Nombre de personnes composant le staff:"+nbstaff);
		    	  System.out.print(", Nombre de joueurs: "+nbjoueur);
		    	  System.out.print(", Sport concerne: "+sport);
		    	  System.out.print(", ID tournoi: "+idtournoi);
		    	  System.out.println(", Classement: "+classement);
		    	 
		    	  
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		 
		  }
	
	public static void LectSportifInEquipe(int id) {
		Connection conn = null;
		Statement stmt = null;
		int idsportif=0;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idsportif, nom, prenom, datenais, idequipe, sport FROM sportif WHERE idequipe='"+id+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String datenais = rs.getString("datenais");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String sport = rs.getString("sport");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID sportif: "+idsportif);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de naissance: "+datenais);
		    	  System.out.print(", ID equipe: "+idequipe);
		    	  System.out.print(", Sport concerne: "+sport);
		    	 
		    	  
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		 
		  }
	
	public static void LectSportifByEquipe() {
		Connection conn = null;
		Statement stmt = null;
		int idsportif=0;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idsportif, nom, prenom, datenais, idequipe, sport FROM sportif GROUP BY idequipe)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String datenais = rs.getString("datenais");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String sport = rs.getString("sport");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID sportif: "+idsportif);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de naissance: "+datenais);
		    	  System.out.print(", ID equipe: "+idequipe);
		    	  System.out.print(", Sport concerne: "+sport);
		    	 
		    	  
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		 
		  }
	
	public static void modifEquipe(int idrech, String newnom, int newnbstaff, int newnbjoueur, int newclassement){
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(UPDATE  equipe SET nom='"+newnom+"', nbstaff='"+newnbstaff+"', nbjoueur='"+newnbjoueur+"', classement='"+newclassement+"' WHERE idequipe='"+idrech+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  int nbstaff = rs.getInt("nbstaff");
		    	  int nbjoueur = rs.getInt("nbjoueur");
		    	  int classement = rs.getInt("classement");
		    	  int idequipe = rs.getInt("idequipe");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID equipe: "+idequipe);
		    	  System.out.print(", nouveau nom: "+nom);
		    	  System.out.print(", Nombre de personnes composant le staff:"+nbstaff);
		    	  System.out.print(", Nombre de joueurs: "+nbjoueur);
		    	  System.out.println(", nouveau classement: "+classement);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }

	public static void LectSportifs() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requÃªte
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idsportif, nom, prenom, datenais, sport, idequipe FROM sportif)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
				  int idsportif = rs.getInt("idsport");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String datenais = rs.getString("datenais");
		    	  String sport = rs.getString("sport");
		    	  int idequipe = rs.getInt("idequipe");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Id Sportif: "+idsportif);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+datenais);
		    	  System.out.print(", Sport concerne: "+sport);
		    	  System.out.print(", ID equipe: "+idequipe);				  
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	public static void LectUnSportif(int id) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requÃªte
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idsportif, nom, prenom, datenais, sport, idequipe FROM sportif WHERE idsportif='"+id+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
				  int idsportif = rs.getInt("idsport");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String datenais = rs.getString("datenais");
		    	  String sport = rs.getString("sport");
		    	  int idequipe = rs.getInt("idequipe");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Id Sportif: "+idsportif);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+datenais);
		    	  System.out.print(", Sport concerne: "+sport);
		    	  System.out.print(", ID equipe: "+idequipe);				  
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectStaffs() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requÃªte
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idmembre, nom, prenom, idequipe, fonction FROM staff)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idmembre = rs.getInt("idmembre");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String fonction = rs.getString("fonction");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID membre: "+idmembre);
				  System.out.print(", Nom: "+nom);
				  System.out.print(", Prenom: "+prenom);
		    	  System.out.println(", ID equipe: "+idequipe);
		    	  System.out.println(", Fonction: "+fonction);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUnStaff(int id) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requÃªte
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idmembre, nom, prenom, idequipe, fonction FROM staff WHERE idmembre='"+id+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idmembre = rs.getInt("idmembre");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String fonction = rs.getString("fonction");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID membre: "+idmembre);
				  System.out.print(", Nom: "+nom);
				  System.out.print(", Prenom: "+prenom);
		    	  System.out.println(", ID equipe: "+idequipe);
		    	  System.out.println(", Foncion: "+fonction);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	
	public static void LectInscriptions() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idinscription, idtournoi, tournoi, equipe, date FROM inscription)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idinscription = rs.getInt("idinscription");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  String tournoi = rs.getString("tournoi");
		    	  String equipe = rs.getString("equipe");
		    	  String date = rs.getString("date");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID inscription: "+idinscription);
				  System.out.print(", ID tournoi: "+idtournoi);
				  System.out.print(", Nom tournoi: "+tournoi);
				  System.out.print(", Equipe: "+equipe);
		    	  System.out.println(", Date d'inscription: "+date);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUneInscription(int idrech) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idinscription, idtournoi, tournoi, equipe, date FROM inscription WHERE id='"+idrech+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idinscription = rs.getInt("idinscription");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  String tournoi = rs.getString("tournoi");
		    	  String equipe = rs.getString("equipe");
		    	  String date = rs.getString("date");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID inscription: "+idinscription);
				  System.out.print(", ID tournoi: "+idtournoi);
				  System.out.print(", Nom tournoi: "+tournoi);
				  System.out.print(", Equipe: "+equipe);
		    	  System.out.println(", Date d'inscription: "+date);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectTournois() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idtournoi, nom, sport, nbequipe, dateD, dateF, lieu FROM tournoi)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  String nom = rs.getString("nom");
		    	  String sport = rs.getString("sport");
		    	  int nbequipe = rs.getInt("nbequipe");
		    	  String dateD = rs.getString("dateD");
		    	  String dateF = rs.getString("dateF");
		    	  String lieu = rs.getString("lieu");
		    	  
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID tournoi: "+idtournoi);
				  System.out.print(", Nom tournoi: "+nom);
				  System.out.print(", Sport concerne: "+sport);
				  System.out.print(", Nombre d'equipes: "+nbequipe);
		    	  System.out.println(", Date de debut: "+dateD);
		    	  System.out.println(", Date de fin: "+dateF);
		    	  System.out.println(", Lieu: "+lieu);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUnTournoi(int idrech) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idtournoi, nom, sport, nbequipe, dateD, dateF, lieu FROM tournoi WHERE id='"+idrech+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  String nom = rs.getString("nom");
		    	  String sport = rs.getString("sport");
		    	  int nbequipe = rs.getInt("nbequipe");
		    	  String dateD = rs.getString("dateD");
		    	  String dateF = rs.getString("dateF");
		    	  String lieu = rs.getString("lieu");
		    	  
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID tournoi: "+idtournoi);
				  System.out.print(", Nom tournoi: "+nom);
				  System.out.print(", Sport concerne: "+sport);
				  System.out.print(", Nombre d'equipes: "+nbequipe);
		    	  System.out.println(", Date de debut: "+dateD);
		    	  System.out.println(", Date de fin: "+dateF);
		    	  System.out.println(", Lieu: "+lieu);
		      }
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		      
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	
	public static void LectMatchs() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idmatch, idtournoi, idequipe1, idequipe2, date, lieu, score FROM match)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idmatch = rs.getInt("idmatch");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  int idequipe1 = rs.getInt("idequipe1");
		    	  int idequipe2 = rs.getInt("idequipe1");
		    	  String date = rs.getString("date");
		    	  String lieu = rs.getString("lieu");
		    	  String score = rs.getString("score");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID inscription: "+idmatch);
				  System.out.print(", ID tournoi: "+idtournoi);
				  System.out.print(", ID equipe1: "+idequipe1);
				  System.out.print(", ID equipe2: "+idequipe2);
		    	  System.out.println(", Date du match: "+date);
		    	  System.out.println(", Date du match: "+lieu);
		    	  System.out.println(", Date du match: "+score);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUnMatch(int idrech) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT idmatch, idtournoi, idequipe1, idequipe2, date, lieu, score FROM match WHERE id='"+idrech+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idmatch = rs.getInt("idmatch");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  int idequipe1 = rs.getInt("idequipe1");
		    	  int idequipe2 = rs.getInt("idequipe1");
		    	  String date = rs.getString("date");
		    	  String lieu = rs.getString("lieu");
		    	  String score = rs.getString("score");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID inscription: "+idmatch);
				  System.out.print(", ID tournoi: "+idtournoi);
				  System.out.print(", ID equipe1: "+idequipe1);
				  System.out.print(", ID equipe2: "+idequipe2);
		    	  System.out.println(", Date du match: "+date);
		    	  System.out.println(", Date du match: "+lieu);
		    	  System.out.println(", Date du match: "+score);
		      }
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		      
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectClassements() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idclassement, idtournoi, idequipe, sport FROM classement)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idclassement = rs.getInt("idclassement");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String sport = rs.getString("sport");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID classement: "+idclassement);
		    	  System.out.print(", ID tournoi: "+idtournoi);
		    	  System.out.print(", ID equipe:"+idequipe);
		    	  System.out.print(", Sport: "+sport);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
	
	public static void LectUnClassement(int id) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion a  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion etablie...");
		      
		    //Etape 4: Execution de la requete
		      System.out.println("Creation de la requete...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  idclassement, idtournoi, idequipe, sport FROM classement WHERE idtournoi='"+id+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  int idclassement = rs.getInt("idclassement");
		    	  int idtournoi = rs.getInt("idtournoi");
		    	  int idequipe = rs.getInt("idequipe");
		    	  String sport = rs.getString("sport");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("ID classement: "+idclassement);
		    	  System.out.print(", ID tournoi: "+idtournoi);
		    	  System.out.print(", ID equipe:"+idequipe);
		    	  System.out.print(", Sport: "+sport);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisÃ© pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien Ã  faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		  }
}

