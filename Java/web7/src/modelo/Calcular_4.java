package modelo;

public class Calcular_4 {
	private String cad = "";
	private String nombre;
	private String nombre2;

	// ---------------------------------------------
	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	// ---------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre, String nombre2) {
		this.nombre = envioMETODO(Integer.parseInt(nombre), Integer.parseInt(nombre2));
	}

	// ---------------------------------------------
	public String envioMETODO(int a, int b) {

		cad = "a=" + a + " b=" + b + 
				" Suma=" + suma(a, b) + " Resta=" + resta(a, b) + " Multiplicacion="
				+ multiplicacion(a, b) + " Division=" + division(a, b);

		return cad;
	}

	// ---------------------------------------------
	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multiplicacion(int a, int b) {
		return a * b;
	}

	public double division(double a, double b) {
		return a / b;
	}
}
