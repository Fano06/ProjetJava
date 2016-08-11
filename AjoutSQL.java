package multisport;

//Etape 1: Import des packages requis
import java.sql.*;

public class AjoutSQL {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/multisport";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";
	
	// Connexion a la table Equipe
	
	public static void connexionAjoutEquipe(int idequipe, String nom, int nbstaff, int nbjoueur, String sport, int idtournoi, int classement){
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
			System.out.println("Insertion des donnees dans la table...");
			stmt = conn.createStatement();
    
			String sql = "INSERT INTO equipe " +
						 "VALUES ('0', '"+nom+"', '"+nbstaff+"', '"+nbjoueur+"', '"+sport+"', '"+idtournoi+"', '"+classement+"')";
			stmt.executeUpdate(sql);
    
			System.out.println("Donnees ajoutees dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilis2 pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la BDD Sportif
	
	public static void connexionAjoutSportif(int idsportif, String nom, String prenom, String dateNaissance, int idequipe, String sport){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
    
			String sql = "INSERT INTO enseignant " +
						 "VALUES ('0', '"+nom+"', '"+prenom+"', '"+dateNaissance+"', '"+idequipe+"', '"+sport+"')";
			stmt.executeUpdate(sql);
    
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Match
	
	public static void connexionAjoutMatch(int idmatch, int idtournoi, int idequipe1, int idequipe2, String date, String lieu, String score, int equipegagnante){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requete
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
    
			String sql = "INSERT INTO note " +
						 "VALUES ('0', '"+idtournoi+"', '"+idequipe1+"', '"+idequipe2+"'', '"+date+"'', '"+lieu+"'', '"+score+"'', '"+equipegagnante+"')";
			stmt.executeUpdate(sql);
    
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilise pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Staff
	
	public static void connexionAjoutStaff(int idmembre, String nom, String prenom, int idequipe, String fonction){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
    
			String sql = "INSERT INTO staff " +
						 "VALUES ('0', '"+nom+"', '"+prenom+"', '"+idequipe+"', '"+fonction+"')";
			stmt.executeUpdate(sql);
    
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Tournoi
	
	public static void connexionAjoutTournoi(int idtournoi, String nom, String sport, int nbequipe, String dateD, String dateF, String lieu){
	Connection conn = null;
	Statement stmt = null;
	try {
		//Etape 2: Enregistrement JDBC Driver
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver O.K.");
		  
		//Etape 3: Ouverture connexion
		  System.out.println("Connexion Ã  la BDD...");
		  conn = DriverManager.getConnection(DB_URL,USER, PWD);
		  System.out.println("Connexion Ã©tablie...");				  
	
		//Etape 4: Execution de la requÃªte
		System.out.println("Insertion des donnees dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO tournoi " +
					 "VALUES ('0', '"+nom+"', '"+sport+"', '"+nbequipe+"', '"+dateD+"', '"+dateF+"', '"+lieu+"')";
		stmt.executeUpdate(sql);

		System.out.println("Donnees ajoutees dans la table...");

	}
	catch(SQLException se){
		//Gestion erreurs pour JDBC
		se.printStackTrace();
	}
	catch(Exception e){
		//Gestion erreurs pour Class.forName
		e.printStackTrace();
	}
	finally{
		//bloc finally utilisÃ© pour fermer les ressources
		try{
			if(stmt!=null)
			conn.close();
		}
		catch(SQLException se){
		}// do nothing
		try{
			if(conn!=null)
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Inscription
	
	public static void connexionAjoutInscription(int idinscription, int idtournoi, String tournoi, String equipe, String date){
	Connection conn = null;
	Statement stmt = null;
	try {
		//Etape 2: Enregistrement JDBC Driver
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver O.K.");
		  
		//Etape 3: Ouverture connexion
		  System.out.println("Connexion Ã  la BDD...");
		  conn = DriverManager.getConnection(DB_URL,USER, PWD);
		  System.out.println("Connexion Ã©tablie...");				  
	
		//Etape 4: Execution de la requÃªte
		System.out.println("Insertion des donnÃ©es dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO inscription " +
					 "VALUES ('0', '"+idtournoi+"', '"+tournoi+"', '"+equipe+"', '"+date+"')";
		stmt.executeUpdate(sql);

		System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

	}
	catch(SQLException se){
		//Gestion erreurs pour JDBC
		se.printStackTrace();
	}
	catch(Exception e){
		//Gestion erreurs pour Class.forName
		e.printStackTrace();
	}
	finally{
		//bloc finally utilisÃ© pour fermer les ressources
		try{
			if(stmt!=null)
			conn.close();
		}
		catch(SQLException se){
		}// do nothing
		try{
			if(conn!=null)
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Classement
	
	public void connexionAjoutClassement(int idclassement, String date, int idequipe){
	Connection conn = null;
	Statement stmt = null;
	try {
		//Etape 2: Enregistrement JDBC Driver
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver O.K.");
		  
		//Etape 3: Ouverture connexion
		  System.out.println("Connexion Ã  la BDD...");
		  conn = DriverManager.getConnection(DB_URL,USER, PWD);
		  System.out.println("Connexion Ã©tablie...");				  
	
		//Etape 4: Execution de la requÃªte
		System.out.println("Insertion des donnees dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO classe " +
					 "VALUES ('"+idclassement+"', '"+date+"', '"+idequipe+"')";
		stmt.executeUpdate(sql);

		System.out.println("DonnÃ©es ajoutees dans la table...");

	}
	catch(SQLException se){
		//Gestion erreurs pour JDBC
		se.printStackTrace();
	}
	catch(Exception e){
		//Gestion erreurs pour Class.forName
		e.printStackTrace();
	}
	finally{
		//bloc finally utilisÃ© pour fermer les ressources
		try{
			if(stmt!=null)
			conn.close();
		}
		catch(SQLException se){
		}// do nothing
		try{
			if(conn!=null)
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Tournoi
	
	public void connexionAjoutAnnulation(int idannulation, int idmatch, String cause){
	Connection conn = null;
	Statement stmt = null;
	try {
		//Etape 2: Enregistrement JDBC Driver
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver O.K.");
		  
		//Etape 3: Ouverture connexion
		  System.out.println("Connexion Ã  la BDD...");
		  conn = DriverManager.getConnection(DB_URL,USER, PWD);
		  System.out.println("Connexion Ã©tablie...");				  
	
		//Etape 4: Execution de la requÃªte
		System.out.println("Insertion des donnÃ©es dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO classe " +
					 "VALUES ('"+idannulation+"', '"+idmatch+"', '"+cause+"')";
		stmt.executeUpdate(sql);

		System.out.println("DonnÃ©es ajoutees dans la table...");

	}
	catch(SQLException se){
		//Gestion erreurs pour JDBC
		se.printStackTrace();
	}
	catch(Exception e){
		//Gestion erreurs pour Class.forName
		e.printStackTrace();
	}
	finally{
		//bloc finally utilisÃ© pour fermer les ressources
		try{
			if(stmt!=null)
			conn.close();
		}
		catch(SQLException se){
		}// do nothing
		try{
			if(conn!=null)
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Fin connexion BDD...");
	}
	
	// Connexion a la table Report
	
	public void connexionAjoutReport(int idreport, int idmatch, String datereport, String cause){
	Connection conn = null;
	Statement stmt = null;
	try {
		//Etape 2: Enregistrement JDBC Driver
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver O.K.");
		  
		//Etape 3: Ouverture connexion
		  System.out.println("Connexion Ã  la BDD...");
		  conn = DriverManager.getConnection(DB_URL,USER, PWD);
		  System.out.println("Connexion Ã©tablie...");				  
	
		//Etape 4: Execution de la requÃªte
		System.out.println("Insertion des donnÃ©es dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO report " +
					 "VALUES ('"+idreport+"', '"+idmatch+"', '"+datereport+"', '"+cause+"')";
		stmt.executeUpdate(sql);

		System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

	}
	catch(SQLException se){
		//Gestion erreurs pour JDBC
		se.printStackTrace();
	}
	catch(Exception e){
		//Gestion erreurs pour Class.forName
		e.printStackTrace();
	}
	finally{
		//bloc finally utilisÃ© pour fermer les ressources
		try{
			if(stmt!=null)
			conn.close();
		}
		catch(SQLException se){
		}// do nothing
		try{
			if(conn!=null)
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Fin connexion BDD...");
	}

}

