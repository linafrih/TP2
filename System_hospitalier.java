package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// La méthode prends en paramètres la requete,enregistre le nom du patient et les différents symptômes,puis elle retourne un message vers le patient que la requête est acceptée et elle est entrain d'être étudiée
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// La méthode compare les symptômes du patient avec la base de données de l'hopital et retourne un message au patient indiquant s'il a trouvé des similarités
		return "Cluster trouvé";
	}

}

