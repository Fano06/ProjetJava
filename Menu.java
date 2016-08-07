package multisport;

import java.util.Scanner;

public class Menu{

	public static void main(String[] args)
	{
	int menu1=0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Que souhaitez vous faire? (taper le numero)");
	System.out.println("-1- Voir les fonctionnalites pour les sportifs");
	System.out.println("-2- Voir les fonctionnalites pour les equipes");
	System.out.println("-3- Voir les fonctionnalites pour les matchs");
	System.out.println("Choix: ");
	menu1= sc.nextInt();
	
	switch (menu1)
	{
		case 1:
		{
			int choix1 =0;
			System.out.println("-1- Ajouter un sportif");
			System.out.println("-2- Supprimer un sportif");
			System.out.println("-3- Avoir la liste des sportifs");
			System.out.println("-4- Rechercher un sportifs");
			System.out.println("-5- Modifier un sportif");
			
			choix1= sc.nextInt();
			
			switch(choix1)
			{
				case 1: 
				{
					System.out.println("Saisir le nom du sportif");
					String nomsport=sc.nextLine();
					System.out.println("Saisir le prÃ©nom du sportif");
					String prenomsport=sc.nextLine();
					System.out.println("Saisir la date de naissance du sportif (JJ/MM/AAAA");
					String datesport=sc.nextLine();
					System.out.println("Saisir le mail du sportif");
					String mailsport=sc.nextLine();
					break;
				}
				
				case 2:
				{
					System.out.println("Saisir le nom du sportif");
					String nomsport1= sc.nextLine();
					break;
				}
				
				case 3:
				{
					
				}
				
				case 4:
				{
					System.out.println("Saisir le nom du sportif");
					String nomsport2= sc.nextLine();
					break;
				}
				
				case 5:
				{
					System.out.println("Saisir le nom du sportif");
					String nomsport3= sc.nextLine();
					break;
				}
			}
		}
		
		case 2:
		{
			int choix2 =0;
			System.out.println("-1- Ajouter une Ã©quipe");
			System.out.println("-2- Supprimer une Ã©quipe");
			System.out.println("-3- Ajouter un sportif dans une Ã©quipe");
			System.out.println("-4- Supprimer un sportif d'une Ã©quipe");
			System.out.println("-5- Avoir la liste des Ã©quipes");
			System.out.println("-6- Rechercher une Ã©quipe");
			System.out.println("-7- Modifier une Ã©quipe");
			
			choix2= sc.nextInt();
			
			switch(choix2)
			{
				case 1: 
				{
					System.out.println("Saisir le nom de l'Ã©quipe");
					String nomequipe=sc.nextLine();
					System.out.println("Saisir la couleur de l'Ã©quipe");
					String couleurequipet=sc.nextLine();
					System.out.println("Saisir le sport de l'Ã©qupe");
					String sportequipe=sc.nextLine();
					System.out.println("Saisir le mail de l'Ã©quipe");
					String mailequipe=sc.nextLine();
					break;
				}
				
				case 2:
				{
					System.out.println("Saisir le nom de l'Ã©quipe Ã  supprimer");
					String nomequipe1=sc.nextLine();
					break;
				}
				
				case 3:
				{
					System.out.println("Saisir le nom du sportif");
					String nomsportifajout=sc.nextLine();
					System.out.println("Saisir le nom de l'Ã©quipe oÃ¹ ajouter le sportif");
					String nomequipeajout=sc.nextLine();
					break;
				}
				
				case 4:
				{
					System.out.println("Saisir le nom du sportif");
					String nomsportifesupp=sc.nextLine();
					System.out.println("Saisir le nom de l'Ã©quipe oÃ¹ ajouter le sportif");
					String nomequipesupp=sc.nextLine();
					break;
				}
				
				case 5:
				{
					
				}
				
				case 6:
				{
					System.out.println("Saisir le nom du sportif");
					String nomequipe2=sc.nextLine();
					break;
				}
				
				case 7:
				{
					System.out.println("Saisir le nom du sportif");
					String nomequipe3=sc.nextLine();
					break;
				}
			}
		}
		
		case 3:
		{
			int choix3 =0;
			System.out.println("-1- Ajouter un match");
			System.out.println("-2- Supprimer un match");
			System.out.println("-3- Rechercher un match");
			System.out.println("-4- Avoir la liste des matchs");
			System.out.println("-5- Modifier un match");

			choix3= sc.nextInt();
			
			switch(choix3)
			{
				case 1: 
				{
					System.out.println("Saisir le nom de l'Ã©quipe dom");
					String nomequipedom=sc.nextLine();
					System.out.println("Saisir le nom de l'Ã©quipe ext");
					String nomequipeext= sc.nextLine();
					System.out.println("Saisir le score de l'Ã©quipe dom");
					String scoreequipedom=sc.nextLine();
					System.out.println("Saisir le score de l'Ã©quipe ext");
					String scoreequipeext= sc.nextLine();
				}
				
				case 2:
				{
					
				}
				
				case 3:
				{
					
				}
				
				case 4:
				{
					
				}
				
				case 5:
				{
					
				}
			}
		}
		
		
	}
	}
}

