/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii_challenge_app_shopping;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.
import java.util.Scanner;
import java.util.Collections;
// import java.util.Comparator;

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.
import a1t0ghb.courses_oracle_one.course_java_iii_challenge_app_shopping.models.Compra;
import a1t0ghb.courses_oracle_one.course_java_iii_challenge_app_shopping.models.TarjetaDeCredito;

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        //  INITIALIZATION OF INSTANCES.
        
        //  'Scanner' as class to receive input of user from console.
        //  - Use in conjunction with try-with-resources, to AUTOMATICALLY close resources and manage try-cath exceptions. Ref: 'https://www.w3schools.com/java/java_try_catch_resources.asp'.
        try (Scanner lectura = new Scanner(System.in)) {

            System.out.println("Escriba el límite de la tarjeta: ");
            var limite = lectura.nextDouble();                                              //  Method from class 'Scanner' to receive a double as an input.
            var tarjeta = new TarjetaDeCredito(limite);                                     //  Initialize instance of 'TarjetaDeCredito'.

            var salir = 1;                                                                  //  Default value for looping 'while'.

            //  Loops while possible: a. user chooses to continue, or b. there is room for new purchases.
            while(salir != 0) {
                
                System.out.println("Escriba la descripcion de la compra: ");
                var descripcion = lectura.next();                                           //  Method from class 'Scanner' to receive a String (default) as an input.
                System.out.println("Escriba el valor de la compra: ");
                var valor = Double.valueOf(lectura.next());                                 //  Alternative method to get a double: 1st, receive input as String, and 2nd, CAST it to double.

                var compra = new Compra(descripcion, valor);                                //  Initialize instance of 'Compra' for a new try.
                var compraRealizada = tarjeta.lanzarCompra(compra);                         //  'True' if purchase was possible, 'False', otherwise.

                if (compraRealizada) {

                    System.out.println("Compra realizada.");
                    System.out.println("Escriba 0 para salir o 1 para continuar...");
                    salir = lectura.nextInt();                                              //  Method from class 'Scanner' to receive an integer as an input. If '0', will exit 'while'.

                } else {

                    System.out.println("Saldo insuficiente.");
                    salir = 0;                                                              //  Will exit 'while'.

                }

            }

            //  Last code execution, AFTER 'while' ends.
            //  - Shows a summary of purchases, and balance.
            System.out.println("----- ----- -----");
            System.out.println("COMPRAS REALIZADAS:\n");

            //  Sorts list of compras, ASC BY value of purchase, using 'Collections' class.
            //  - REQUIRES implement class 'Collections': 'java.util.Collections'.
            //  - REQUIRES from class to sort; e.g. 'Compra', to implement interface 'Comparable'.
            Collections.sort(tarjeta.getListaDeCompras());

            // //  Alternative for sorting: using class 'Comparator'. Useful for using several sorting criterias ON-THE-FLY.
            // //  - REQUIRES implement class 'Comparator': 'java.util.Comparator'.
            // //  - Unlike 'Collections' approach, it DOESN'T REQUIRE other classes to implement any interface.
            // tarjeta.getListaDeCompras().sort(Comparator.comparing(Compra::getDescripcion));
            
            //  Loops through list of compras; i.e. instance of List class that stores instances of class 'Compra'.
            for (Compra compra : tarjeta.getListaDeCompras()) {
                System.out.println(compra);                                                 //  Inherent call to method '.toString()'.
            }
            System.out.println("----- ----- -----");
            System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo() + "\n");

        }

    }
}
//  EOF.