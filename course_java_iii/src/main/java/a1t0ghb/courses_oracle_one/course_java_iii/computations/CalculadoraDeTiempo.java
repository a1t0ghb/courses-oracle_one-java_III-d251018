/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii.computations;
//  IMPORTS: external classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_iii.models.Titulo;

/**
 *
 * @author a1t0ghb
 */
public class CalculadoraDeTiempo {

    //  Attributes declaration.
    private int tiempoTotal;

    //  'Getters' for attributes.
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //  'Setters' for attributes. 'this' protected keyword, is used to refer to CURRENT object, just to avoid confusions with parameters (in case those have the same name).
    //  PRIVATE 'setter'.
    private void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    //  Specific functions / methods.

    //  Accumulates duration of titles added. A 'title' can be an instance of class 'Titulo' or ANY of it's 'child', such as 'Pelicula' or 'Serie'.
    //  - The fact the method can be used with a class or any of its 'child' classes, refers to POLYMORPHISM.
    public void incluido(Titulo titulo) {
        // //  NOT RECOMMENDED: specially for 'parent' classes, use direct access / call to attributes.
        // tiempoTotal += titulo.getDuracionEnMinutos();
        //  RECOMMENDED: use base 'getters' and 'setters' of attributes, so they are context / class AWARE.
        System.out.println("Agregando duración en minutos de " + titulo);
        setTiempoTotal(getTiempoTotal() + titulo.getDuracionEnMinutos());
    }

}
//  EOF.