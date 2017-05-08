
public class CuentaCorriente extends Cuenta {
		
	private Double comision;
	private Double sobregiro;
	private Double totalConSobregiro = 0d;
	
	public CuentaCorriente (Double comision, Double sobregiro)
	{
		super();
		this.comision = comision;
		this.sobregiro = sobregiro;
	}
	

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Double getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(Double sobregiro) {
		this.sobregiro = sobregiro;
	}
	
	public Double getTotalConSobregiro() {
		return totalConSobregiro;
	}

	public void setTotalConSobregiro(Double totalConSobregiro) {
		this.totalConSobregiro = totalConSobregiro;
	}

	
	@Override
	public void extraer (Double extraccion) 
	{
		if (extraccion>super.getSaldo())
		{
			this.setTotalConSobregiro(super.getSaldo() + this.sobregiro);

			super.setSaldo(this.getTotalConSobregiro() - extraccion);
			this.setSobregiro((super.getSaldo() - this.sobregiro) * this.getComision());  
			super.setSaldo(this.getSobregiro()); 
		}
		else
		{
				super.extraer(extraccion);  
		}
	}
		
			
}