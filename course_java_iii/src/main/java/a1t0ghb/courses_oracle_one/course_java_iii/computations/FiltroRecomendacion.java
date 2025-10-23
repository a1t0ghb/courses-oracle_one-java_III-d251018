/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.course_java_iii.computations;

/**
 *
 * @author a1t0ghb
 */
public class FiltroRecomendacion {

    // private String recomendacion;

    public void filtra(Clasificacion clasificacion) {
        
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Está entre los favoritos del momento.");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Bien evaluado actualmente.");
        } else {
            System.out.println("Colocalo en tu lista para verlo después.");
        }
        
    }

}
//  EOF.