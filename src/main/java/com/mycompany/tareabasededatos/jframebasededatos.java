/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareabasededatos;

import com.mycompany.tareabasededatos.conecciones.mysqlconector;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author herna
 */
public class jframebasededatos extends javax.swing.JFrame {

    mysqlconector conector = new mysqlconector();
    Connection conexion = conector.conectar();
    

    /**
     * Creates new form jframebasededatos
     */
    public jframebasededatos() {
        initComponents();
        mostrardatos();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        guardarbtn = new javax.swing.JButton();
        modificarbtn = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        nombretxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        diretxt = new javax.swing.JTextField();
        teltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblperson = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("APELLIDO:");

        jLabel3.setText("DIRECCION:");

        jLabel4.setText("TELEFONO:");

        guardarbtn.setText("GUARDAR");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });

        modificarbtn.setText("MODIFICAR");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        eliminarbtn.setText("ELIMINAR");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("INGRESE DATOS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(apellidotxt)
                    .addComponent(jLabel4)
                    .addComponent(diretxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarbtn)
                        .addGap(18, 18, 18)
                        .addComponent(modificarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarbtn))
                    .addComponent(teltxt))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarbtn)
                    .addComponent(modificarbtn)
                    .addComponent(eliminarbtn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        salir.setBackground(new java.awt.Color(255, 51, 0));
        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        tblperson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblperson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        // TODO add your handling code here:
        modificarpersona();
        mostrardatos();
        limpiar();
       
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        // TODO add your handling code here:
        guardarpersona();
   
        limpiar();
        mostrardatos();
        
    }//GEN-LAST:event_guardarbtnActionPerformed
   
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        // TODO add your handling code here:
        eliminar();
        mostrardatos();
        limpiar();
        
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void tblpersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpersonMouseClicked
        // TODO add your handling code here:
        int row1=  tblperson.rowAtPoint(evt.getPoint());
        nombretxt.setText(tblperson.getValueAt(row1, 1).toString());
        apellidotxt.setText(tblperson.getValueAt(row1, 2).toString());
        diretxt.setText(tblperson.getValueAt(row1, 3).toString());
        teltxt.setText(tblperson.getValueAt(row1, 4 ).toString());
    }//GEN-LAST:event_tblpersonMouseClicked

    /**
     * @param args the command line arguments
     */
     private void mostrardatos(){
        try{
            String[] titulos = {"ID","NOMBRE","APELLIDO","DIRECCION","TELEFONO"};
             String[] registros = new String[5];
            DefaultTableModel model = new DefaultTableModel(null,titulos);
            String consulta = "SELECT * FROM `tab`";
            Statement at = conexion.createStatement();
            ResultSet result = at.executeQuery(consulta);
            
            while(result.next()){
                registros[0]=result.getString("ID");
                registros[1]=result.getString("NOMBRE");
                registros[2]=result.getString("APELLIDO");
                registros[3]=result.getString("DIRECCION");
                registros[4]=result.getString("TELEFONO");
                model.addRow(registros);
                
            
            }
            tblperson.setModel(model);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrat Datos");
        }
    }
    private void guardarpersona() {

        try {
            person newperson = new person();
            newperson.setName(nombretxt.getText().toString());
            newperson.setSurname(apellidotxt.getText().toString());
            newperson.setAddress(diretxt.getText().toString());
            newperson.setPhone(teltxt.getText().toString());
            
            String insert="INSERT INTO `tab` (`NOMBRE`, `APELLIDO`, `DIRECCION`, `TELEFONO`)"
                    +"VALUES (?, ?, ?, ?);"; 
            PreparedStatement pst = conexion.prepareStatement(insert);
            pst.setString(1, newperson.getName());
            pst.setString(2, newperson.getSurname());
            pst.setString(3, newperson.getAddress());
            pst.setString(4, newperson.getPhone());
            pst.execute();
            
             JOptionPane.showMessageDialog(null, "Guardado con Exito");

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al guardar");

        }

       

    }
      private void modificarpersona() {

        try {
            person newperson = new person();
            newperson.setName(nombretxt.getText().toString());
            newperson.setSurname(apellidotxt.getText().toString());
            newperson.setAddress(diretxt.getText().toString());
            newperson.setPhone(teltxt.getText().toString());
            
            int row1=tblperson.getSelectedRow();
            String id =tblperson.getValueAt(row1, 0).toString();
            
            String insert="UPDATE `tab` SET"
                    + "`NOMBRE` = ?,"
                    + "`APELLIDO` = ?, "
                    + "`DIRECCION` = ?, "
                    + "`TELEFONO` = ? "
                    + "WHERE ID = ? ";
            PreparedStatement pst = conexion.prepareStatement(insert);
            pst.setString(1, newperson.getName());
            pst.setString(2, newperson.getSurname());
            pst.setString(3, newperson.getAddress());
            pst.setString(4, newperson.getPhone());
            pst.setString(5, id);
            pst.execute();
            
             JOptionPane.showMessageDialog(null, "Actualizado con Exito");

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al Actualizar");

        }

       

    }
     
    private void eliminar(){
        try{
            String delete= "DELETE FROM `tab` WHERE `tab`.`ID` = ?";
            int row1=tblperson.getSelectedRow();
            String id =tblperson.getValueAt(row1, 0).toString();
            PreparedStatement pst=conexion.prepareStatement(delete); 
            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se elimino con exito");
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al Eliminar");
        
        }
    }

    private void limpiar() {
        nombretxt.setText("");
        apellidotxt.setText("");
        diretxt.setText("");
        teltxt.setText("");
    }

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
            java.util.logging.Logger.getLogger(jframebasededatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframebasededatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframebasededatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframebasededatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframebasededatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField diretxt;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JButton salir;
    private javax.swing.JTable tblperson;
    private javax.swing.JTextField teltxt;
    // End of variables declaration//GEN-END:variables
}
