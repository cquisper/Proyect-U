package modelo;
/**
 * @author prueb
 */
public class CalculoCinematico {

    private String magnitud;
    
    /*METODOS O FUNCIONES QUE DETERMINAN EL TIEMPO, DISTANCIA, VELOCIDAD, VELOCIDAD 
    INSTANTANEA Y ACELERACION,CADA FUNCION EMPLEA UNA O VARIAS FORMULA
    */
    
    //METODO CONSTRUCTOR QUE RECIBE COMO PARAMETRO LA MAGNITUD
    public CalculoCinematico(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getMagnitud() {
        return magnitud;
    }
    
    //FUNCION QUE CONTIENE LAS FORMULAS DEL MRUV 
    public float calculo(String valor1, String valor2, String valor3) {
        if (getMagnitud().equals("tiempo")) {
            return detTiempo(valor2, valor3);
        } else if (getMagnitud().equals("kilometraje")) {
            return detDistancia(valor3, valor1);
        } else if (getMagnitud().equals("velocidad")) {
            return detVelocidadF(valor3, valor1);
        } else if (getMagnitud().equals("aceleracion")) {
            return detAceleracion(valor2, valor1);
        }
        return -1; // -1 = no hay mruv
    }
    //FUNCION QUE DETERMINA EL TIEMPO
    private float detTiempo(String velocidad, String aceleracion) {
        float vf = Float.parseFloat(velocidad);
        float a = Float.parseFloat(aceleracion);

        if (a != 0) {
            return vf / a;
        }
        
        return -2; // la aceleracion es 0, -2 = vf es constante
    }
    //FUNCION QUE DETERMINA LA DISTANCIA
    private float detDistancia(String aceleracion, String tiempo) {
        float a = Float.parseFloat(aceleracion);
        float t = Float.parseFloat(tiempo);

        if (a != 0 && t != 0) {
            return (a / 2) * (t * t);
        } else if (a == 0) { //4 36 5
            return -2;
        }
        
        return -1;
    }
    //FUNCION QUE DETERMIN LA VELOCIDAD
    private float detVelocidadF(String aceleracion, String tiempo) {
        float a = Float.parseFloat(aceleracion);
        float t = Float.parseFloat(tiempo);

        if (a != 0 && t != 0) {
            return (a * t); // at
        } else if (a == 0) {
            return -2;
        }
        return -1;
    }
    //FUNCION QUE DETERMINA LA ACELERACIÓN
    private float detAceleracion(String velocidad, String tiempo) {
        float vf = Float.parseFloat(velocidad);
        float t = Float.parseFloat(tiempo);

        if (t != 0) {
            return vf / t;
        }

        return -1;
    }

    //FUNCION QUE DETERMINA LA VE INSTANTANEA, INDEPENDIENTE AL METODO CALCULO()
    public float detVelocidadInstantanea(String valor1, String valor2, String valor3) {
        float tiempo;
        float aceleracion;
        float resultado;
        //x(t) = 1/2at +2t
        //x'(t) = v(t) = at + 2
        if (getMagnitud().equals("tiempo")) {
            tiempo = detTiempo(valor2, valor3);
            aceleracion = Float.parseFloat(valor3);
            resultado = (aceleracion * tiempo) + 2;
            return resultado;
        } else if (getMagnitud().equals("kilometraje")) {
            tiempo = Float.parseFloat(valor1);
            aceleracion = Float.parseFloat(valor3);
            resultado = (aceleracion * tiempo) + 2;
            return resultado;
        } else if (getMagnitud().equals("velocidad")) {
            tiempo = Float.parseFloat(valor1);
            aceleracion = Float.parseFloat(valor3);
            resultado = (aceleracion * tiempo) + 2;
            return resultado;
        } else if (getMagnitud().equals("aceleracion")) {
            tiempo = Float.parseFloat(valor1);
            aceleracion = detAceleracion(valor2, valor1);
            resultado = (aceleracion * tiempo) + 2;
            return resultado;
        }
        return -1;
    }
}
