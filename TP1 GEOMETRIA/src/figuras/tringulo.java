package figuras;

public class tringulo {
	

		private Double l1, l2, l3, b, h;


		public Double getL1() {
			return l1;
		}

		public void setL1(Double l1) {
			this.l1 = l1;
		}

		public Double getL2() {
			return l2;
		}

		public void setL2(Double l2) {
			this.l2 = l2;
		}

		public Double getL3() {
			return l3;
		}

		public void setL3(Double l3) {
			this.l3 = l3;
		}

		public Double getB() {
			return b;
		}

		public void setB(Double b) {
			this.b = b;
		}

		public Double getH() {
			return h;
		}

		public void setH(Double h) {
			this.h = h;
		}

		public void triangulo(Double l1, Double l2, Double l3) {
			this.l1 = l1;
			this.l2 = l2;
			this.l3 = l3;
		}

		public void triangulo(Double b, Double h) {
			this.b = b;
			this.h = h;

		}


		public Double calcularPerim() {
			Double perim;
			perim = l1 + l2 + l3;
			return perim;
		}

		public Double calcularArea() {
			Double area;
			area = (b * h) / 2;
			return area;
		}

	

}
