public class CajaAhorro  extends Cuenta {
	
		private Integer extracciones = 0;
		private Double costoExtra = 0d;
		private Integer extraccionesSinExtra = 0;

		public CajaAhorro () {
			
			super();
			
		}

		public Integer getExtracciones() {
			return extracciones;
		}

		public void setExtracciones(Integer extracciones) {
			this.extracciones = extracciones;
		}

		public Integer getExtraccionesSinExtra() {
			return extraccionesSinExtra;
		}

		public void setExtraccionesSinExtra(Integer extraccionesSinExtra) {
			this.extraccionesSinExtra = extraccionesSinExtra;
		}	
		
		public Double getCostoExtra() {
			return costoExtra;
		}

		public void setCostoExtra(Double costoExtra) {
			this.costoExtra = costoExtra;
		}
		
		
		//metodos
		
		@Override
		public void extraer (Double extraccion) 
		{
			
			if (extraccion <= super.getSaldo())
		{
					
				if (extracciones < this.getExtraccionesSinExtra()) //cantidad de extracciones maximas
				{
					super.extraer(extraccion);	
					extracciones++;
				}
					
			else
					if (extracciones >= this.getExtraccionesSinExtra())
					{
						super.setSaldo(super.getSaldo() - extraccion - this.getCostoExtra()); //costo extra
					}
		}
		}
}