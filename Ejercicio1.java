import java.util.*;

public class Ejercicio1 {
	static int[] A = new int[17];

	public static void Min(int[] arr) {
		int iNumeroMenor = arr[0];
		for (int pos = 0; pos < 17; pos++) {

			if (arr[pos] < iNumeroMenor) {
				iNumeroMenor = arr[pos];

			}

		}
		System.out.println("Este es el num menor" + iNumeroMenor);

	}

	public static void Max(int[] arr) {
		int iNumeroMayor = arr[0];
		for (int pos = 0; pos < 17; pos++) {
			if (arr[pos] > iNumeroMayor) {
				iNumeroMayor = arr[pos];
			}

		}
		System.out.println("Este es el num mayor" + iNumeroMayor);

	}

	public static void Imprimir(int[] arr) {
		System.out.println("--------------Lista de números----------");

		for (int pos = 0; pos < arr.length; pos++) {

			System.out.println("Elemento: " + arr[pos]);

		}
	}
	public static void Par(int[] arr) {
		System.out.println("--------------Numeros pares----------");

		for (int i = 0; i < 17; i++) {
				if(arr[i] % 2 == 0) {
					System.out.println("Numero par: "+arr[i]);

				}}}
		
			
	public static void Primo(int[] arr) {
		System.out.println("--------------Numeros primos----------");

		for (int i = 0; i < 17; i++) {
			int div=0;
			for (int j = 1; j <= arr[i]; j++) {
				if(arr[i] % j == 0) {
					div++;
				}

			}
			if(div==2) {
					System.out.println("Numero PRIMO: "+arr[i]);
				}else {
					System.out.println("Numero NO primo: "+arr[i]);

				}
		}

	}
	static void Asc(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
        	int iNumeroMenor = i;
    		for (int pos = i; pos < 17; pos++) {

    			if (arr[pos] < arr[iNumeroMenor]) {
    				iNumeroMenor = pos;

    			}}
            if (i != iNumeroMenor) {
                int aux = arr[i];
                arr[i] = arr[iNumeroMenor];
                arr[iNumeroMenor] = aux;
            }
        }System.out.println("-------------Orden ascendente-----------");
        for (int num : arr) {
            System.out.println(num);
        }
    }
	static void Promedio(int[] arr) {
		int suma=0;
		float promedio;
		for (int i = 0; i < arr.length; i++) {
			suma=suma+arr[i];
		}
		promedio=suma/arr.length;
		System.out.printf("Suma: %d Promedio: %f", suma, promedio);
		
	}
	static void Suma(int[] arr) {
		int suma=0;
		int u=arr.length;
	suma=arr[0]+arr[u-1];
		
		System.out.print("Suma del primer y ultimo elemento: "+suma);
		
	}
	
	
	public static void main(String[] args) {

		for (int pos = 0; pos < 17; pos++) {
			A[pos] = (int) (Math.random() * 99 + 1);

		}

		Imprimir(A);
		//Min(A);
		//Max(A);
		//Primo(A);
		//Par(A);
		//Asc(A);
		//Promedio(A);
		Suma(A);
	}
}