/*
1. Pide el precio de la comida
2. Pide cuantas unidades se ha pedido
3. Calcula el precio total de la comida
4. Pregunta si quiere añadir una bebida (si/no)
5. Si ha elegido 1, pide el precio de la bebida y sumalo al precio total
6. Pregunta cuanto dinero ha pagado
8. Muestra el precio de la comida
9. Muestra el precio de la bebida si la ha comprado
10. Muestra el precio total
11. Muestra cuanto dinero ha pagado
*/
import java.util.Scanner;
public class Restaurante {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cual es el precio de la comida?");
        int precio = sc.nextInt();

        System.out.print("¿Cuantas unidades has pedido?");
        int unidades = sc.nextInt();

        int total = precio * unidades;
        System.out.print("El precio total de la comida es: " + total);

        System.out.print("¿Quieres añadir alguna bebida?");
        int bebidas = sc.nextInt();

        System.out.print("Has añadido una bebida a tu comida" + bebidas);
       
        System.out.print("¿Cuanto cuesta la bebida?: ");
        double BebidasPrecio = sc.nextDouble();

        System.out.print("La bebida cuesta" + BebidasPrecio);
        double total_bebidas = total + BebidasPrecio;

        System.out.print("El total de la comida y bebida es: " + total_bebidas); 

        System.out.println("El precio de la comida es: " + precio);
        System.out.println("Has añadido " + bebidas);
        System.out.println("La bebida te ha costado:" + BebidasPrecio);
        System.out.println("El precio total es: " + total_bebidas);


    sc.close();

    }

}
