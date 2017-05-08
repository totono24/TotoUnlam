
public class Cuenta { //esta es la cuenta sueldo
	
			private Double saldo;
			
			public Cuenta(Double saldo)
			{
				this.saldo = saldo;			
			}

			public Cuenta() {
				// TODO Auto-generated constructor stub
			}
			
			//get set

			public Double getSaldo() {
				return saldo;
			}

			public void setSaldo(Double saldo) {
				this.saldo = saldo;
			}
			
			//metodos
			
			public void extraer(Double extraccion) {
				
				if(extraccion <= saldo)
			   {
					saldo = saldo - extraccion;
				}
				
			}
			
			public void depositar(Double importe) {
				
				saldo = importe;
				
			}
	}

