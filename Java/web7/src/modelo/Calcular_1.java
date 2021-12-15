package modelo;

public class Calcular_1 {
	private String cad = "";
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = envioMETODO(Integer.parseInt(nombre));
	}

	
	
	public String envioMETODO(int n) {

		cad = cad + factorial(n);

		return cad;
	}

	public int factorial(int num) {
		if (num == 0) {
			return 1;
		} else
			return num * factorial(num - 1);
	}

}
