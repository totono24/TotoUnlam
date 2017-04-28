
public class Disco {
	
	private Double radioOut;
	private Double radioIn;
	
	// get set //
	
	public Double getRadioOut() {
		return radioOut;
	}
	public void setRadioOut(Double radioOut) {
		this.radioOut = radioOut;
	}
	public Double getRadioIn() {
		return radioIn;
	}
	public void setRadioIn(Double radioIn) {
		this.radioIn = radioIn;
	}
	
	// metodos //
	
	public Double calcularPerimOut()
	{
		Double perimOut;
		perimOut = 2 * Math.PI * radioOut;
		return perimOut;
	}
	
	public Double calcularPerimIn()
	{
		Double perimIn;
		perimIn = 2 * Math.PI * radioIn;
		return perimIn;
	}
	
	public Double calcularArea()
	{
		Double area;
		area = Math.PI * (radioOut * radioIn);
		return area;
	}

}
