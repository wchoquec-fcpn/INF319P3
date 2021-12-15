package modelo;

public class matricesSumRestMulInv {

	/**
	 *   5) - Calculadora de matrices con funciones de orden superior
	 */
	public static void main(String[] Args) {
		double[][] matrizA = new double[][] { { 1, 2 }, { 3, 4 } };
		double[][] matrizB = new double[][] { { 5, 6 }, { 7, 8 } };
		mostraMatrizAB(matrizA, matrizB);
		sumarMatrizAB(matrizA, matrizB);
		restarMatrizAB(matrizA, matrizB);
		double[][] resultM = multiplicar(matrizA, matrizB);
		inversaM a = new inversaM();

		double d[][] = a.invert(resultM);

		System.out.println("La inversa de (AXB)= ");

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j)

			{
				System.out.print(d[i][j] + "  ");
			}

			System.out.println();
		}

	}

	public static double[][] multiplicar(double[][] A, double[][] B) {

		System.out.println("Matriz resultado A X B=");
		int aRows = A.length;
		int aColumns = A[0].length;
		int bRows = B.length;
		int bColumns = B[0].length;

		if (aColumns != bRows) {
			throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
		}

		double[][] C = new double[aRows][bColumns];
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bColumns; j++) {
				C[i][j] = 0;
			}
		}

		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(C[i][j] + " ");
			System.out.println();
		}
		return C;
	}

	public static void mostraMatrizAB(double[][] matrizA, double[][] matrizB) {
		double[][] matrizResultado;
		int filasA = matrizA.length;
		int columnasA = matrizA[0].length;

		double filasB = matrizB.length;
		double columnasB = matrizB[0].length;

		System.out.println("Primera matriz:A");
		for (int i = 0; i < filasA; i++) {
			for (int j = 0; j < columnasA; j++) {
				System.out.print(matrizA[i][j] + "   ");
			}
			System.out.println("");
		}

		System.out.println("Segunda matriz:B");
		for (int i = 0; i < filasB; i++) {
			for (int j = 0; j < columnasB; j++) {
				System.out.print(matrizB[i][j] + "   ");
			}
			System.out.println("");
		}

	}

	public static double[][] sumarMatrizAB(double[][] matrizA, double[][] matrizB) {
		double[][] matrizResultado;
		int filasA = matrizA.length;
		int columnasA = matrizA[0].length;

		double filasB = matrizB.length;
		double columnasB = matrizB[0].length;

		if (filasA == filasB && columnasB == columnasA) {

			matrizResultado = new double[filasA][columnasA];
			for (int i = 0; i < filasA; i++) {
				for (int j = 0; j < columnasA; j++) {
					matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}

		} else {
			throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
		}
		System.out.println("Matriz resultado A+B=");
		for (int i = 0; i < filasA; i++) {
			for (int j = 0; j < columnasA; j++) {
				System.out.print(matrizResultado[i][j] + "   ");
			}
			System.out.println("");
		}
		return matrizResultado;
	}

	public static double[][] restarMatrizAB(double[][] matrizA, double[][] matrizB) {
		double[][] matrizResultado;
		int filasA = matrizA.length;
		int columnasA = matrizA[0].length;

		double filasB = matrizB.length;
		double columnasB = matrizB[0].length;

		if (filasA == filasB && columnasB == columnasA) {

			matrizResultado = new double[filasA][columnasA];
			for (int i = 0; i < filasA; i++) {
				for (int j = 0; j < columnasA; j++) {
					matrizResultado[i][j] = matrizA[i][j] - matrizB[i][j];
				}
			}

		} else {
			throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
		}
		System.out.println("Matriz resultado A-B=");
		for (int i = 0; i < filasA; i++) {
			for (int j = 0; j < columnasA; j++) {
				System.out.print(matrizResultado[i][j] + "   ");
			}
			System.out.println("");
		}
		return matrizResultado;
	}

}