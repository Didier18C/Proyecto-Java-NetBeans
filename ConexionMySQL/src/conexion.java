
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Didier Canul
 */
public class conexion {
    String bd="Calificaion";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="didier12";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx=null;
    PreparedStatement ps=null;
    
    public conexion() 
    {
        
    }
    
    public Connection conectar()
    {
        try
        {
            Class.forName(driver); 
            cx=DriverManager.getConnection(url+bd,user, password);
            System.out.println("Se conectó a la BD");
            PreparedStatement consulta;
            consulta=cx.prepareStatement("SELECT matricula, contrasenia FROM estudiantes WHERE matricula = ?");
            consulta.setString(1, "21070006");
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next())
            {
                JOptionPane.showMessageDialog(null, resultado.getString("matricula")); 
                JOptionPane.showMessageDialog(null, resultado.getString("contrasenia")); 
            }
            
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("No se conectó a la BD");
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
        
    }
    
    public void desconectar() 
    {
        try 
        {
            cx.close();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
}

    
    

