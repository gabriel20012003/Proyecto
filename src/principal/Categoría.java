package principal;

public class Categor�a extends Veh�culo{
	//properties
	private int codigovehiculo;
	private String descripcionvehiculo;
	private double porcentajerecargo;
	//getters and setters
	/**
	 * 
	 * @return
	 */
	public int getCodigovehiculo() {
		return codigovehiculo;
	}
	/**
	 * 
	 * @param codigovehiculo
	 */
	public void setCodigovehiculo(int codigovehiculo) {
		this.codigovehiculo = codigovehiculo;
	}
	/**
	 * 
	 * @return
	 */
	public String getDescripcionvehiculo() {
		return descripcionvehiculo;
	}
	/**
	 * 
	 * @param descripcionvehiculo
	 */
	public void setDescripcionvehiculo(String descripcionvehiculo) {
		this.descripcionvehiculo = descripcionvehiculo;
	}
	/**
	 * 
	 * @return
	 */
	public double getPorcentajerecargo() {
		return porcentajerecargo;
	}
	/**
	 * 
	 * @param porcentajerecargo
	 */
	public void setPorcentajerecargo(double porcentajerecargo) {
		this.porcentajerecargo = porcentajerecargo;
	}
	//constructors
	/**
	 * this constructor ask an information of the category of the vehicle
	 */
	public Categor�a()
	{
		super();
		this.setCodigovehiculo(codigovehiculo);
		this.setDescripcionvehiculo(descripcionvehiculo);
		this.setPorcentajerecargo(porcentajerecargo);
	}
	/**
	 * then, this constructor access to the information that the user writes
	 * @param codigoveh�culo
	 * @param descripcionvehiculo
	 * @param porcentajerecargo
	 */
	public Categor�a(int codigoveh�culo, String descripcionvehiculo, double porcentajerecargo)
	{
		this.getCodigovehiculo();
		this.getDescripcionvehiculo();
		this.getPorcentajerecargo();
	}
	/**
	 * 
	 * @param categoria
	 * @param codigovehiculo
	 * @param descripcion vehiculo
	 * @param porcentaje de recargo
	 */
	public Categor�a (Categor�a categoria) {
		this.setCodigovehiculo(codigovehiculo);
		this.setDescripcionvehiculo(descripcionvehiculo);
		this.setPorcentajerecargo(porcentajerecargo);
	}
	
}
