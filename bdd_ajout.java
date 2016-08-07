package multisport;

//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_ajout {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/multisport";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";
	
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
						 "VALUES ('+idequipe+', '"+nom+"', '+nbstaff+', '+nbjoueur+', '"+sport+"', '+idtournoi+', '+classement+')";
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
	/*
	public void connexionAjoutSportif(int idsportif, String nom, String prenom, String dateNaissance, String sport, int idequipe){
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
						 "VALUES ('"+idsportif+"', '"+nom+"', '"+prenom+"', '"+dateNaissance+"', '"+sport+"', '"+idequipe+"')";
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
	
	public void connexionAjoutMatch(int idmatch, int idtournoi, int idequipe1, int idequipe2, String date, String lieu, String score, int idreport, int idannule){
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
    
			String sql = "INSERT INTO note " +
						 "VALUES ('"+idmatch+"', '"+idtournoi+"', '"+idequipe1+"', '"+idequipe2+"'', '"+date+"'', '"+lieu+"'', '"+score+"'', '"+idreport+"'', '"+idannule+"')";
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
	
	public void connexionAjoutStaff(int idmembre, String nom, String prenom, int idequipe){
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
						 "VALUES ('"+idmembre+"', '"+nom+"', '"+prenom+"', '"+idequipe+"')";
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
	public void connexionAjoutTournoi(int idtournoi, String nom, String sport, int nbequipe, int match, String datdebut, String datefin, String lieu){
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
					 "VALUES ('"+idtournoi+"', '"+nom+"', '"+sport+"', '"+nbequipe+"', '"+match+"', '"+datedebut+"', '"+datefin+"', '"+lieu+"')";
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
	public void connexionAjoutInscription(int idinscription, int idtournoi, int idequipe, String date){
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
					 "VALUES ('"+idinscription+"', '"+idtournoi+"', '"+idequipe+"', '"+date+"')";
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
		System.out.println("Insertion des donnÃ©es dans la table...");
		stmt = conn.createStatement();

		String sql = "INSERT INTO classe " +
					 "VALUES ('"+idclassement+"', '"+date+"', '"+idequipe+"')";
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
	public void connexionAjoutReport(int idreport, int idmatch, String datereport String cause){
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
	*/
}

