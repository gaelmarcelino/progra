/* Amplía el programa EjemploCompra para:
- Solicitar por teclado al usuario el precio del producto y el número de unidades.
- Mostrar la fecha y hora del momento como fecha de compra.
- Formatear la salida por pantalla para que los importes se muestren con 2 decimales.
 */
import java.util.Scanner;
import java.time.LocalDateTime;

public class EjemploComprar3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce la cantidad de unidades compradas: ");
        int cantidad = sc.nextInt();

        double total = precio * cantidad;

        LocalDateTime fecha = LocalDateTime.now();

        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("Total: %.2f €%n", total);
        System.out.println("Fecha de compra: " + fecha);

        sc.close();
    
   }
}


