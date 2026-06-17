/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo_volumenes;

/**
 *
 * @author jorge
 */
public class Calcular 
{
    //Creación de métodos estáticos para calcular el volumen
    public static double Calvol(double A1)
    {
        double A2;
        A2= ((4/3)*Math.PI*(A1*A1*A1));
        return A2;
    }
    public static double Calvol(int A1)
    {
        double V2;
        V2 = Math.pow(A1, 3);
        return V2;
    }
    public static double Calvol(double a1,double a2,double a3)
    {
        double v1;
        v1= a1*a2*a3;
        return v1;
    }
}
