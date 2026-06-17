/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_consesionaria;

import javax.swing.JOptionPane;

/**
 *
 * @author KcJc
 */
public class Vendedor 
{
    private String Nombre,Puesto,Turno;
    private int NumeroSeguro,Edad;

    public Vendedor(String Nombre, String Puesto, String Turno, int NumeroSeguro, int Edad) {
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Turno = Turno;
        this.NumeroSeguro = NumeroSeguro;
        this.Edad = Edad;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getNumeroSeguro() {
        return NumeroSeguro;
    }

    public void setNumeroSeguro(int NumeroSeguro) {
        this.NumeroSeguro = NumeroSeguro;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public String Dar_Informacion()
    {
        String V_Inf;
        V_Inf = JOptionPane.showInputDialog(null,"Proporciona la informacion competente");
        return V_Inf;
    }
    public void Tramites()
    {
        JOptionPane.showMessageDialog(null,"El auto ya es tuyo");
    }
    
}
