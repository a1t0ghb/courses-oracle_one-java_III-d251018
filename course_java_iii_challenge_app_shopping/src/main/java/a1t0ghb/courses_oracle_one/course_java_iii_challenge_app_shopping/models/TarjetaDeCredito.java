/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.course_java_iii_challenge_app_shopping.models;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.
import java.util.ArrayList;
import java.util.List;

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.

/**
 *
 * @author a1t0ghb
 */
public class TarjetaDeCredito {

    //  ATTRIBUTES DECLARATION.
    // @SuppressWarnings("FieldMayBeFinal")            //  Keyword 'final': make reference non-changeable. Ref.: 'https://www.w3schools.com/java/ref_keyword_final.asp'.
    private double limite;
    private double saldo;
    // @SuppressWarnings("FieldMayBeFinal")            //  Keyword 'final': make reference non-changeable. Ref.: 'https://www.w3schools.com/java/ref_keyword_final.asp'.
    private List<Compra> listaDeCompras;

    //  CONSTRUCTOR.
    //  - Only requires to set a 'limite'; i.e. shopping's limit.
    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    //  ATTRIBUTE'S 'GETTERS'.
    public double getLimite() {
        return limite;
    }
    public double getSaldo() {
        return saldo;
    }
    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    //  ATTRIBUTE'S 'SETTERS': usually, public.
    //  Private setter.
    @SuppressWarnings("unused")
    private void setLimite(double limite) {
        this.limite = limite;
    }
    //  Private setter.
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //  Private setter.
    @SuppressWarnings("unused")
    private void setListaDeCompras(List<Compra> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.

    //  METHODS FROM 'IMPLEMENTS'.

    //  REGULAR METHODS.

    //  Adds an instance of class 'Compra' to List (of class 'Compra') 'listaDeCompras'.
    private void addCompra(Compra compra) {
        this.listaDeCompras.add(compra);
    }

    //  Validates if there is room available for a new purchase.
    //  - Returns: boolean. 'true' if shopping is possible; 'false', otherwise.
    public boolean lanzarCompra(Compra compra) {
        
        //  Default: a new purchase is not possible.
        var esCompraValida = false;
        
        //  Case: there is room available for a new purchase.
        if (getSaldo() >= compra.getValor()) {
            // this.saldo -= compra.getValor();            //  Not recommended approach.
            setSaldo(getSaldo() - compra.getValor());   //  Updates 'saldo'.
            // this.listaDeCompras.add(compra);            //  Not recommended approach.
            addCompra(compra);                          //  Adds 'compra' to list.
            esCompraValida = true;                      //  Set compra as valid.
        }

        return esCompraValida;
    }

}
