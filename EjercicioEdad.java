/* 
Crea un programa que:

Pida al usuario su edad actual.
Pida cuántos años quiere avanzar.
Calcule qué edad tendrá entonces.
Muestre el resultado 
*/
import java.util.Scanner;
public class EjercicioEdad {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es tu edad actual");

        int edad = sc.nextInt();

        System.out.print("Cuantos años quieres avanzar");

        int cantidad = sc.nextInt();

        int resultado = cantidad + edad;

        System.out.print("Estos son los años que avanzaste" + resultado);

        sc.close();

        
    }
}
