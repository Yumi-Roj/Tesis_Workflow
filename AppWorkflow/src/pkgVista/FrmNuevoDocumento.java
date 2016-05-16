/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author YUMI
 */
public class FrmNuevoDocumento extends javax.swing.JFrame {

    /**
     * Creates new form FrmNuevoDocumento
     */
    public FrmNuevoDocumento() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Asunto = new javax.swing.JTextField();
        txt_Destino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_remitente = new javax.swing.JTextField();
        txt_Cargo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_Modificar = new javax.swing.JButton();
        txt_Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Datos del Registro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        jLabel1.setText("Numero Expediente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, -1, -1));
        getContentPane().add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 92, 124, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Datos del Documento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 140, -1, -1));

        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 178, -1, -1));

        jLabel4.setText("Asunto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(txt_Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, -1));
        getContentPane().add(txt_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 315, 124, -1));

        jLabel5.setText("Destino");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 318, -1, -1));

        txt_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_remitenteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_remitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 274, 124, -1));
        getContentPane().add(txt_Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 314, 124, -1));

        jLabel14.setText("Cargo");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 317, -1, -1));

        jLabel3.setText("Remitente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 277, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Datos Administrado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, -1, -1));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_Guardar.setText("Grabar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 99, -1));

        btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 102, -1));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/document_preview.png"))); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 99, -1));

        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/dialog_close.png"))); // NOI18N
        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 117, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 120, 564, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 229, 564, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NUEVO DOCUMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));
        getContentPane().add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 133, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_remitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_remitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_remitenteActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        // TODO add your handling code here:
        txt_numero.setEnabled(true);
        txt_Fecha.setEnabled(true);
        txt_Asunto.setEnabled(true);
        txt_remitente.setEnabled(true);
        txt_Cargo.setEnabled(true);
        txt_Destino.setEnabled(true);
        
        txt_numero.setText("");
        txt_Asunto.setText("");
        txt_remitente.setText("");
        txt_Cargo.setText("");
        txt_Destino.setText("");
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // TODO add your handling code here:
        //FrmNuevoDocumento nuevoDoc = new FrmNuevoDocumento();
        pkgModelo.clsDAONuevoDocumento objNuevoDocumento;
        objNuevoDocumento = new pkgModelo.clsDAONuevoDocumento();
        objNuevoDocumento.setNumExpediente(txt_numero.getText().trim());
        //System.out.println("LA FECHA ES: " + txt_Fecha.getDateFormatString().trim());
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(txt_Fecha.getDate());
        System.out.println("LA FECHA ES: " + fecha);
        objNuevoDocumento.setFecha(fecha);
        objNuevoDocumento.setAsunto(txt_Asunto.getText().trim());
        objNuevoDocumento.setRemitente(txt_remitente.getText().trim());
        objNuevoDocumento.setCargo(txt_Cargo.getText().trim());
        objNuevoDocumento.setDestino(txt_Destino.getText().trim());
        objNuevoDocumento.insertarNuevoDocumento();
        JOptionPane.showMessageDialog(rootPane, "Datos correctos");
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevoDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_Asunto;
    private javax.swing.JTextField txt_Cargo;
    private javax.swing.JTextField txt_Destino;
    private com.toedter.calendar.JDateChooser txt_Fecha;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_remitente;
    // End of variables declaration//GEN-END:variables
}
