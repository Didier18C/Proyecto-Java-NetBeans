/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 * Método principal para reproducir un sonido de piano.
 */
public class Tarea_Poliformismo 
{
 public static void ReproducirSonido()
    {
        //Método sobrecargado para reproducir un sonido de piano
        JOptionPane.showMessageDialog(null, "¡Sonido de piano!");
    }
 public static void ReproducirSonido(int e)
    {
        //Método sobrecargado para reproducir un sonido de tambor.
     JOptionPane.showMessageDialog(null, "¡Sonido de guitarra!");
    }
 public static void ReproducirSonido(String e)
 {
     //Método sobrecargado para reproducir un sonido de tambor.
     JOptionPane.showMessageDialog(null, "¡Sonido de tambor!");
 }
}
