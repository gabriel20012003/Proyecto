package principal;

public class CocheElectrico {
	//properties
	private int numplazaselec;
	private String tipoelec;
	//getters and setters
	/**
	 * this method have access to the information that the user puts
	 * @return
	 */
	public int getNumplazaselec() {
		if(numplazaselec<=1000) {
			return numplazaselec;
		}
		return numplazaselec;
	}
	/**
	 * this method ask to the user the number of places 
	 * @param numplazaselec
	 */
	public void setNumplazaselec(int numplazaselec) {
		this.numplazaselec = numplazaselec;
	}
	/**
	 * this method return the value of the type
	 * @return numplazaselec
	 */
	public String getTipoelec() {
		return tipoelec;
	}
	/**
	 * this method to the user the type of the combustion car
	 * @param tipocombustion
	 */
	public void setTipocoelec(String tipoelec) {
		this.tipoelec = tipoelec;
	}
	//constructor
	/**
	 * this constructor have a value default, in short, if the user don´t put anything
	 * the program put a value replace the value of the user because of be null
	 */
	public CocheElectrico()
	{
		super();
		this.setNumplazaselec(numplazaselec);
		this.setTipocoelec(tipoelec);
	}
	/**
	 * the constructor copy have ask it the dates of the electric car 
	 * @param numplazaselec
	 * @param tipoelec
	 */
	public CocheElectrico(String numplazaselec, String tipoelec)
	{
		super();
		this.getNumplazaselec();
		this.getTipoelec();
	}
	/**
	 * 
	 * @param electrico
	 * @param numplazasselec
	 * @param tipoelec
	 */
	public CocheElectrico (CocheElectrico electrico) {
		electrico.setNumplazaselec(numplazaselec);
		electrico.setTipocoelec(tipoelec);
	}
	//methods
	
}
