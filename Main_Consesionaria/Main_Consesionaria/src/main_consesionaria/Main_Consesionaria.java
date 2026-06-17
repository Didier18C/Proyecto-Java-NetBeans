/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_consesionaria;

import javax.swing.JOptionPane;

/**
 *
 * @author CjKc
 */
public class Main_Consesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int X=0;
        X= Integer.parseInt(JOptionPane.showInputDialog("Hola que tal que desea hacer? 1.Actuar como consesionaria, 2.Actuar como vendedor, 3. Actuar como cliente"));
        switch (X)
        {
            case 1:
                    String Nombre,Ubicacion;
                    int Capacidad,Empleados;
                    Nombre = JOptionPane.showInputDialog("Dame el nombre de la consesionaria");
                    Ubicacion= JOptionPane.showInputDialog("Dame la ubicacion de esta");
                    Capacidad = Integer.parseInt(JOptionPane.showInputDialog("Dame La cantidad de carrasos mmdores que tiene tu taller brou Wazaaaaaaaa"));
                    Empleados= Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad de empleados que tiene tu super consesionaria WAZAAAAAA"));
                    Concesionario Con1 = new Concesionario(Nombre,Ubicacion,Capacidad,Empleados);       
                    int op1,Cont=0;
                    while(Cont==0 )
                    {
                        JOptionPane.showMessageDialog(null, "1.Vender, 2.Recibir Autor,3.Contratar Personal");
                        op1= Integer.parseInt(JOptionPane.showInputDialog("Que deseas hacer?"));
                        if(op1 ==1)
                        {
                            Con1.Vender();
                            Con1.Cobrar();
                        }
                        else if(op1 == 2)
                        {
                           Con1.RecibirAutos();
                        }
                        else if(op1 == 3)
                        {
                            Con1.ContratarPersonal();
                        }
                        else if(op1 == 4)
                        {
                            Cont=1;
                        }
                    }
        break;
            case 2:
                String ENombre,EPuesto,ETurno;
                int ENumeroSeguroSocial,EEdad; 
                ENombre= JOptionPane.showInputDialog(null, "Dame tu nombre empleado");
                EPuesto= JOptionPane.showInputDialog(null, "Dame tu puesto basura :v me puse belicon alv");
                ETurno = JOptionPane.showInputDialog("Dame el turno en el que laboras perro :v");
                ENumeroSeguroSocial= Integer.parseInt(JOptionPane.showInputDialog("Brindeme su edad buen hombre turururu"));
                EEdad = Integer.parseInt(JOptionPane.showInputDialog("Dame tu edad porfavar"));
                Vendedor Vendedor1 = new Vendedor(ENombre,EPuesto,ETurno,ENumeroSeguroSocial,EEdad);
                int Vv1=0;
                JOptionPane.showMessageDialog(null, "1. Dar informacion, 2. Tramites");
                int Contv=0;
                while(Contv==0)
                {
                    Vv1 = Integer.parseInt(JOptionPane.showInputDialog("Dime joven profeta de las ventas que deseas hacer?"));
                    if(Vv1 ==1)
                    {
                        Vendedor1.Dar_Informacion();
                    }
                    else if(Vv1==2)
                    {
                        Vendedor1.Tramites();
                    }
                    else if(Vv1==3)
                    {
                        Contv=1;
                    }
                }
        break;
            case 3:
                String CNombre,CIdentificacion;
                int CCarros,CDinero,CEdad,Dinero;
                CNombre = JOptionPane.showInputDialog("Dame tu nombre caballero distinguido que vino a esta empresa a no mas que enriquesernos de una manera mugrosa y asquerosa");
                CIdentificacion= JOptionPane.showInputDialog("Dame tu identificacion a 16 digitos porfavar");
                CCarros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Carros tiene usted por que somos ferrari ocupamos saber cuantos tiene si no no puede comprar lo matamos es mas si no tiene minimo 1 :v"));
                CEdad = Integer.parseInt(JOptionPane.showInputDialog("Digame su edad"));
                CDinero = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero tienes puto afloja la feria"));
                Cliente Cliente1 = new Cliente(CNombre,CIdentificacion,CEdad,CDinero,CCarros);
                int Va=0;
                int Cdesicion;
                while(Va==0)
                {
                    JOptionPane.showMessageDialog(null, "Sus opciones son: 1.Pagar, 2. Adquirir, 3.Devolver");
                    Cdesicion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?"));
                    if (Cdesicion ==1)
                    {
                        Cliente1.Pagar();
                    }
                    else if(Cdesicion ==2)
                    {
                        Cliente1.AdquirirVehiculo();
                    }
                    else if(Cdesicion ==3)
                    {
                        Cliente1.DevolverVehiculo();
                    }
                }
        
        }
          
        
    }
    
}
