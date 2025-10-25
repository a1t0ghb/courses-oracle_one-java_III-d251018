/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii_challenge_app_shopping.models;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.

/**
 *
 * @author a1t0ghb
 */
public class Compra implements Comparable<Compra> {

    //  ATTRIBUTES DECLARATION.
    private String descripcion;
    private double valor;

    //  CONSTRUCTOR.
    //  - Requires to set a ALL attributes from parameters.
    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    //  ATTRIBUTE'S 'GETTERS'.
    public String getDescripcion() {
        return descripcion;
    }
    public double getValor() {
        return valor;
    }

    //  ATTRIBUTE'S 'SETTERS': public, by default.
    //  Private setter.
    @SuppressWarnings("unused")
    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //  Private setter.
    @SuppressWarnings("unused")
    private void setValor(double valor) {
        this.valor = valor;
    }

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.

    //  Overrides from superclass 'Object'. No need to IMPORT.
    @Override
    public String toString() {
        // return super.toString();                                            //  Default definition.
        return "Compra: [" + getValor() + "] " + getDescripcion() + ".";
    }

    //  METHODS FROM 'IMPLEMENTS'.

    //  Overrides from interface 'Comparable'. No need to IMPORT.
    //  - Method to compare 2 instances of same CURRENT class.
    //  - When implementing this method, always look for using method '.compareTo()', available in clases listed in 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html'.
    //  - e.g. If value to sort is a primitive 'double', CAST IT to class 'Double' (with is casting method '.valueOf()'), so method '.compareTo()' can be used.
    @Override
    public int compareTo(Compra compra) {
        // return 0;                                                           //  Default definition.
        //  Use 'valor'; i.e. purchase amount, as criteria, using default behaviour ASC of '.compareTo()'.
        return Double.valueOf(getValor()).compareTo(compra.getValor());
    }

    //  REGULAR METHODS.

}
