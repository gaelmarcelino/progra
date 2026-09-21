/**
 * Ejercicio 1 
 * Crea un programa Java que defina dos variables que representen 
 * el precio de un producto y la cantidad de unidades compradas 
 * y que muestre por pantalla el importe total a pagar.
**/



public class EjemploComprar {
    public static void main(String[] args) {
      double precio = 100.20;
      int cantidad = 3;
        double total = precio * cantidad;
    System.out.println("El total es: " + total);
    }
}
