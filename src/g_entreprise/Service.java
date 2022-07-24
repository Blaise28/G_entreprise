package g_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Service {

	private int idService;
	private String nom;
	private static List<Service>list_serv=new ArrayList <Service>();
	
	public static List<Service>list_serv()
	{
		return list_serv;
	}
	
	//constructeurs
	public Service (int idService,String nom)
	{
		this.idService=idService;
		this.nom=nom;
		list_serv.add(this);
	}

	public int getIdErvice() {
		return idService;
	}

	public void setIdErvice(int idErvice) {
		this.idService = idErvice;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static List<Service> getList_serv() {
		return list_serv;
	}

	public static void setList_serv(List<Service> list_serv) {
		Service.list_serv = list_serv;
	}
	//pour affiche un objet la methode toString
	
	public String toString()
	{
		return " \t Service :"+nom;
	}
	//Affichage de tous les elements du tableau
	public static void all_Services()
	{
		if(list_serv!=null)
		{
			for(int i=0;i<list_serv.size();i++)
			{
				System.out.println(i+".\t"+list_serv.get(i).toString());
			}
		}
		else
			System.out.println("pas de service pour le moment");
	}
}
