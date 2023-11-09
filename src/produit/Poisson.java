package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("possion", Unite.PIECE);
		this.date = date;
	}

	@Override
	public String description() {
		return super.getNom() + " pêchés " + date;
	}
}
