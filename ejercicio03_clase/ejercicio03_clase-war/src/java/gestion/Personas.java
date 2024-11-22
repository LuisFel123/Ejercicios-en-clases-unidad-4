/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package gestion;

import datos.Persona;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
@Named(value = "personas")
@SessionScoped
public class Personas implements Serializable {

    Persona persona;
    ArrayList<Persona> personas;

    /**
     * Creates a new instance of Personas
     */
    public Personas() {
        persona = new Persona();
        personas = new ArrayList();
    }

    public void registrar() {
        personas.add(persona);
        System.out.println("Peroona registrada correctamente");
    }

    public Persona getPersona() {
        return persona;
    }

    public Persona getPersona(String n, String p) {
        for (Persona per : personas) {

            if (per.getUsuario().equals(n) && per.getPassword().equals(p)) {
                return per;
            }
        }
        return null;
    }

}
