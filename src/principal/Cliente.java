package principal;

import metodos.MetodosGenerales;

public class Cliente extends Persona{
	
	MetodosGenerales a= new MetodosGenerales();
	//properties
	private String DNI;
	private String Nombre;
	private String apellido1;
	private String apellido2;
	private String Tipocarnet;
	private String numtarjetacliente;
	/**
	 * 
	 * @return DNI 
	 * this method return the value of the DNI 
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * this method acces to the variable DNI
	 * @param dNI
	 */
	public void setDNI(String dNI) {
		if(a.validar1()) {
			dNI= dNI;
		}
	}
	/**
	 * This method return the variable Nombre 
	 * @return
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * this method access to the dates of the variable Nombre
	 * @param nombre
	 * @return 
	 */
	public String setNombre(String nombre) {
		if (nombre.length()<=20) {
			return nombre;
		}
		return Nombre = nombre;
	}
	/**
	 * this method returns the value of the variable apellido1
	 * @return apellido1
	 */
	public String getApellido1() {
		if (apellido1.length()<=20)
		{
			return apellido1;
		}
		return apellido1;
	}
	/**
	 * this method access to the information
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * this method returns the variable apellido2
	 * @return apellido2
	 */
	public String getApellido2() {
		if (apellido2.length()<=20) {
			return apellido2;
		}
		return apellido2;
	}
	/**
	 * this method access to the variable apellido2
	 * @param apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * this method returns the variable Tipocarnet
	 * @return
	 */
	public String getTipocarnet() {
		return Tipocarnet;
	}
	/**
	 * this method acces to the information of the user put it
	 * @param tipocarnet
	 */
	public void setTipocarnet(String tipocarnet) {
		Tipocarnet = tipocarnet;
	}
	/**
	 * this method returns the type of the target
	 * @return
	 */
	public String getNumtarjetacliente() {
		return numtarjetacliente;
	}
	/**
	 * This method put a value default because the user don´t write anything
	 * @param 
	 */
	public void setNumtarjetacliente() {
		this.numtarjetacliente = "No existe";
	}
	//constructor 
	/**
	 * this is a default constructor because is the value that put the program 
	 * if you don´t write anything
	 */
	public Cliente()
	{
		super();
		this.setNombre("Javier");
		this.setApellido1("García");
		this.setApellido2("Rodriguez");
		this.setDNI("77388133X");
		this.setTipocarnet("Socio");
		this.setNumtarjetacliente();
	}
	/**
	 * This is the constructor that read the information that the user puts
	 * @param nombre
	 * @param Apellido1
	 * @param Apellido2
	 * @param DNI
	 * @param TipoCarnet
	 * @param Numtarjetacliente
	 */
	public Cliente(String nombre, String Apellido1, String Apellido2, String DNI, String TipoCarnet, String Numtarjetacliente)
	{
		super ();
		this.getNombre();
		this.getApellido1();
		this.getApellido2();
		this.getDNI();
		this.getNumtarjetacliente();
		this.getTipocarnet();
	}
	/**
	 * 
	 * @param cliente
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param DNI
	 * @param Tipocarnet
	 */
	public Cliente (Cliente cliente) {
		cliente.setNombre(Nombre);
		cliente.setApellido1(apellido1);
		cliente.setApellido2(apellido2);
		cliente.setDNI(DNI);
		cliente.setNumtarjetacliente();
		cliente.setTipocarnet(Tipocarnet);
	}
	
	
	
}
