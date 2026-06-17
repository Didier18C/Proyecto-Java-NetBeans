package Paquete;

/*
 * @author didier
 */

public class Datos {

// Variables  para almacenar los valores de voltaje, corriente, resistencia y potencia
float v, i, r, p;

// Función para calcular el voltaje
float voltaje(float i, float r) {
    // Asignamos los valores de corriente y resistencia a las variables
    this.i = i;
    this.r = r;
    // Calculamos el voltaje utilizando la ley de Ohm (V = I * R)
    v = i * r;
    // Devolvemos el valor del voltaje calculado
    return v;

}

// Función para calcular la corriente
float corriente(float v, float r) {
    // Asignamos los valores de voltaje y resistencia a las variables 
    this.v = v;
    this.r = r;
    // Calculamos la corriente utilizando la ley de Ohm (I = V / R)
    i = v / r;
    // Devolvemos el valor de la corriente calculada
    return i;
}

// Función para calcular la resistencia
float resistencia(float v, float i) {
    // Asignamos los valores de voltaje y corriente a las variables 
     System.out.println("Calculando resistencia con voltaje: " + v + " V y corriente: " + i + " A");
    this.v = v;
    this.i = i;
    // Calculamos la resistencia utilizando la ley de Ohm (R = V / I)
    r = v / i;
    // Devolvemos el valor de la resistencia calculada
    
     System.out.println("Resistencia calculada: " + r + " Ω");
    return r;
}
}
