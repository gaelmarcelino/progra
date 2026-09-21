/**
Amplía el programa EjemploCompra añadiendo una constante que represente el porcentaje de IVA a aplicar a la compra (21%),
cuyo importe habrá que calcular y añadir al importe total a pagar por el comprador, mostrando toda la información por pantalla.
Añade un comentario de documentación de autoría indicando tu nombre y apellidos.
*/

public class EjemploComprar2 {

    public static void main(String[] args) {

        double precio = 100.20;
        int cantidad = 3;

        final double IVA = 0.21;

        double subtotal = precio * cantidad;
        double iva = subtotal * IVA;
        double total = subtotal + iva;

        System.out.println("Precio: " + precio + " €");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("IVA: " + iva + " €");
        System.out.println("Total a pagar: " + total + " €");

    }
}