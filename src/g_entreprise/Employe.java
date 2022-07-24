package g_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Employe {

	private int matricule;
	private String nom,prenom;
	private static List<Employe>list_empl=new ArrayList<Employe>();
	
	public static List<Employe> list_empl()
	{
		return list_empl;
	}
	//constructeurs
	public Employe(int matr,String nom,String prenom)
	{
		matricule=matr;
		this.nom=nom;
		this.prenom=prenom;
		list_empl.add(this);
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public static List<Employe> getList_empl() {
		return list_empl;
	}
	public static void setList_empl(List<Employe> list_empl) {
		Employe.list_empl = list_empl;
	}
	// affichage d'un objet
	public String toString()
	{
		return " `\t employe :"+matricule+","+nom+","+prenom;
	}
	//affiche de tout les objets
	public static void all_Employe()
	{
		if(list_empl !=null)
		{
			for(int i=0;i<list_empl.size();i++)
			{
				System.out.println(i+",\t "+list_empl.get(i).toString());
			}
		}
		else
			System.out.println("pas d'employe deja enregistre");
	}
}
