/* 
Crea un programa que:

- Pida el precio de un producto.
- Pida cuántas unidades compra el usuario.
- Calcule el precio total.
- Pida cuánto dinero ha pagado el usuario.
- Calcule cuánto dinero hay que devolverle.
- Muestre el total y el cambio. 
*/

import java.util.Scanner;

public class Compra {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Dime el precio del producto");
        int precio = sc.nextInt();

        System.out.print("Dime cuantas unidades vas a coger");
        int unidades = sc.nextInt();

        int precioTotal = precio * unidades;

        System.out.print("El precio total de lo comprado es: " + precioTotal);

        System.out.print("Cuanto hay que devolverle");
        int pagado = sc.nextInt();

        int cambio = pagado - precioTotal;
        System.out.print("Hay que devolverle: " + cambio);

    sc.close();


        




        


    }
}
