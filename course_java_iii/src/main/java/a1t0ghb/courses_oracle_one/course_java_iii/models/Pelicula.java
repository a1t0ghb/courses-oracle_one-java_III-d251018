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

    //  CONSTRUCTOR: same name as Class.
    // //  CONSTRUCTOR - default: empty. Although it's useful to initialize attributes with default values.
    // public Pelicula() {
    // }
    //  CONSTRUCTOR: custom definition.
    //  - If we define a constructor for the superclass, now ALL OF ITS SUBCLASSES must have a MATCHING constructor.
    public Pelicula(String nombre, int fechaDeLanzamiento) {
        // super();             //  Default definition.
        super(nombre, fechaDeLanzamiento);
    }

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

    //  Overrides superclass method.
    @Override
    public String toString() {
        // return super.toString();         //  Default definition.
        return "Pelicula: " + super.getNombre() + " (" + super.getFechaDeLanzamiento() + ")";
    }

}
//  EOF.