/** Crea un programa que solicite el radio de un círculo y
que calcule y muestre su área y el perímetro de la circunferencia con una precisión de 2 decimales. 
El radio introducido por teclado puede tener decimales
 */
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        sc.close();
    }
}

