package ejerciciosResueltos;

/*
* Programa que lee números hasta que se lee un negativo y muestra la
* suma de los números leídos 
*/
import java.util.*;

public class Ejemplo1While {
	
	public static void main(String[] args) {
		
		int suma = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		while (num >= 0) {
			suma = suma + num;
			System.out.print("Introduzca un número: ");
			num = sc.nextInt();
		}
		System.out.println("La suma es: " + suma);
	}
}
