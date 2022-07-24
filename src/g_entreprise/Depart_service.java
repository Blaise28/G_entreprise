package g_entreprise;

import java.util.ArrayList;
import java.util.List;


public class Depart_service {
	
	private int idDepart_service;
	private Departement Departement;
	private Service Service;
	private static List<Depart_service>list_Depart_service=new ArrayList<Depart_service>();
	
	public static List<Depart_service>list_Depart_service()
	{
		return list_Depart_service;
	}
	
	//constructeur
	
	public Depart_service(int idDepart_service,Departement Depart,Service Service)
	{
		this.idDepart_service=idDepart_service;
		this.Departement=Depart;
		this.Service=Service;
		list_Depart_service.add(this);
	}
	
	
	public int getIdDepart_service() {
		return idDepart_service;
	}

	public void setIdDepart_service(int idDepart_service) {
		this.idDepart_service = idDepart_service;
	}

	public static List<Depart_service> getList_Depart_service() {
		return list_Depart_service;
	}

	public static void setList_Depart_service(List<Depart_service> list_Depart_service) {
		Depart_service.list_Depart_service = list_Depart_service;
	}

	//Affichage d'un objet
	public String toString()
	{
		return "\t Departement et service :"+Departement+","+Service;
	}
	//affiche tout les depart service
	public static void all_Depart_service()
	{
		if(list_Depart_service !=null)
		{
			for(int i=0;i<list_Depart_service.size();i++)
			{
				System.out.println(i+","+list_Depart_service.get(i).toString());
			}
		}
		else
			System.out.println("pas de departement classes deja enregistres");
	}
}
