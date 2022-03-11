package metodos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodosGenerales {

	public boolean validar1() {
		// TODO Auto-generated method stub
		String dniIntroducido = null;
        Scanner miScanner = new Scanner(System.in);
        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        System.out.print("Introduce un DNI correcto: ");
        dniIntroducido = miScanner.nextLine();
        Matcher mat = patron.matcher(dniIntroducido);
        while(!mat.matches()){
           System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
           System.out.print("Introduce un DNI correcto: ");
           dniIntroducido = miScanner.nextLine();
           mat = patron.matcher(dniIntroducido);
        }
        System.out.println("El DNI " + dniIntroducido + " es válido.");
		return true;
    }
	public void Provincia()
	{
		Scanner lector= new Scanner (System.in);
		System.out.println("¿A que provincia perteneces?");	
		System.out.println("1-Álava");
		System.out.println("2-Albacete");
		System.out.println("3-Alicante");
		System.out.println("4-Almería");
		System.out.println("5-Asturias");
		System.out.println("6-Ávila");
		System.out.println("7-Badajoz");
		System.out.println("8-Barcelona");
		System.out.println("9-Burgos");
		System.out.println("10-Cáceres");
		System.out.println("11-Cádiz");
		System.out.println("12-Cantabria");
		System.out.println("13-Castellón");
		System.out.println("14-Ciudad Real");
		System.out.println("15-Córdoba");
		System.out.println("16-Cuenca");
		System.out.println("17-Gerona");
		System.out.println("18-Granada");
		System.out.println("19-Guadalajara");
		System.out.println("20-Gipuzkoa");
		System.out.println("21-Huelva");
		System.out.println("22-Huesca");
		System.out.println("23-Islas Baleares");
		System.out.println("24-Jaén");
		System.out.println("25-La Coruña");
		System.out.println("26-La Rioja");
		System.out.println("27-Las Palmas");
		System.out.println("28-La Rioja");
		System.out.println("29-Las Palmas");
		System.out.println("30-León");
		System.out.println("31-Lérida");
		System.out.println("32-Lugo");
		System.out.println("33-Madrid");
		System.out.println("34-Málaga");
		System.out.println("35-Murcia");
		System.out.println("36-Navarra");
		System.out.println("37-Orense");
		System.out.println("38-Palencia");
		System.out.println("39-Pontevedra");
		System.out.println("40-Salamanca");
		System.out.println("41-Santa Cruz de Tenerife");
		System.out.println("42-Segovia");
		System.out.println("43-Sevilla");
		System.out.println("44-Soria");
		System.out.println("45-Tarragona");
		System.out.println("46-Teruel");
		System.out.println("47-Toledo");
		System.out.println("48-Valencia");
		System.out.println("49-Valladolid");
		System.out.println("50-Vizcaya");
		System.out.println("51-Zamora");
		System.out.println("52-Zaragoza");
		int numelegido;
		numelegido= lector.nextInt();
		lector.nextLine();
	}
		
		
	}

