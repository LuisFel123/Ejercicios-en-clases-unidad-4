/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package datos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author felip
 */
@Named(value = "mediciones")
@SessionScoped
public class Mediciones implements Serializable {

    /**
     * Creates a new instance of Mediciones
     */
    private int peso;
    private int cintura;
    private Date fecha;

    public Mediciones() {
    }

    public Mediciones(int p, int c, Date f) {
        peso = p;
        cintura = c;
        fecha = f;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
