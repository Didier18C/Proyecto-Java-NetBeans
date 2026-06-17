/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_consesionaria;

/**
 *
 * @author KcjC
 */
public class Cliente 
{
    private String Nombre,Identificacion;
    private int Carros,Dinero,Edad;

    public Cliente(String Nombre,String Identificacion ,int Edad, int Dinero, int Carros) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;
        this.Carros = Carros;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public int getCarros() {
        return Carros;
    }

    public void setCarros(int Carros) {
        this.Carros = Carros;
    }
    public void Pagar()
    {
        --Dinero;
    }
    public void AdquirirVehiculo()
    {
        this.Carros++;
    }
    public void DevolverVehiculo()
    {
        --Carros;
    }
    
    
}
