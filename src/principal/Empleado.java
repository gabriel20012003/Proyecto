package principal;

import java.util.GregorianCalendar;

import metodos.MetodosGenerales;

public class Empleado extends Persona {
	GregorianCalendar a= new GregorianCalendar();
	//properties
	private String DNIEmpleado;
	private String NombreEmpleado;
	private String Apellido1Empleado;
	private String Apellido2Empleado;
	private GregorianCalendar fechaaltaempleado;
	private String oficina;
	//getters and setters 
	/**
	 * 
	 * @return
	 */
	public String getDNIEmpleado() {
		MetodosGenerales b= new MetodosGenerales();
		if(b.validar1()) {
			return DNIEmpleado;
		}
		return DNIEmpleado;
	}
	/**
	 * 
	 * @param dNIEmpleado
	 */
	public void setDNIEmpleado(String dNIEmpleado) {
		DNIEmpleado = dNIEmpleado;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombreEmpleado() {
		if (NombreEmpleado.length()<=20) {
			return NombreEmpleado;
		}
		return NombreEmpleado;
	}
	/**
	 * 
	 * @param nombreEmpleado
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		NombreEmpleado = nombreEmpleado;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellido1Empleado() {
		
		if (Apellido1Empleado.length()<=30) {
			return Apellido1Empleado;
		}
		return Apellido1Empleado;
	}
	/**
	 * 
	 * @param apellido1Empleado
	 */
	public void setApellido1Empleado(String apellido1Empleado) {
		Apellido1Empleado = apellido1Empleado;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellido2Empleado() {
		if (Apellido2Empleado.length()<=30) {
			return Apellido2Empleado;
		}
		return Apellido2Empleado;
	}
	/**
	 * 
	 * @param apellido2Empleado
	 */
	public void setApellido2Empleado(String apellido2Empleado) {
		Apellido2Empleado = apellido2Empleado;
	}
	/**
	 * 
	 * @return
	 */
	public GregorianCalendar getFechaaltaempleado() {
		a.add(20, 2);
		return fechaaltaempleado;
	}
	/**
	 * 
	 * @param fechaaltaempleado
	 */
	public void setFechaaltaempleado(GregorianCalendar fechaaltaempleado) {
		this.fechaaltaempleado = fechaaltaempleado;
	}
	/**
	 * 
	 * @return
	 */
	public String getOficina() {
		return oficina;
	}
	/**
	 * 
	 * @param oficina
	 */
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	//constructors
	/**
	 * 
	 */
	public Empleado()
	{
		super();
		this.setNombreEmpleado(NombreEmpleado);
		this.setApellido1Empleado(Apellido1Empleado);
		this.setApellido2Empleado(Apellido2Empleado);
		this.setDNIEmpleado(DNIEmpleado);
		this.setFechaaltaempleado(fechaaltaempleado);
		this.setOficina(oficina);
	}
	/**
	 * 
	 * @param NombreEmpleado
	 * @param Apellido1
	 * @param Apellido2Empleado
	 * @param DNIEmpleado
	 * @param Fechaaltaempleado
	 * @param Oficina
	 */
	public Empleado(String NombreEmpleado, String Apellido1, String Apellido2Empleado, String DNIEmpleado, String Fechaaltaempleado, String Oficina)
	{
		super();
		this.getNombreEmpleado();
		this.getApellido1Empleado();
		this.getApellido2Empleado();
		this.getDNIEmpleado();
		this.getFechaaltaempleado();
		this.getOficina();
	}
	/**
	 * 
	 * @param emple
	 * @param nombreempleado
	 * @param apellido1empleado
	 * @param apellido2empleado
	 * @param dniempleado
	 * @param fechaaltaempleado
	 * @param oficina
	 */
	public Empleado (Empleado emple) {
		emple.setNombreEmpleado(NombreEmpleado);
		emple.setApellido1Empleado(Apellido1Empleado);
		emple.setApellido2Empleado(Apellido2Empleado);
		emple.setDNIEmpleado(DNIEmpleado);
		emple.setFechaalta(fechaaltaempleado);
		emple.setOficina(oficina);
	}
	
}
