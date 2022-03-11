package principal;

public abstract class VehiculoCombustion extends Vehículo {
	//properties
	private String consumocombustion;
	private String Potenciacombustion;
	private String nivelemisioncombustion;
	//getters and setters
	/**
	 * 
	 * @return
	 */
	public String getConsumocombustion() {
		return consumocombustion;
	}
	/**
	 * 
	 * @param consumocombustion
	 */
	public void setConsumocombustion(String consumocombustion) {
		this.consumocombustion = consumocombustion;
	}
	/**
	 * 
	 * @return
	 */
	public String getPotenciacombustion() {
		return Potenciacombustion;
	}
	/**
	 * 
	 * @param potenciacombustion
	 */
	public void setPotenciacombustion(String potenciacombustion) {
		Potenciacombustion = potenciacombustion;
	}
	/**
	 * 
	 * @return
	 */
	public String getNivelemisioncombustion() {
		return nivelemisioncombustion;
	}
	/**
	 * 
	 * @param nivelemisioncombustion
	 */
	public void setNivelemisioncombustion(String nivelemisioncombustion) {
		this.nivelemisioncombustion = nivelemisioncombustion;
	}
	//constructor 
	/**
	 * 
	 */
	public VehiculoCombustion()
	{
		super();
		this.setConsumocombustion(consumocombustion);
		this.setNivelemisioncombustion(nivelemisioncombustion);
		this.setPotenciacombustion(Potenciacombustion);
	}
	/**
	 * 
	 * @param ConsumoCombustion
	 * @param Nivelemisioncombustion
	 * @param Potenciacombustion
	 */
	public VehiculoCombustion(String ConsumoCombustion, String Nivelemisioncombustion, String Potenciacombustion)
	{
		this.getConsumocombustion();
		this.getNivelemisioncombustion();
		this.getPotenciacombustion();
	}
	
	
	
}
