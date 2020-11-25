package stratégie;

public class Produit implements Comparable<Produit> {
	String nom;
	int prix;
	
	Produit(String nom, int prix){
		this.nom= nom;
		this.prix= prix;
	
		
	}
	
	


	@Override
	public int compareTo(Produit produit) {
		return (this.nom+this.prix).compareTo((produit.nom+produit.prix));
	}
}

