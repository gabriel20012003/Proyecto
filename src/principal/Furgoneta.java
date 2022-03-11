package principal;

public class Furgoneta extends Vehículo {
	//properties
	private String capacidadcarga;
	private String carnetrequerido;
	//getters and setters
	/**
	 * 
	 * @return
	 */
	public String getCapacidadcarga() {
		if (capacidadcarga.length()<=100) {
			return capacidadcarga;
		}
		return capacidadcarga;
	}
	/**
	 * 
	 * @param capacidadcarga
	 */
	public void setCapacidadcarga(String capacidadcarga) {
		this.capacidadcarga = capacidadcarga;
	}
	/**
	 * 
	 * @return
	 */
	public String getCarnetrequerido() {
		return carnetrequerido;
	}
	/**
	 * 
	 * @param carnetrequerido
	 */
	public void setCarnetrequerido(String carnetrequerido) {
		this.carnetrequerido = carnetrequerido;
	}
	//constructors
	/**
	 * 
	 */
	public Furgoneta()
	{
		super();
		this.setCapacidadcarga(capacidadcarga);
		this.setCarnetrequerido(carnetrequerido);
	}
	/**
	 * 
	 * @param capacidadcarga
	 * @param carnetrequerido
	 */
	public Furgoneta(String capacidadcarga, String carnetrequerido)
	{
		super();
		this.getCapacidadcarga();
		this.getCarnetrequerido();
	}
	/**
	 * 
	 * @param furg
	 * @param capacidadcarga
	 * @param carnetrequerido
	 */
	public Furgoneta (Furgoneta furg) {
		furg.setCapacidadcarga(capacidadcarga);
		furg.setCarnetrequerido(carnetrequerido);
	}
	//methods
	
	
	
}
