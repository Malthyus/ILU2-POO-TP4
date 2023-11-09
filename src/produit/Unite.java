package produit;

public enum Unite {
	LITRE("litre"), GRAMME("gramme"), KILOGRAMME("kilogramme"), CENTILITRE("centilitre"), MILLILITRE("mililitre"),
	PIECE("pièce");

	private String nom;

	private Unite(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}