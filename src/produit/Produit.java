package produit;

public class Produit {

	private String nom;
	private Unite unité;

	protected Produit(String nom, Unite unité) {
		super();
		this.nom = nom;
		this.unité = unité;
	}

	public String getNom() {
		return nom;
	}

	public String description() {
		return nom;
	}
}
