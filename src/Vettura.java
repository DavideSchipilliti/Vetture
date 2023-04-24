//classe vettura con attributi costruttore e getter e setter, possibile modifica= si potrebbe far passare la marca tramite costruttore.

public class Vettura {
	private String targa;
	private String proprietario;
	private Marca marca;
	
	public Vettura(String targa, String proprietario) {
		this.targa=targa;
		this.proprietario=proprietario;
		this.marca=Marca.getRandom();
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
