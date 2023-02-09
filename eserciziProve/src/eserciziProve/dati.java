package eserciziProve;

public abstract class dati implements RemoteControl {
	private int F;
	private boolean g;
	private int volume; 
	private String colore;
	
	
	
	

	public dati(int f, boolean g, int volume, String colore) {
		super();
		F = f;
		this.g = g;
		this.volume = volume;
		this.colore = colore;
	}
	
	public int getF() {
		return F;
	}
	public void setF(int f) {
		F = f;
	}
	public boolean isG() {
		return g;
	}
	public void setG(boolean g) {
		this.g = g;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}


	

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	
	
	
	
	
	
	

}
