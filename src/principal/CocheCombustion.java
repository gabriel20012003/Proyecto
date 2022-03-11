package principal;

import java.util.Enumeration;

public class CocheCombustion extends VehiculoCombustion{
	//properties
	private int numplazascombustion;
	private String tipocombustion;
	//getters and setters
	/**
	 * this method 
	 * @return
	 */
	public int getNumplazascombustion() {
		if (numplazascombustion<=20) {
			return numplazascombustion;
		}
		return numplazascombustion;
	}
	/**
	 * this method access to the dates of the variable numplazascombustion
	 * @param numplazas
	 */
	public void setNumplazascombustion(int numplazas) {
		this.numplazascombustion = numplazas;
	}
	/**
	 * this method returns the value of this variable
	 * @return
	 */
	public String getTipocombustion() {
		if(tipocombustion.length()<=20) {
			return tipocombustion;
		}
		return tipocombustion;
	}
	/**
	 * this method access to the information of the variable
	 * @param tipo
	 */
	public void setTipocombustion(String tipo) {
		this.tipocombustion = tipo;
	}
	//constructors 
	/**
	 * this constructor read the information default
	 */
	public CocheCombustion()
	{
		super();
		this.setNumplazascombustion(numplazascombustion);
		this.setTipocombustion(tipocombustion);
	}
	/**
	 * this constructor read the information that the user puts
	 * @param numplazascombustion
	 * @param tipocombustion
	 */
	public CocheCombustion(String numplazascombustion, String tipocombustion)
	{
		super();
		this.getNumplazascombustion();
		this.getTipocombustion();
	}
	public CocheCombustion(CocheCombustion cochecombustion) {
		cochecombustion.setNumplazascombustion(numplazascombustion);
		cochecombustion.setTipocombustion(tipocombustion);
	}
	//methods
	
}
