package datos;

import java.util.ArrayList;
import java.util.Scanner;

import metodos.MetodosGenerales;
import principal.Veh�culo;

public class DatosVeh�culos {
	ArrayList<Veh�culo> vehiculo= new ArrayList <Veh�culo>();
	Scanner lector= new Scanner (System.in);
	Veh�culo v= new Veh�culo();
	/**
	 * this method can do all changes of the  dates of the vehicles
	 */
	public void datosvehiculo() {
		System.out.println("Que desea hacer");
		System.out.println("1-A�adir");
		System.out.println("2-Borrar");
		System.out.println("3-Modificar");
		int opc= lector.nextInt();
		if (opc==1) {
			System.out.println("Introduzca la matr�cula");
			v.setMatr�cula(null);
			System.out.println("Introduzca la marca");
			v.setMarca(null);
			System.out.println("Introduzca su modelo");
			v.setModelo(null);
			System.out.println("Introduzca su color");
			v.setColor(null);
			System.out.println("Introduzca la fecha de alta");
			v.setFechaalta(null);
			System.out.println("Introduzca los kilometros recorridos");
			v.setKmsrecorridos(200);
			MetodosGenerales a= new MetodosGenerales();
			a.Provincia();
			v.setUbicacion(null);
			vehiculo.add(v);
		}else if (opc==2) {
			vehiculo.remove(v);
		}else if (opc==3) {
			vehiculo.get(1).getMatr�cula();
			vehiculo.get(1).getMarca();
			vehiculo.get(1).getModelo();
			vehiculo.get(1).getColor();
			vehiculo.get(1).getFechaalta();
			vehiculo.get(1).getKmsrecorridos();
			vehiculo.get(1).getUbicacion();
		}
	}
}
