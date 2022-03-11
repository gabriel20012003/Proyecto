package datos;

import java.util.ArrayList;
import java.util.Scanner;

import principal.Empleado;

public class DatosEmpleados {
	Scanner lector= new Scanner (System.in);
	ArrayList<Empleado> emp= new ArrayList <Empleado>();
	Empleado a= new Empleado();
	public void datoEmpleado(){
		System.out.println("Que desea hacer con el empleado");
		System.out.println("1-Añadir");
		System.out.println("2-Borrar");
		System.out.println("3-Modificar");
		int opcs= lector.nextInt();
		if (opcs==1) {
			System.out.println("Introduzca el DNI del empleado");
			a.setDNIEmpleado(null);
			System.out.println("Introduzca el nombre del empleado");
			a.setNombreEmpleado(null);
			System.out.println("Introduzca el primer apellido del empleado");
			a.setApellido1Empleado(null);
			System.out.println("Introduzca el segundo apellido del empleado");
			a.setApellido2Empleado(null);
			System.out.println("Introduzca la fecha en el que el empleado se dio de alta");
			a.setFechaaltaempleado(null);
			System.out.println("Introduzca el nombre de la oficina");
			a.setOficina(null);
			emp.add(a);
		}else if (opcs==2) {
			emp.remove(a);
		}else if (opcs==3) {
			emp.set(1, a).getDNIEmpleado();
			emp.set(1, a).getNombreEmpleado();
			emp.set(1, a).getApellido1Empleado();
			emp.set(1, a).getApellido2Empleado();
			emp.set(1,a).getFechaalta();
			emp.set(1, a).getOficina();
		}
	}

}
