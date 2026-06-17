package Paquete;

/*
 * @author didier
 */

//Librerías que se utilizaron
import javax.swing.JOptionPane;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calcular extends javax.swing.JFrame {

    Datos ohm = new Datos(); //Datos para acceder a sus métodos y atributos
    float voltaje, corriente, resistencia; // Variables para almacenar los valores de voltaje, corriente y resistencia
    int index = 0;
    
    String mensaje = "";
    String poten = "";

    //Constructor
    public Calcular() {
        initComponents();
        
        this.setLocationRelativeTo(null);   //La interfaz salga en el centro del monitor*/
        this.setVisible(true);  //Hago visible la interfaz  para poder verla*/
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProceso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        txtitulo = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProceso.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ley de Ohm");

        javax.swing.GroupLayout panelProcesoLayout = new javax.swing.GroupLayout(panelProceso);
        panelProceso.setLayout(panelProcesoLayout);
        panelProcesoLayout.setHorizontalGroup(
            panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProcesoLayout.setVerticalGroup(
            panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Dato a calcular");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voltaje", "Corriente", "Resistencia" }));
        combo.setFocusable(false);
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        v1.setForeground(new java.awt.Color(0, 0, 0));
        v1.setText("Corriente:   ");

        v2.setForeground(new java.awt.Color(0, 0, 0));
        v2.setText("Resistencia:   ");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        calcular.setText("Calcular");
        calcular.setFocusable(false);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar en PDF");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        txtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtituloActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Título:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nota: Una vez guardado el archivo, no se podrá editar de nuevo");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("      Guarde su archivo");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(v2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)))))))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcular)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
       //Datos del combobox
        index = combo.getSelectedIndex();
        if (index == 0) {
            //Por defecto calcula la voltaje
            v1.setText("Corriente: ");
            v2.setText("Resistencia: ");
            
        } else if (index == 1) {//si no... En la segunda opcióon del combobox, es para calcular la corriente
            v1.setText("Voltaje: ");
            v2.setText("Resistencia: ");
            
    
        } else if (index == 2) { //Si no...  En la tercera opción, es para calcular la resistencia
            v1.setText("Voltaje: ");
            v2.setText("Corriente: ");

        }

    }//GEN-LAST:event_comboActionPerformed

    public String Calculo;
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
       try  {
           String instruccion = "Con los datos ingresados, calcula lo siguiente";
        switch (index) {//Utilizamos el switch para saber que tipo de caso se usará

            case 0:// Este sería el que esta por defecto
                corriente = Float.parseFloat(t1.getText());
                resistencia = Float.parseFloat(t2.getText());
                voltaje = ohm.voltaje(corriente, resistencia);
              
                mensaje ="Datos ingresados:\nCorriente: " + corriente + ""
                        + " A\nResistencia: " + resistencia + " Ω\n\nDatos obtenidos:\n"
                        
                        + "Voltaje:  " + voltaje + " V\n" + poten;
             mensaje = instruccion + "\nDatos ingresados:\nCorriente: " + corriente + " A\nResistencia: " + resistencia + " Ω\n\nDatos obtenidos:\nVoltaje: " + voltaje + " V\n" + poten;
                
                
                break;

            case 1:// Este sería el caso 1
                voltaje = Float.parseFloat(t1.getText());
                resistencia = Float.parseFloat(t2.getText());
                if(resistencia!=0){
                corriente = ohm.corriente(voltaje, resistencia);
             
                mensaje = "Datos ingresados:\nVoltaje: " + voltaje + ""
                        + " V\nResistencia: " + resistencia + " Ω\n\nDatos obtenidos:\n"
                        + "Corriente:  " + corriente + " A\n" + poten;
                }else{
                JOptionPane.showMessageDialog(null,"La resistencia debe ser distinta de cero","Error de dato",JOptionPane.WARNING_MESSAGE);
                
                }
                break;
                
              case 2://Este sería para el caso 2
                voltaje = Float.parseFloat(t1.getText());
                corriente = Float.parseFloat(t2.getText());
                if(corriente!=0){
                resistencia = ohm.resistencia(voltaje, corriente);
               
                mensaje = "Datos ingresados:\nVoltaje: " + voltaje + ""
                        + " V\nCorriente: " + corriente+ " A\n\nDatos obtenidos:\n"
                        + "Resistencia:  " + resistencia + " Ω\n" + poten;
                //Rstricción
                }else{
                JOptionPane.showMessageDialog(null,"La corriente debe ser distinta de cero","Error de dato",JOptionPane.WARNING_MESSAGE);
                
                }
                break;
                
              }
        area.setText(mensaje);      //Mensaje de que no hay valores en el panel, por ende, no se puede calcular
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"No hay datos para calcular","Error",JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_calcularActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
      

//Mensaje: No se pódra guardar el archivo si no hay nada que guardar
        if (area.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese valores para poder crear su archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        
    } else {// Si no... Mensaje: El archivo necesita su nombre para poder crearse
            
        if(txtitulo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this,"El archivo requiere un titulo.", "Avertencia", JOptionPane.ERROR_MESSAGE);
        } else{
        OpcionCrear();
        OpcionCargar();
        
         //Con esto se eliminan los valores que estan en la interfaz
           area.setText("");
           t1.setText("");
           t2.setText("");
           txtitulo.setText("");
            }                                                                             
     
         }
        
    }
 private void OpcionCargar()
         //Parámetros para cargar el documento
    {
        try {
     String n1 = this.txtitulo.getText()+".pdf";
     File path = new File (n1);
     Desktop.getDesktop().open(path);
        }catch (IOException ex) {
         ex.printStackTrace();
    }
    }
 
    
    private void OpcionCrear() 
    {
        //Parámetros para crear el archivo
        try {
            Document document = new Document();
            String dest = this.txtitulo.getText()+".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
            
            String titulo =this.txtitulo.getText();
            Phrase header = new Phrase(this.area.getText());
            document.add(header);
             
            document.close();
            
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Calcular.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Calcular.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void txtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtituloActionPerformed
    
    public static void main(String[] args) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcular().setVisible(true);
             }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextArea area;
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelProceso;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtitulo;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables

}
