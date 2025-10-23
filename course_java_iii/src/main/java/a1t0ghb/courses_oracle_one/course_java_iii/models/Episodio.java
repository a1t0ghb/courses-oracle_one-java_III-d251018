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
public class Episodio implements Clasificacion {

    //  Attributes declaration.
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    //  'Getters' for attributes.
    public int getNumero() {
        return numero;
    }
    public String getNombre(){
        return nombre;
    }
    public Serie getSerie(){
        return serie;
    }
    public int getTotalVisualizaciones(){
        return totalVisualizaciones;
    }
    
    //  'Setters' for attributes. 'this' protected keyword, is used to refer to CURRENT object, just to avoid confusions with parameters (in case those have the same name).
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    //  Specific functions / methods.

    //  Functions / methods from 'implements'.

    //  Gets star rating (integer, 0 to 5), using as reference the note's average of 'calcularMedia()' (double, 0.0 to 10.0), from 'parent' class 'Titulo'.
    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        } else {
            return 2;
        }
    }

}
//  EOF.