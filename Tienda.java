/*
1. Pide el precio de un producto
2. Pide cuantas unidades quiere comprar
3. Calcula el precio total
4. Pregunta que tipo de cliente es:
    1 = Cliente normal
    2 = Cliente VIP
5. Si es VIP:
    Aplica un descuento del 10% al total
6. Pregunta si quiere envio al domicilio (Si/No)
7. Si quiere envio:
    Pregunta que tipo de envio quiere:
        Normal - 5€
        Rapido - 10€
8. Si no quiere envio no añado nada al total
9. Pregunta cuanto dinero ha pagado
10. Muestra:
    - Precio del producto
    - Unidades
    - Tipo de cliente
    - Descuento aplicado
    - Tipo de envio
    - Total final
    - Dinero pagado
*/
import java.util.Scanner;
public class Tienda {

    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cual es el precio del producto?: ");
    int producto = sc.nextInt();

    System.out.println("¿Cuantas unidades quieres comprar?: ");
    int unidades = sc.nextInt();

    double total = producto * unidades;

    System.out.println("El precio total es: " + total);

    String tipoCliente = "Cliente VIP";
    System.out.println("¿Qué tipo de cliente eres? 1 = Normal , 2 = VIP");

    int cliente = sc.nextInt();

    if (cliente == 2) {
        tipoCliente = "Cliente VIP";
        double descuento = total * 0.10;
        total = total - descuento;

    System.out.println("Este es el descuento del 10%: " + total);
    }
    
    System.out.println("¿Quieres envio a domicilio? 1 = Si, 2 = No");
    int envio = sc.nextInt();

    if (envio == 1) {
        System.out.println("Tienes un envio");
    }
    if (envio == 2) {
        System.out.println("No tienes ningun envio");
        return;
        }
    String nombreEnvio;
    System.out.println("¿Qué tipo de envio quieres? 1 = Normal, 2 = Rapido: " );
    int tipoEnvio = sc.nextInt();
    
    if (tipoEnvio == 1) {
     total = total + 5;
     System.out.println("Has elegido el tipo de envio normal, acabarás pagando: " + total);
     nombreEnvio="Normal";
    } else {
        System.out.println("no has elegido algo normal");
     nombreEnvio ="Normal";
     }

   
    if (tipoEnvio == 2){
        total = total + 10;
        System.out.println("Has elegido el tipo de envio rapido, acabarás pagando" + total);
        nombreEnvio="Rapido";
    } else {
        System.out.println("no has elegido algo rapido");
    }

    System.out.println("¿Cuanto dinero has pagado?" + total);


    System.out.println("El precio del producto es: " + producto);
    System.out.println("Has comprado" + unidades + "unidades: " );
    System.out.println("Tipo de cliente: " + tipoCliente );
    System.out.println("Envio a domicilio: " + envio);
    System.out.println("Tipo de envio: " + nombreEnvio);
    System.out.println("Has pagado: " + total);

    sc.close();
   }
}

    
    

 