package principal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Persona extends Vehículo implements Serializable{
	/**
	 * serialization of objects. In one hand you create the documente
	 * and then the document read the objects
	 */
	{
	try {
		FileOutputStream f= new FileOutputStream("Persona.ser");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	try {
		ObjectOutputStream o;
	}
	catch (Exception g)
	{
		g.getStackTrace();
	}
}

	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare1(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare2(Cliente p1, Cliente p2) {
		// TODO Auto-generated method stub
		return 0;
	}

}


