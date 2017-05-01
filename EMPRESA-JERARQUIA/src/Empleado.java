//se solicita realizar un sistema de empleados que almcenene el nombre, salario, fecha de cumpleaños. 
//El organigrama de la empresa determina que esta organizada en diferentes departamenteos
//siendo que cada departamento esta administrado por un generte, quienes a su vez tienen una cochera asignada. 
//El director de la empresa, ademas de tener su conchera, recibe
//un extra a sus salario para los gatos del vechiculo.


public class Empleado {
	
	private Double salario;
	private String fecha; 
	private String nombre;
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
