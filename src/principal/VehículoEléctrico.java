package principal;

public abstract class VehículoEléctrico extends Vehículo {
	//properties
	private String consumo;
	private String potencia;
	private String Nivelemisiones;
	//getters and setters 
	/**
	 * 
	 * @return
	 */
	public String getConsumo() {
		return consumo;
	}
	/**
	 * 
	 * @param consumo
	 */
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	/**
	 * 
	 * @return
	 */
	public String getPotencia() {
		return potencia;
	}
	/**
	 * 
	 * @param potencia
	 */
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	/**
	 * 
	 * @return
	 */
	public String getNivelemisiones() {
		return Nivelemisiones;
	}
	/**
	 * 
	 * @param nivelemisiones
	 */
	public void setNivelemisiones(String nivelemisiones) {
		Nivelemisiones = nivelemisiones;
	}
	//constructors
	/**
	 * 
	 */
	public VehículoEléctrico()
	{
		super();
		this.setConsumo(consumo);
		this.setNivelemisiones(Nivelemisiones);
		this.setPotencia(potencia);
	}
	/**
	 * 
	 * @param Consumo
	 * @param Niveleemisiones
	 * @param Potencia
	 */
	public VehículoEléctrico(String Consumo, String Niveleemisiones, String Potencia)
	{
		super();
		this.getConsumo();
		this.getNivelemisiones();
		this.getPotencia();
	}
	//methods
	
	
}
