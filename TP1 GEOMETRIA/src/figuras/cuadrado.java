package figuras;

public class cuadrado {
	

	private Double l;	
	
	
	public void Cuadrado(Double l){
		this.l=l;
	}
	
	
	public Double getLado() {
		return l;
	}

	public void setLado(Double l) {
		this.l = l;
	}
	
	public Double calcularPerim (){
		Double perim;
		perim= l *4;
		return perim;
	}
	
	public Double calcularArea (){
		Double area;
		area= l*l;
		return area;
	}
}

