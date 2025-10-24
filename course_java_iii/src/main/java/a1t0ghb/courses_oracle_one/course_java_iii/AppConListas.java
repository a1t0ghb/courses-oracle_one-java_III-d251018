/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - Utilities.
import java.util.ArrayList;

import a1t0ghb.courses_oracle_one.course_java_iii.models.Pelicula;
import a1t0ghb.courses_oracle_one.course_java_iii.models.Serie;
import a1t0ghb.courses_oracle_one.course_java_iii.models.Titulo;

/**
 *
 * @author a1t0ghb
 */
public class AppConListas {

    public static void main(String[] args) {

        //  Initialization of instances.
        var miPelicula = new Pelicula("Encanto", 2021);
        var otraPelicula = new Pelicula("Avatar", 2023);
        var peliculaDeBruno = new Pelicula("El señor de los anillos.", 2001);
        var lost = new Serie("Lost", 2000);

        //  Add ratings for 'Pelicula' instances.
        miPelicula.evalua(9);
        otraPelicula.evalua(6);
        peliculaDeBruno.evalua(10);

        //  Create ArrayList of 'Titulo' instances.
        ArrayList<Titulo> lista = new ArrayList<>();            //  Symbols <> are called 'generics'.
        //  Add instances to array.
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        //  Traverse items in 'ArrayList'.
        // lista.forEach(item -> System.out.println(item));            //  Compact form 01 (since Java 8): using LAMBDA expresions; i.e. 'item -> System.out.println(item)'.
        // lista.forEach(System.out::println);                  `       //  Compact form 02: using 'Method Reference'', a reduced form of a LAMBDA expression.
        for (Titulo item: lista) {
            // System.out.println(item);                               //  Calling inherently method of '.toString()'
            System.out.println(item.getNombre());
            //  Filter items by class; e.g. if item is of subclass 'Pelicula', and inmmediately makes a CASTING from 'Titulo' to 'Pelicula', called 'pelicula'.
            //+ Also can include aditional conditions.
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());    //  Calls method specific of instances of class 'Pelicula'.
            }
        }

    }

}
//  EOF.