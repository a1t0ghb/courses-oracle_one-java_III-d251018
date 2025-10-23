/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii.models;

//  IMPORTS: EXTERNAL classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_iii.computations.Clasificacion;

/**
 *
 * @author a1t0ghb
 */
public class Pelicula extends Titulo implements Clasificacion {

    //  Attributes declaration.
    private String director;

    //  'Getters' for attributes.
    public String getDirector() {
        return director;
    }

    //  'Setters' for attributes. 'this' protected keyword, is used to refer to CURRENT object, just to avoid confusions with parameters (in case those have the same name).
    public void setDirector(String director) {
        this.director = director;
    }

    //  Specific functions / methods.

    //  Functions / methods from 'implements'.

    //  Gets star rating (integer, 0 to 5), using as reference the note's average of 'calcularMedia()' (double, 0.0 to 10.0), from 'parent' class 'Titulo'.
    @Override
    public int getClasificacion() {
        return (int) (calculaMediaEvaluaciones() / 2);
    }

}
//  EOF.