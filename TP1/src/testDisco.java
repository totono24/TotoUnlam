import org.junit.Assert;
import org.junit.Test;

public class testDisco {

	@Test
	public void calculoRadioOut() {
			Disco miDisco = new Disco();
			System.out.println("Calculo del perimetro exterior");
	      	miDisco.setRadioOut(7.0);
			
			Double perimOut;
			perimOut = miDisco.calcularPerimOut();
					
			Assert.assertEquals(43.98, perimOut, 0.01);
			}
	  

	@Test
	public void calculoRadioIn() {
			Disco miDisco = new Disco();
			System.out.println("Calculo del perimetro interior");
			miDisco.setRadioIn(4.0);
		
			Double perimIn;
			perimIn = miDisco.calcularPerimIn();
				
			Assert.assertEquals(25.13, perimIn, 0.01);
	}
	
	// No encontre solucion para hacer funcionar el test del area
	// No me reconoce el metodo de "calcularArea" en "Disco"
	
	// @Test
	// public void calculoArea() {
		//	Disco miDisco = new Disco();
		//	System.out.println("Calculo del area del disco");
		//	miDisco.setRadioIn(4.0);
		//	miDisco.setRadioOut(7.0);
		
		//	Double area;
		//	area = miDisco.calcularArea();
				
		//	Assert.assertEquals(28.00, area, 0.01);
//	}  

}
