package modelo;

public class Calcular_3 {
	private String cad = "";
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = envioMETODO(Integer.parseInt(nombre));
	}

	
	
	public String envioMETODO(int n) {

		for (int i = 0; i <n; i++) {
			cad=cad+fibo4Terminos(i)+",";
		}

		return cad;
	}

	public  int fibo4Terminos(int n) {
		int a = 0, b = 0, c = 1, d = 1, e = 0;

		for (int i = 1; i <= n; i++) {
			// System.out.print(a + ",");
			e = a + b + c + d;
			a = b;
			b = c;
			c = d;
			d = e;
		}
		return a;
	}

	
	
	
	
	
	
}
