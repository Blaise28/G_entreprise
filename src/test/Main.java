package test;

import g_entreprise.Contrat;
import g_entreprise.Depart_service;
import g_entreprise.Departement;
import g_entreprise.Employe;
import g_entreprise.Entreprise;
import g_entreprise.Service;
import m_saisie.Saisie;

public class Main {

	public static Entreprise boolEntr()
	{
		Entreprise ent=null;
		if(Entreprise.list_Entreprise().size()>0)
		{
			System.out.println("Affichages des entreprises deja enregistres");
			Entreprise.all_Entreprise();
			System.out.println("1.utiliser l'un des entreprises deja enregistres");
			System.out.println("2.cree une nouvelle entreprise");
			switch(Saisie.saisirEntier("choisisser le choix"))
			{
			case 1:
				int ent_index=0;
				do
				{
					ent_index=Saisie.saisirEntier("taper l'index ");
				}while(ent_index <0 || ent_index >Entreprise.list_Entreprise().size());
				ent=Entreprise.list_Entreprise().get(ent_index);
				break;
			case 2:
				System.out.println("creation d'un entreprise");
				System.out.println("************************");
				ent=new Entreprise(Saisie.saisirEntier("taper l'id de l'entreprise"),Saisie.saisirchaine("taper le nom"));
				break;
			}
		}
		else
		{
			System.out.println("pas d'entreprise on cree un");
			System.out.println("---------------------------");
			ent=new Entreprise(Saisie.saisirEntier("taper l'id de l'entreprise"),Saisie.saisirchaine("taper le nom"));
		}
		return ent;
		
	}
	public static Departement boolDepart()
	{
		Departement depart=null;
		Entreprise entr=null;
		// si il y a des departement qui existe
		if(Departement.list_depart().size()>0)
		{
			System.out.println("-- Affichages des departement deja enregistre");
			Departement.all_Departements();
			System.out.println("********************");
			System.out.println("choisissez SVP");
			System.out.println("*********************");
			System.out.println("1.utiliser l'un des departement deja enregistres <l'index svp>");
			System.out.println("2.Cree un nouveau departement");
			switch(Saisie.saisirEntier("choisissez l'un des choix en haut"))
			{
			// utiliser des departements existants
			case 1:
				int dep_index=0;
					do
					{
						dep_index=Saisie.saisirEntier("saisie l'index");
					}while(dep_index <0 || dep_index > Departement.list_depart().size());
					depart=Departement.list_depart().get(dep_index);
				break;
			case 2:
				System.out.println("Creation d'un nouveau departement");
				System.out.println("*********************************");
				entr=boolEntr();
				depart= new Departement(
						Saisie.saisirEntier("Saisir l'id du departement"),
						Saisie.saisirchaine("le nom du departement svp"),
						entr
						);
			break;
				default :
					System.out.println("Choisissez la bonne reponse SVP");
			}
		}
		else
		{
			System.out.println("Pas de departement on cree un");
			System.out.println("*****************************");
			entr=boolEntr();
			depart=new Departement(
					Saisie.saisirEntier("Saisir l'id du departement"),
					Saisie.saisirchaine("le nom du departement svp"),
					entr
					);
		}
		return depart ;
	}
	public static Service boolservice()
	{
		Service serv=null;
		if(Service.list_serv().size()>0)
		{
			System.out.println("--Affichages des services--");
			Service.all_Services();
			System.out.println("-- Fin --");
			System.out.println("1.utiliser l'un des choix des service affiche en haut");
			System.out.println("2.cree une nouvelle service");
			switch(Saisie.saisirEntier("taper le choix"))
			{
			case 1:
				int serv_index=0;
				do
				{
					serv_index=Saisie.saisirEntier("Taper l'index");
				}while(serv_index <0 || serv_index > Service.list_serv().size());
				serv=Service.list_serv().get(serv_index);
				break;
			case 2:
				System.out.println("Creation d_un nouveau service");
				System.out.println("******************************");
				serv=new Service(Saisie.saisirEntier("taper l'id du service"),
						Saisie.saisirchaine("taper le nom du service")	
						);
			break;
			default :
				System.out.println("choisissez la bonne reponse");
			}
		}
		else
		{
			System.out.println("Pas de service ,on cree un");
			System.out.println("***************************");
			serv=new Service(Saisie.saisirEntier("taper l'id du service"),
					Saisie.saisirchaine("taper le nom du service")	
					);
		}
		return serv ;	
	}
	public static Depart_service booldepart_service()
	{
		Depart_service depart_serv=null;
		Departement Depart=null;
		Service serv=null;
		if(Depart_service.list_Depart_service().size()>0)
		{
			System.out.println("-- Affichage des departements et service --");
			Depart_service.all_Depart_service();
			System.out.println("-- Fin --");
			System.out.println("1.Utiliser l'un deja enregistre");
			System.out.println("2.Cree une nouvelle departement service");
			switch(Saisie.saisirEntier("Taper le choix"))
			{
			case 1:
				int index=0;
				do
				{
					index=Saisie.saisirEntier("taper l'index");
				}while(index <0 || index >Depart_service.list_Depart_service().size());
				depart_serv=Depart_service.list_Depart_service().get(index);
				break;
			case 2:
				System.out.println("Creation d_un departement service");
				System.out.println("*********************************");
				Depart=boolDepart();
				serv=boolservice();
				new Depart_service(Saisie.saisirEntier("Taper l'id du departement service"),Depart,serv);
			}
			}
		else
		{
			System.out.println("Pas encore de Dep_Serv deja enregistres on cree un");
			System.out.println("****************************************************");
			Depart=boolDepart();
			// appele de la methode qui traite les services
			serv=boolservice();
			// on cree un objet depart_service
			depart_serv=new Depart_service(Saisie.saisirEntier("taper l'id du departement service"),Depart,serv);
		}
		return depart_serv;
	}
	public static Employe boolEmpl()
	{
		Employe emp=null;
		if(Employe.list_empl().size()>0)
		{
			System.out.println("-- Affichage des employes --");
			Employe.all_Employe();
			System.out.println("-- fin d'affichage--");
			System.out.println("1.Utiliser l'un des employes deja enregistres");
			System.out.println("2.cree une nouvelle employe");
			switch(Saisie.saisirEntier("taper le choix"))
			{
			case 1:
				int emp_index=0;
				do
				{
					Saisie.saisirEntier("taper l'index");
				}while(emp_index <0 || emp_index >Employe.list_empl().size());
				emp=Employe.list_empl().get(emp_index);
				break;
			case 2:
				System.out.println("Creation d_un nouveau employe");
				System.out.println("******************************");
				emp=new Employe(Saisie.saisirEntier("taper le numero matricule"),
						Saisie.saisirchaine("taper le nom"),
						Saisie.saisirchaine("taper le prenom")
						);
			}
		}
		else
		{
			System.out.println("Pas d'employe on cree un");
			System.out.println("******************************");
			emp=new Employe(Saisie.saisirEntier("taper le numero matricule"),
					Saisie.saisirchaine("taper le nom"),
					Saisie.saisirchaine("taper le prenom")
					);
		}
			return emp;
	}
	public static void menu()
	{
		System.out.println("***************");
		System.out.println("MENU");
		System.out.println("***************");
		
		System.out.println("0.QUitter l'application");
		System.out.println("1.Cree un entreprise");
		System.out.println("2.Affiche un entreprise");
		
		System.out.println("3. Creer un nouveau departement");
		System.out.println("4.Afficher les departements deja enregistres");
         
		System.out.println("5.Cree un nouveau service");
		System.out.println("6.Afficher le service");
		
		System.out.println("7. Creer un nouveau departement service");
		System.out.println("8.Afficher les departements et service deje enregistres");
       
		System.out.println("9. Creer un nouvel employe");
		System.out.println("10. Afficher les employes");
		
		System.out.println("11.creer une nouvelle contrat");
		System.out.println("12.Affichage des contrat des employes");
		
		switch(Saisie.saisirEntier("choisissez l'un des choix qui est en haut"))
		{
		case 0:
			System.out.println("A bientot");
			System.exit(0);
		break;
		case 1:
			//new Entreprise(Saisie.saisirEntier("tape l'id de l'entreprise"),Saisie.saisirchaine("taper le nom"));
			new Entreprise(Saisie.saisirEntier("tape l'id de l'entreprise"),Saisie.saisirchaine("taper le nom"));
			break;
			
		case 2:
			System.out.println("Affichages des entreprises");
			Entreprise.all_Entreprise();
			//Entreprise.identite();
			break;
		case 3:
			Entreprise ent=null;
			if(Entreprise.list_Entreprise().size()>0)
			{
				System.out.println("Affichages deS Entreprise deja enregistre");
				Entreprise.all_Entreprise();
				System.out.println("1.utiliser les entreprises deja enregistres");
				System.out.println("2.cree une nouvelle entreprise");
					switch(Saisie.saisirEntier("taper le choix"))
					{
					case 1:
							int Entr_index=0;
							do
							{
								Entr_index=Saisie.saisirEntier("taper l'index");
							}while(Entr_index <0 || Entr_index >Entreprise.list_Entreprise().size());
							ent=Entreprise.list_Entreprise().get(Entr_index);
						break;
					case 2:
						ent=new Entreprise(Saisie.saisirEntier("taper l'id de l'entreprise"),
								Saisie.saisirchaine("taper le nom")
								);
					break;
					}
					new Departement(Saisie.saisirEntier("taper l'id du departement"),
							Saisie.saisirchaine("Taper le nom du departement"),ent);
					break;
			}
			else
			{
				ent=new Entreprise(Saisie.saisirEntier("taper l'id de l'entreprise"),
						Saisie.saisirchaine("taper le nom")
						//Saisie.saisirEntier("taper le code")
						);
				new Departement(Saisie.saisirEntier("taper l'id du departement"),
						Saisie.saisirchaine("Taper le nom du departement"),ent);
			}
			break;
		case 4:
			System.out.println("Affichage des departement");
				Departement.all_Departements();
				System.out.println("***********************");
			break;
		case 5 :
			new Service(Saisie.saisirEntier("taper l'id du service"),Saisie.saisirchaine("taper le nom"));
			break;
		case 6:
			System.out.println("-- Affichage des services--");
			Service.all_Services();
			System.out.println("-- Fin d'ffichage des services--");
		case 7 :
			Departement dep=boolDepart();
			Service serv=boolservice();
			
			new Depart_service(Saisie.saisirEntier("taper l'id du departement service"),dep,serv);
		break;
		case 8:
				System.out.println("-- Affichages des departements service");
				Depart_service.all_Depart_service();
				System.out.println("-- fin d'affiche");
			break;
		case 9:
			new Employe(Saisie.saisirEntier("taper le numero matricule"),
					Saisie.saisirchaine("Taper le nom"),
					Saisie.saisirchaine("Taper le prenom")
					);
			
			break;
		case 10 :
			System.out.println("-- Affichages des employes deja enregistres--");
			Employe.all_Employe();
			System.out.println("-- Fin de l'affichage--");
			break;
		case 11 :
			Depart_service depart_serv= booldepart_service();
			Employe emp=boolEmpl();
			new Contrat(Saisie.saisirEntier("taper l'id du contrat"),
					emp,
					depart_serv,
					Saisie.saisirEntier("taper la duree du contrat")
					);
			break;
		case 12 :
			System.out.println("-- les contats de l'entreprise--");
			Contrat.all_contrat();
			System.out.println("-- fin de l'affichage--");
			break;
		default:
			System.out.println("Taper svp l'un des choix affiches en haut");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do
		{
			menu();
		}while(true);
	}

}
