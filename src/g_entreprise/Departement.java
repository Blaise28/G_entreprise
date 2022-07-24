package g_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Departement {

	private int idDepartement;
	private String nom;
	private Entreprise idEntreprise;
	private static List<Departement> list_depart=new ArrayList<Departement>();
	
	public static List<Departement> list_depart() {
		return list_depart;
	}
	
	//constructeurs
	public Departement(int idDepart,String nom,Entreprise idEntr)
	{
		idDepartement=idDepart;
		this.nom=nom;
		idEntreprise=idEntr;
		list_depart.add(this);
	}

	public int getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Entreprise getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Entreprise idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public List<Departement> getList_depart() {
		return list_depart;
	}

	public void setList_depart(List<Departement> list_depart) {
		Departement.list_depart = list_depart;
	}
	public String toString()
	{
		return "\t Departement :"+nom+","+idEntreprise;
	}
	public static void all_Departements()
	{
		if(list_depart!=null)
		{
			for(int i=0;i<list_depart.size();i++)
			{
				System.out.println(i+".\t"+list_depart.get(i).toString());
			}
		}
		else
			System.out.println("pas de departement enregistre");
		
	}
}
