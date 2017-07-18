import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapa {
	
	private Map<Integer, Persona> conjunto = new TreeMap<Integer, Persona>();
	

	public Map<Integer, Persona> getConjunto() {
		return conjunto;
	}

	public void setConjunto(Map<Integer, Persona> conjunto) {
		this.conjunto = conjunto;
	}
	
	public void recorrerMapa(){
		
		for(Entry<Integer, Persona> entry : conjunto.entrySet()) {
			  Integer key = entry.getKey();
			  Persona value = entry.getValue();

			  System.out.println(key + " => " + value);
			}
		
	}

	
	public void agregarPersona(Persona persona){
		
		conjunto.put(claveAleatoria(), persona);
		
	}
	
	public Integer contarCantidadDePersonas()
	{
		return conjunto.size();
	}


	public void removerPersona (Persona persona)
	{
		conjunto.remove(persona);
	}


	public void vaciarConjunto()
	{
		conjunto.clear();
	}
	
	public int claveAleatoria(){
		
		return (int) Math.floor(Math.random() * (0 - (100+1)) + (100+1));
	}

}
