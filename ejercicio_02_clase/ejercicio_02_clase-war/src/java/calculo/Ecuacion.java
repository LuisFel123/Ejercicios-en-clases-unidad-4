package calculo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * Managed Bean para el cálculo de las raíces de una ecuación cuadrática.
 */
@Named(value = "ecuacion")
@SessionScoped
public class Ecuacion implements Serializable {

    private double ca = 0;  // Coeficiente a
    private double cb = 0;  // Coeficiente b
    private double cc = 0;  // Coeficiente c
    
    private double x1;  // Primera raíz
    private double x2;  // Segunda raíz

    public Ecuacion() {
    }

    // Getters y setters
    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getCb() {
        return cb;
    }

    public void setCb(double cb) {
        this.cb = cb;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    // Método para calcular las raíces
    public void calculos() {
        double rad;  // Discriminante
        rad = Math.pow(cb, 2.0) - 4 * cc* ca;  // Fórmula del discriminante

        if (rad > 0) {
            // Si el discriminante es positivo, hay dos raíces reales
            x1 = (-cb + Math.sqrt(rad)) / (2 * ca);
            x2 = (-cb - Math.sqrt(rad)) / (2 * ca);
        } else if (rad == 0) {
            // Si el discriminante es cero, hay una raíz doble
            x1 = x2 = -cb / (2 * ca);
        } else {
            // Si el discriminante es negativo, no hay raíces reales
            x1 = x2 = 0.0;  // Puedes modificar esto para manejar el caso de raíces complejas
        }
    }
}