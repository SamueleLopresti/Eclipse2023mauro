package model;

public class Serie {
	private int id;
	private String titolo;
	private String immagine;
	private String genere;
	private double rating;
	private boolean visto;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getImmagine() {
		return immagine;
	}
	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", immagine=");
		builder.append(immagine);
		builder.append(", genere=");
		builder.append(genere);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", visto=");
		builder.append(visto);
		builder.append("]");
		return builder.toString();
	}
	
	

}
