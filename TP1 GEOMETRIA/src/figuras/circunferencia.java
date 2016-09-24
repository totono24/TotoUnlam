package figuras;

public class circunferencia {
	
		protected Double radio;

		public circunferencia(Double radio) {
			this.radio = radio;

		}

		// get set
		public Double getRadio() {
			return radio;
		}

		public void setRadio(Double radio) {
			this.radio = radio;
		}
		
		public Double calcularPerim() {
			Double perim;
			perim = (radio*2*Math.PI);
			return perim;
		}

		public Double calcularArea() {
			Double area;
			area = Math.pow(radio*Math.PI, 2);
			return area;
		}

}

