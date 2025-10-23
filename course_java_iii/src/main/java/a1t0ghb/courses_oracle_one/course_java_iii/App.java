/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii;

//  IMPORTS: external classes and interfaces.
import a1t0ghb.courses_oracle_one.course_java_iii.computations.CalculadoraDeTiempo;
import a1t0ghb.courses_oracle_one.course_java_iii.computations.FiltroRecomendacion;
import a1t0ghb.courses_oracle_one.course_java_iii.models.Episodio;
import a1t0ghb.courses_oracle_one.course_java_iii.models.Pelicula;
import a1t0ghb.courses_oracle_one.course_java_iii.models.Serie;

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {

        //  Initialization of a 1st INSTANCE of a class 'Pelicula'.
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(180);
        // miPelicula.setIncluidoEnElPlan(true);
        //  Validate in console.
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());
        miPelicula.muestraFichaTecnica();

        //  Validation of proper capture of movie ratings.
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        // System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());

        //  Initialization of an INSTANCE of a class 'Serie'.
        Serie lost = new Serie();
        lost.setNombre("Lost");                         //  Inherited from class 'Titulo'.
        lost.setFechaDeLanzamiento(2000);               //  Inherited from class 'Titulo'.
        lost.setTemporadas(10);                         //  From own class 'Serie'.
        lost.setMinutosPorEpisodio(50);                 //  From own class 'Serie'.
        lost.setEpisodiosPorTemporada(10);              //  From own class 'Serie'.
        //  Validate in console.
        lost.muestraFichaTecnica();                     //  Inherited from class 'Titulo'.
        System.out.println("Duracion de la serie: " + lost.getDuracionEnMinutos());         //  Initally inherited from class 'Titulo', but later custom OVERRIDED in own class 'Serie'.

        //  Initialization of another INSTANCE of a class 'Pelicula'.
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Avatar");
        otraPelicula.setFechaDeLanzamiento(2023);
        otraPelicula.setDuracionEnMinutos(180);
        // //  Validate in console.
        // otraPelicula.muestraFichaTecnica();

        //  Initialization of an INSTANCE of a class 'CalculadoraDeTiempo', which can be seen as a class with computations for classes 'Titulo' and its 'childs'.
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);               //  A 'Pelicula'; child of class 'Titulo'.
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);                     //  A 'Serie'; child of class 'Titulo'.
        System.out.println("Tiempo necesario para ver tus títulos: " + calculadora.getTiempoTotal() + " minutos.");

        //  Initialization of an INSTANCE of a class 'Episodio'.
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        // episodio.setNombre("La Casa Tragaryen");
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);

        //  Initialization of an INSTANCE of class 'FiltroRecomendacion', to implement based on previous INSTANCES created.
        FiltroRecomendacion filtro = new FiltroRecomendacion();
        //  Get recommendation from intrinsic interface implemented in 'Pelicula' class.
        filtro.filtra(miPelicula);
        //  Get recommendation from intrinsic interface implemented in 'Episodio' class.
        filtro.filtra(episodio);

    }

}
//  EOF.