/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package datos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author felip
 */
@Named(value = "persona")
@SessionScoped
public class Persona implements Serializable {

    private String usuario;
    private String password;
    private Date fecha_nac;
    private double estatura;
    private char genero;
    private int cadera;
    private ArrayList<MedidasPersona> medidas;
    private char sexo;

    public Persona() {
    }

    public Persona(String u, String p, Date fn, double es, char s, int c) {
        usuario = u;
        password = p;
        fecha_nac = fn;
        estatura = es;
        genero = s;
        cadera = c;
        medidas = new ArrayList();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public ArrayList<MedidasPersona> getMedidas() {
        return medidas;
    }

    public void setMedidas(ArrayList<MedidasPersona> medidas) {
        this.medidas = medidas;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
