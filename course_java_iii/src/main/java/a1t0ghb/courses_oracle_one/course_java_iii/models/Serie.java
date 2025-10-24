/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii.models;

//  IMPORTS: EXTERNAL classes and interfaces.

/**
 *
 * @author a1t0ghb
 */
public class Serie extends Titulo {

    //  Attributes declaration.
    private int temporadas;
    private boolean activa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //  CONSTRUCTOR: custom definition.
    //  - If we define a constructor for the superclass, now ALL OF ITS SUBCLASSES must have a MATCHING constructor.
    public Serie(String nombre, int fechaDeLanzamiento) {
        // super();             //  Default definition.
        super(nombre, fechaDeLanzamiento);
    }

    //  'Getters' for attributes: own class.
    public int getTemporadas() {
        return temporadas;
    }
    public boolean idActiva() {
        return activa;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    //  'Setters' for attributes. 'this' protected keyword, is used to refer to CURRENT object, just to avoid confusions with parameters (in case those have the same name).
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //  'Getters' for attributes: inherited. TO OVERRIDE.
    @Override                                       //  Annotation.
    public int getDuracionEnMinutos() {
        // return super.getDuracionEnMinutos();        //  'super' refers to 'parent' / 'super' class, from which current class inherits.
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    //  Overrides superclass method.
    @Override
    public String toString() {
        // return super.toString();         //  Default definition.
        return "Serie: " + super.getNombre() + " (" + super.getFechaDeLanzamiento() + ")";
    }

}
//  EOF.