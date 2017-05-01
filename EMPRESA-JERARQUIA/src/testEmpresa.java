import org.junit.Assert;
import org.junit.Test;

// el test me dice que los get y set no estan definidos
// no supe como solucionarlo

public class testEmpresa {

	@Test
	public void testEmpleado() {
			Empleado miEmpleado = new Empleado();
			
	      	miEmpleado.setSalario(5000.0);
	      	miEmpleado.setFecha("11/5/90");
	      	miEmpleado.setNombre("PhilipLaFresque");
			
	      	Double salario = miEmpleado.getSalario();
	      	String fecha = miEmpleado.getFecha();
	      	String nombre = miEmpleado.getNombre();
					
			Assert.assertEquals(5000.0, salario, 0.1);
			Assert.assertEquals("11/5/90", fecha);
			Assert.assertEquals("PhilipLaFresque", nombre);
			
			}
	
	@Test
	public void testGerente() {
			Gerente miGerente = new Gerente();
			
			miGerente.setSalario(7500.0);
	      	miGerente.setFecha("22/3/85");
	      	miGerente.setNombre("TomRedwood");
	      	miGerente.setCochera("Cochera1");
	      	miGerente.setDepartamento("Contabilidad");
	      	
	      	Double salario = miGerente.getSalario();
	      	String fecha = miGerente.getFecha();
	      	String nombre = miGerente.getNombre();
	      	String cochera = miGerente.getCochera();
	      	String dpto = miGerente.getDepartamento();
			
			Assert.assertEquals(7500.0, salario, 0.1);
			Assert.assertEquals("22/3/85", fecha);
			Assert.assertEquals("TomRedwood", nombre);
			Assert.assertEquals("Cochera1", cochera);
			Assert.assertEquals("Contabilidad", dpto);
			}
	
	@Test
	public void testDirector() {
			Director miDirector = new Director();
			
			miDirector.setSalario(8000.0);
			miDirector.setFecha("15/8/70");
			miDirector.setNombre("AmabelSwanson");
			miDirector.setCochera("Cochera2");
			miDirector.setSueldoextra(2000.0);
			
			Double salario = miDirector.getSalario();
	      	String fecha = miDirector.getFecha();
	      	String nombre = miDirector.getNombre();
	      	String cochera = miDirector.getCochera();
	      	Double salextra = miDirector.getSueldoextra();
			
			Assert.assertEquals(8000.0, salario, 0.1);
			Assert.assertEquals("15/8/70", fecha);
			Assert.assertEquals("AmabelSwanson", nombre);
			Assert.assertEquals("Cochera2", cochera);
			Assert.assertEquals(2000.0, salextra, 0.1);
			
			}

}
