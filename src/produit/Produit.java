package produit;

public class Produit {

	private String nom;
	private Unite unit�;

	protected Produit(String nom, Unite unit�) {
		super();
		this.nom = nom;
		this.unit� = unit�;
	}

	public String getNom() {
		return nom;
	}

	public String description() {
		return nom;
	}
}
