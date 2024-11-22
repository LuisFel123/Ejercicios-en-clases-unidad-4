/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package datos;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author felip
 */
@Named(value = "medidasPersona")
@Dependent
public class MedidasPersona implements Serializable {

    private int peso;
    private int cintura;
    private Date fecha;

    public MedidasPersona() {
    }

    public MedidasPersona(int p, int c, Date f) {
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
