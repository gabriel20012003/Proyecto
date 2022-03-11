package principal;

import metodos.MetodosGenerales;

public class Oficina extends Empleado{
	private String codigo;
	private String descripcion;
	private String localidad;
	private String provincia;
	//getters and setters
	/**
	 * this method returns the variable codigo
	 * @return
	 */
	public String getCodigo() {
		if(codigo.length()<=200) {
			return codigo;
		}
		return codigo;
	}
	/**
	 * this method can acces to the value of the variable codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * this method returns 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * 
	 * @return
	 */
	public String getLocalidad() {
		
		return localidad;
	}
	/**
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
		}
	/**
	 * 
	 * @return
	 */
	public String getProvincia() {
		MetodosGenerales prov= new MetodosGenerales();
		prov.Provincia();
		return provincia;
	}
	/**
	 * 
	 * @param provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	//constructors
	/**
	 * 
	 */
	public Oficina()
	{
		super();
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
	}
	/**
	 * 
	 * @param codigo
	 * @param descripcion
	 * @param localidad
	 * @param provincia
	 */
	public Oficina(String codigo, String descripcion, String localidad, String provincia)
	{
		super();
		this.getCodigo();
		this.getDescripcion();
		this.getLocalidad();
		this.getProvincia();
	}
	//methods
	
	
}
