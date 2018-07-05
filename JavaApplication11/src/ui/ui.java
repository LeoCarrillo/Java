/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import DATOS.DATO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import java.util.Scanner ; 
/**
 *
 * @author kevo
 */
public class ui extends javax.swing.JFrame {
    private PanamaHitek_Arduino ino = new PanamaHitek_Arduino ();
    private String dato = null;
    int numero = 0;
    double angulo =0;
    private SerialPortEventListener listener = new SerialPortEventListener (){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if(ino.isMessageAvailable()){
                     jTextField1.setText(ino.printMessage());
                     dato =  jTextField1.getText();
                     numero = Integer.parseInt(dato);    
                     n1 = String.valueOf(p1.contador);
                     angulo = Double.parseDouble(dato);
                     jTextField3.setText(ino.printMessage());
                        // jTextField6.setText(n1);
                         
                    // if(numero == 1){
                         
                        // p1.edad = Integer.parseInt(jTextField4.getText());
                        // p1.id = Integer.parseInt(jTextField2.getText());
                        // p1.nombre = jTextField3.getText();
                        // p1.fecha = Integer.parseInt(jTextField5.getText());
                       //  jTextField4.setText("");
                       //  jTextField3.setText("");
                       //  jTextField2.setText("");
                        // jTextField5.setText("");
                        // p1.contador++;
                        // n1 = String.valueOf(p1.contador);
                        // jTextField6.setText(n1);
                        //try {
                        //    try (FileWriter lector = new FileWriter("C:\\Users\\mejia\\Desktop\\images\\hola.txt", true)) {
                               // lector.write(p1.id + " " + p1.nombre + " " + p1.edad + " " + p1.fecha  +" \n");
                        //        lector.close();
                          //  }
                      //  } catch (IOException ex) {
                       //     Logger.getLogger(DATO.class.getName()).log(Level.SEVERE, null, ex);
                       // }
                    // }
                     //if(numero ==2){
                      //p1.contador = p1.contador-1;
                     // n1 = String.valueOf(p1.contador);
                      //   jTextField6.setText(n1);
                    // }
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    /**
     * Creates new form ui
     */
    ArrayList<DATO> person = new ArrayList();
    ArrayList<DATO> lista = new ArrayList();
    String linea;
    DATO p1= new DATO();
    String n1 = null;
    DATO p2= new DATO();
      int c =0;
    
    public ui() {
        try {
            ino.arduinoRXTX("COM32", 9600, listener);
        } catch (ArduinoException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.setText("0");

        jButton1.setText("Calcular");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("0");
        jLabel1.setMaximumSize(new java.awt.Dimension(70, 110));

        jLabel3.setText("Angulo");

        jLabel4.setText("Lado");

        jLabel6.setText("Resultado");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adyacente", "Opuesto" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextField3.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel6)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                   // TODO add your handling code here:
               //    try {
            
           // FileReader lector = new FileReader("C:\\Users\\mejia\\Desktop\\images\\hola.txt");
            
           // BufferedReader bufer = new BufferedReader (lector);//buferr para leer lineas archivo de texto
            //declaracion de datos  
            
            
           // while((linea = bufer.readLine())!= null){
           //     String datos = linea;
             //   String[] arrayespacios = datos.split(" ");
            //    p1.ids = arrayespacios[0];
            //    p1.nombres = arrayespacios[1];
            //    p1.edades = arrayespacios[2];
             //   p1.fechas = arrayespacios[3];
             //   person.add(p1);
              //  c++;
              //  p1.contador++;
              //  n1 = String.valueOf(p1.contador);
           //     jTextField6.setText(n1);
          //  }
         //   lector.close();
            // TODO add your handling code here:
       // } catch (FileNotFoundException ex) {
          //  Logger.getLogger(DATO.class.getName()).log(Level.SEVERE, null, ex);
       // } catch (IOException ex) {
          //  Logger.getLogger(DATO.class.getName()).log(Level.SEVERE, null, ex);
      //  }        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double i =0 ;
        
        String resultado = (String)jComboBox1.getSelectedItem();
        if("Adyacente".equals(resultado)){
            i = Double.parseDouble(jTextField2.getText());
            jTextField2.setText("");
            jLabel1.setText(String.valueOf(p2.Opuesto(angulo,i)));
        }
        if("Opuesto".equals(resultado)){
            i = Double.parseDouble(jTextField2.getText());
            jTextField2.setText("");
            jLabel1.setText(String.valueOf(p2.Adyacente(angulo,i)));
        }
        double opuesto=0;
        double adyacente =0;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
