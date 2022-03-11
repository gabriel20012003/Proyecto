package comparadores;

import principal.Cliente;
import principal.Persona;

public class ComparaPersonas {
	Cliente o1= new Cliente();
	Cliente o2= new Cliente();
	/**
	 * this method compare a values of an ArrayList and says the biggest value
	 */
	public int compare1(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return o1.getDNI().compareToIgnoreCase(o2.getDNI());
	}
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * this method returns the names order by the letter
	 */
	public int compare2 (Cliente p1, Cliente p2) {
		return p1.getNombre().compareToIgnoreCase(p2.getNombre());
	}
	/**
	 * this method returns the values of the variable numtarjetacliente orders by the numbers
	 */
	public int compare (Cliente q1, Cliente q2) {
		return q1.getNumtarjetacliente().compareToIgnoreCase(q2.getNumtarjetacliente());
	}
	

	
}



