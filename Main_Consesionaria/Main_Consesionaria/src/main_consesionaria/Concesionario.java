/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_consesionaria;

/**
 *
 * @author KcJc
 */
public class Concesionario 
{
    public String NombreCons,Ubicacion;
    public int Capacidad_Autos,Empleados,Dinero;

    public Concesionario(String NombreCons, String Ubicacion, int Capacidad_Autos, int Empleados) {
        this.NombreCons = NombreCons;
        this.Ubicacion = Ubicacion;
        this.Capacidad_Autos = Capacidad_Autos;
        this.Empleados = Empleados;
    }

    public String getNombreCons() {
        return NombreCons;
    }

    public void setNombreCons(String NombreCons) {
        this.NombreCons = NombreCons;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getCapacidad_Autos() {
        return Capacidad_Autos;
    }

    public void setCapacidad_Autos(int Capacidad_Autos) {
        this.Capacidad_Autos = Capacidad_Autos;
    }

    public int getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(int Empleados) {
        this.Empleados = Empleados;
    }
    
    public void Vender()
    {
        --Capacidad_Autos;
    }
    public void RecibirAutos()
    {
        ++Capacidad_Autos;
    }
    public void ContratarPersonal()
    {
        ++Empleados;
    }
    public void Cobrar()
    {
     ++Dinero;   
    }
}
