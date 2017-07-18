import static org.junit.Assert.*;

import org.junit.Test;

public class TestsMapa {

	@Test
	public void testQueAgregaPersonas() {
		Mapa miMapa = new Mapa();
		Persona p1 = new Persona("pepe", 25322435);
		Persona p2 = new Persona("julian", 32456531);
		Persona p3 = new Persona("juan", 25322332);
		Persona p4 = new Persona("rodrigo", 23575123);
		
		miMapa.agregarPersona(p1);
		miMapa.agregarPersona(p2);
		miMapa.agregarPersona(p3);
		miMapa.agregarPersona(p4);
		
		miMapa.recorrerMapa();
		
	}

}
