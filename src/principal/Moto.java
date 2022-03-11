package principal;

public class Moto extends VehículoEléctrico{
	//properties
	private String cilindrada;
	private String carnetrequeridomoto;
	//getters and setters
	/**
	 * 
	 * @return
	 */
	public String getCilindrada() {
		return cilindrada;
	}
	/**
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**
	 * 
	 * @return
	 */
	public String getCarnetrequeridomoto() {
		return carnetrequeridomoto;
	}
	/**
	 * 
	 * @param carnetrequeridomoto
	 */
	public void setCarnetrequeridomoto(String carnetrequeridomoto) {
		this.carnetrequeridomoto = carnetrequeridomoto;
	}
	//constructors 
	public Moto()
	{
		super();
		this.setCarnetrequeridomoto(carnetrequeridomoto);
		this.setCilindrada(cilindrada);
	}
	/**
	 * 
	 * @param carnetrequerido
	 * @param cilindrada
	 */
	public Moto(String carnetrequerido, String cilindrada)
	{
		super();
		this.getCarnetrequeridomoto();
		this.getCilindrada();
	}
	/**
	 * 
	 * @param moto
	 */
	public Moto (Moto moto) {
		super();
		moto.setCarnetrequeridomoto(carnetrequeridomoto);
		moto.setCilindrada(cilindrada);
	}
	//methods
	
	
}
