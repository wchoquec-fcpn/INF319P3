package modelo;


public class Calcular_2 {
	private String cad = "";
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = envioMETODO(Integer.parseInt(nombre));
	}

	public String envioMETODO(int n) {

		cad = cad + elava(n);

		return cad;
	}

	public static int elava(int n) {
		return (int) Math.pow(n, 2);
	}

}
