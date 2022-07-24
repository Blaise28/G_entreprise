package g_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

	private int idEntreprise;
	private String nom;
	private static List<Entreprise>list_Entreprise=new ArrayList<Entreprise>();
	//private static Entreprise entr=null;
	//constructeurs 
	
	public Entreprise(int idEntreprise,String nom)
	{
		this.idEntreprise=idEntreprise;
		this.nom=nom;
		list_Entreprise.add(this);
		//entr=this;
	}
	public static List<Entreprise>list_Entreprise()
	{
		return list_Entreprise;
	}
	/*
	public static Entreprise ent()
	{
		return entr;
	}
	*/
	public int getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static List<Entreprise> getList_Entreprise() {
		return list_Entreprise;
	}
	public static void setList_Entreprise(List<Entreprise> list_Entreprise) {
		Entreprise.list_Entreprise = list_Entreprise;
	}
	
	/*
	public static void identite()
	{
		System.out.println(entr);
	}*/
	public String toString()
	{
		return " \t Entreprise : \t "+nom;
	}

	public static void all_Entreprise()
	{
		if(list_Entreprise.size()>0)
		{
			for(int i=0;i<list_Entreprise.size();i++)
			{
				System.out.println(i+". \t"+list_Entreprise.get(i).toString());
			}
		}
		else
			System.out.println("pas d'entreprise deja enregistre");
	}	
}
