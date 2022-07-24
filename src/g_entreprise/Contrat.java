package g_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Contrat {

	private int idContrat;
	private Employe employe;
	private Depart_service depart_serv;
	private int  duree;
	
	private static List<Contrat>list_contrat=new ArrayList<Contrat>();
	
	public static List<Contrat>list_contrat()
	{
		return list_contrat;
	}
	// constructeur
	
	public Contrat(int idcontrat,Employe employ,Depart_service DS,int duree)
	{
		this.idContrat=idcontrat;
		employe=employ;
		depart_serv=DS;
		this.duree=duree;
		list_contrat.add(this);
	}

	public int getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public String toString()
	{
		return "\t contrat :"+this.employe+",\t"+this.depart_serv+",\t"+this.duree;
	}
	public static void all_contrat()
	{
		if(list_contrat !=null)
		{
			for(int i=0;i<list_contrat.size();i++)
				System.out.println(i+".\t"+list_contrat.get(i).toString());
		}
		else
			System.out.println("pas de contrat deja enregistre");
	}
}
