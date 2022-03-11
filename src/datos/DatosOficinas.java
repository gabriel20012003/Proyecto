package datos;

import java.util.ArrayList;
import java.util.Scanner;

import metodos.MetodosGenerales;
import principal.Oficina;

public class DatosOficinas {
	ArrayList<Oficina> oficina= new ArrayList<Oficina>();
	Scanner lector= new Scanner(System.in);
	MetodosGenerales as= new MetodosGenerales();
	Oficina a= new Oficina();
	//methods
	String codigo,descripción,localidad,provincia;
	/**
	 * this method ask the user what he like to do with the dates
	 */
	public void Dato() {
		System.out.println("Que desea hacer con el dato");
		System.out.println("1-Añadir");
		System.out.println("2-Eliminar");
		System.out.println("3-Modificar");
		int opc= lector.nextInt();
			if (opc==1) {
				System.out.println("Introduzca el codigo");
				a.setCodigo(codigo);
				System.out.println("Introduzca una pequeña descripción de la oficina");
				a.setDescripcion(descripción);
				as.Provincia();
				a.setLocalidad(localidad);
				a.setProvincia(provincia);
				oficina.add(a);
			}
			if (opc==2) {
				oficina.remove(a);
			}
			if(opc==3) {
				oficina.get(1).setCodigo(codigo);
				oficina.get(1).setDescripcion(descripción);
				oficina.get(1).setLocalidad(localidad);
				oficina.get(1).setProvincia(provincia);			
	}
	

	}
	}
