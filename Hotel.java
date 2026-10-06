/*
Crea un programa en java llamado Hotel

1. Datos del cliente
    Pide:
    - Nombre del cliente
    - Edad 
    - Numero de personas
    - Numero de coches

    Si la edad es menor de 18 años, muestra:
    No puedes realizar la reserva
    y termina el programa

2. Tipo de habitacion

    ¿Qué tipo de habitación quieres?
    Individual → 40 € por noche
    Doble → 65 € por noche
    Suite → 100 € por noche

3. Temporada

    ¿En qué temporada estamos?
    Temporada baja
    Temporada alta

    Si es temporada alta, aumenta el precio de la habitacion un 20%.

4. Desayuno

    ¿Quieres desayuno? (Si/No)
    El desayuno cuesta 8 € por persona y noche.El desayuno cuesta 8 € por persona y noche.
    Si no quiere desayuno, el coste es 0€

5. Parking

    ¿Quieres parking? (Si/No)
    El parking cuesta 12 € por noche, independientemente del número de personas.

6. Descuento por edad

    Si el cliente tiene 65 años o más, obtiene un 10% de descuento sobre el precio de la habitación.
    El descuento NO se aplica al desayuno ni al parking. 
*/

import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        int precioHabitacion = 0;
        if (edad < 18) {
        System.out.println("No puedes hacer la reserva");
        return;
        } else if (edad > 65) {
            double suma = precioHabitacion * 0.10;
            }
        

        System.out.println("Dime cuantas personas sois");
        int personas = sc.nextInt();

        System.out.println("Cuantos coches son");
        int coches = sc.nextInt();

        
      
        System.out.println("¿Qué tipo de habitacion quieres? 1= Individual, 2= Doble, 3 = Suite");
        int habitacion = sc.nextInt();
       
        
        if (habitacion == 1) {
        
        precioHabitacion = 40;
        System.out.println("Has elegido una habitacion individual  "  );
        System.out.println(precioHabitacion);

        
        } else if (habitacion == 2) {
      
       precioHabitacion = 65;
        System.out.println("Has elegido una habitacion doble   ");
        System.out.println(precioHabitacion);
        
    
        } else if (habitacion == 3) {
        precioHabitacion = 100;
        System.out.println("Has elegido una suite");
        System.out.println(precioHabitacion);

        } else {
            System.out.println("La opcion no es valida");
            return;

        }

        System.out.println("¿En que temporada estamos? 1= Temporada alta, 2= Temporada baja");
        int temporada = sc.nextInt();
        if (temporada == 1) {
        
        double numero = precioHabitacion * 0.20;
        double resultado = numero + precioHabitacion;

        System.out.println(resultado);

        }
       
        System.out.println("¿Quieres desayuno? 1= Si, 2= No" );
         int desayuno = sc.nextInt();
        if (desayuno == 1) {

            int num= personas * 8;

            System.out.print("El precio del desayuno es: " + num +" eur " );
        } else if (desayuno == 2); {
            System.out.println("No quieres desayuno, no se te cobrará nada");
        }

        int parking = sc.nextInt();
        System.out.println("¿Quieres parking? 1= Si, 2= No");
        if (parking == 1) {
        int numero = 12;
        System.out.println("El parking cuesta: " + numero);
        }




        
    

        


        
         



    



    
    
        sc.close();
        
    }


}
