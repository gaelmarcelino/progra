/* 
"Trabajando con while"

Crea un programa en Java que simule un pequeño cajero automatico
El programa debe comenzar con un saldo de 100€

El programa mostrará repetidamente este menú:
    1. Consultar saldo
    2. Retirar dinero
    3. Ingresar dinero
    4. Salir


El usuario deberá introducir una opción.
Opción 1: mostrar el saldo actual.
Opción 2: pedir cuánto dinero quiere retirar.
    Si tiene suficiente saldo, realizar la retirada.
    Si no tiene suficiente, mostrar "Saldo insuficiente".
Opción 3: pedir cuánto dinero quiere ingresar y sumarlo al saldo.
Opción 4: salir del programa.
    Si introduce una opción diferente, mostrar "Opción no válida"
*/


import java.util.Scanner;
public class Cajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 100;
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Salir");
        
            opcion = sc.nextInt();
            

            if (opcion == 1) {
             System.out.println("Saldo actual: " + saldo);
             }
                else if (opcion == 2){
             System.out.println("¿Cuanto dinero quieres retirar?");
             double retirar = sc.nextDouble(); 
            
                if (retirar > saldo) {
                System.out.println("No hay saldo suficiente"); 
                }
               }
                
                else if (opcion == 3) {
                System.out.println("¿Cuanto dinero quieres ingresar?: ");
                double suma = sc.nextDouble();
                saldo += suma;
                System.out.println("Has añadido: " + saldo);
            }
                else if (opcion == 4) {
                    System.out.println("Cerrar programa");

                } else {
                    System.out.println("Opcion no valida");
                }

        
            

           
        
        

       

       
    }
     sc.close();
}
}


