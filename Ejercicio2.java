
public class Ejercicio2 {
	public static void Imprimir(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " "); // Imprime elemento
			}
			System.out.println(); // Imprime salto de línea
		}
	}

	public static void Max(int[][] m) {
		System.out.println("--------------Numero mayor----------");

		int iNumeroMayor = m[0][0];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] > iNumeroMayor) {
					iNumeroMayor = m[i][j];

				}
			}

		}
		System.out.println("El mayor es: " + iNumeroMayor); // Imprime salto de línea}
	}

	public static void Min(int[][] m) {
		System.out.println("--------------Numero menor----------");

		int iNumeroMenor = m[0][0];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] < iNumeroMenor) {
					iNumeroMenor = m[i][j];

				}
			}

		}
		System.out.println("El menor es: " + iNumeroMenor); // Imprime salto de línea}
	}

	public static void Par(int[][] m) {
		System.out.println("--------------Numero mayor----------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] % 2 == 0) {
					System.out.print("Es par: " + m[i][j] + " "); // Imprime elemento
				}
			}
			System.out.println(); // Imprime salto de línea
		}
	}

	public static void Primo(int[][] m) {
		System.out.println("--------------Numeros primos----------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				int div = 0;
				for (int k = 1; k <= m[i][j]; k++) {
					if (m[i][j] % k == 0) {
						div++;
					}
				}
				if (div == 2) {
					System.out.println("Numero PRIMO: " + m[i][j]);
				} else {
					System.out.println("Numero NO primo: " + m[i][j]);

				}

			}
			System.out.println(); // Imprime salto de línea
		}
	}

	public static void promedio(int[][] m) {
		int suma = 0;
		float promedio;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				suma = suma + m[i][j];

			}
			System.out.println(); // Imprime salto de línea
		}
		promedio = suma / m.length;
		System.out.println("---------Promedio----");

		System.out.printf("Suma: %d Promedio: %f", suma, promedio);
		System.out.println("");

	}

	public static void main(String[] args) {

		int matriz[][] = new int[3][3];
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = (int) (Math.random() * 99 + 1);
			}
		}
		Imprimir(matriz);
		Par(matriz);
		promedio(matriz);
		Primo(matriz);
		Min(matriz);
		Max(matriz);

	}
}
