import static org.junit.Assert.*;

import org.junit.Test;

public class TestTP2 {

	@Test
	public void testDepositarDineroEnCuentaSueldo()
	{
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(400.0);
		assertEquals(miCuenta.getSaldo(), 400.0, 0.0);
	}
	
	@Test
	public void testExtraerDineroEnCuentaSueldo()
	{
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(400.0);
		miCuenta.extraer(50.0);
		assertEquals(miCuenta.getSaldo(), 350.0, 0.0);
	}
	
	@Test
	public void testExtraccionCajaAhorro()
	{ 
		CajaAhorro miCajaAhorro = new CajaAhorro();
		miCajaAhorro.setExtraccionesSinExtra(5);
		miCajaAhorro.setCostoExtra(6d);
		miCajaAhorro.depositar(200.0);
		miCajaAhorro.extraer(20.0);  
		miCajaAhorro.extraer(20.0);
		miCajaAhorro.extraer(20.0);
		miCajaAhorro.extraer(20.0);
		miCajaAhorro.extraer(20.0);
		miCajaAhorro.extraer(20.0);
		miCajaAhorro.extraer(20.0);
		assertEquals(miCajaAhorro.getSaldo(),  48d, 0 );
	}
	
	@Test
	public void testSobregiroCuentaCorriente()
	{
		CuentaCorriente  miCuentaCorriente = new CuentaCorriente();
		miCuentaCorriente.depositar(100d);
		miCuentaCorriente.setSobregiro(150d);
		miCuentaCorriente.setComision(1.05);
		miCuentaCorriente.extraer(200d);
		assertEquals(miCuentaCorriente.getSaldo(), -105.0, 0.1);
		assertEquals(miCuentaCorriente.getSobregiro(), -105.0, 0.1);
	}
	
	//intente ponerle limite al sobregiro pero no me salia

}
