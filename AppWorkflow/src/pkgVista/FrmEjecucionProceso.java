/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pkgControlador.clsConecta;
/**
 *
 * @author YUMI
 */
public class FrmEjecucionProceso extends javax.swing.JFrame {
    private javax.swing.DefaultComboBoxModel modeloCboProcesos;
    private javax.swing.DefaultComboBoxModel modeloCboAres;
     private JCheckBox rowCheck;
    DefaultTableModel model;
    Connection Conn;
    Statement sent;
    ResultSet rs;
    clsConecta conectar;
    String actividad;
    /**
     * Creates new form FrmEjecucionProceso
     */
    public FrmEjecucionProceso() {
        modeloCboProcesos = new javax.swing.DefaultComboBoxModel(new String[] {});
        modeloCboAres = new javax.swing.DefaultComboBoxModel(new String[] {});
        initComponents();
        LlenarComboboxProcesos();
        LlenarComboboxAreas();
        llenarGrilla();
//        tabla_actividades.setModel(model);
//        model.addColumn("Selec");
//        model.addColumn("Nombre");
//        tabla_actividades.getColumnModel().getColumn(0).setCellEditor( new Clase_CellEditor() );
//        tabla_actividades.getColumnModel().getColumn(0).setCellRenderer(new Clase_CellRender() );
        //LlenarActividadporProceso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        btn_BuscarExpediente = new javax.swing.JButton();
        cbo_Procesos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_NumExpediente = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_EjecucionProceso = new javax.swing.JTable();
        btn_nuevoEjecucion = new javax.swing.JButton();
        btn_ModificarH = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_restricciones = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_actividades = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbo_areas = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_BuscarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/document_preview.png"))); // NOI18N
        btn_BuscarExpediente.setText("Buscar");
        btn_BuscarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarExpedienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BuscarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, -1, -1));

        cbo_Procesos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Certificado y/o constancia de contribuyente", "Fraccionamiento de pagos por deudas menores a 2UIT", "Fraccionamiento de pagos por deudas mayores a 2UIT", "Item 3", "Item 4" }));
        cbo_Procesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ProcesosActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Procesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 294, -1));

        jLabel2.setText("Nombre Proceso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 63, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EJECUCION PROCESO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 793, 11));

        jLabel7.setText("Numero de Expediente");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));
        getContentPane().add(txt_NumExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, -1));

        tabla_EjecucionProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero Documento", "Asunto", "Fecha", "Proceso"
            }
        ));
        tabla_EjecucionProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_EjecucionProcesoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabla_EjecucionProceso);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1070, 170));

        btn_nuevoEjecucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_nuevoEjecucion.setText("Nuevo");
        btn_nuevoEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoEjecucionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 210, 110, -1));

        btn_ModificarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_select_all.png"))); // NOI18N
        btn_ModificarH.setText("Modificar");
        btn_ModificarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarHActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ModificarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 250, 110, -1));

        tabla_restricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Restricciones", "Validar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_restricciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_restriccionesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabla_restricciones);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 390, 140));

        tabla_actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null}
            },
            new String [] {
                "Actividades", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_actividadesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabla_actividades);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 330, 130));

        jButton1.setText("Rellenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        cbo_areas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_areasActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_areas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 230, -1));

        jLabel3.setText("Area");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void iniCboProcesos() {

        pkgControlador.clsConecta BD = new pkgControlador.clsConecta();
        ResultSet resul;
        try {
            //BD.clsConecta();
            resul = BD.getSql("SELECT id_procesos,nombre_procesos,tipo FROM procesos ORDER BY id_procesos");

            modeloCboProcesos.addElement("[ Elije un Proceso ]");
            //Llenamos con datos el JComboBox
            while(resul.next())
                modeloCboProcesos.addElement(resul.getString("nombre_procesos"));
            
            cbo_Procesos.setModel(modeloCboProcesos);
        } catch (Exception e) {
        }
       // BD.cerrar();

    }
    void LlenarComboboxProcesos(){
 
        try {
            Conn = clsConecta.getConnection();
            String sql = "SELECT id_procesos,nombre_procesos,tipo FROM procesos ORDER BY id_procesos";
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            modeloCboProcesos.addElement("[ Elije un Proceso ]");
            while (rs.next()) {
                modeloCboProcesos.addElement(rs.getString("nombre_procesos"));
                cbo_Procesos.setModel(modeloCboProcesos);
//               String tmpStrObtenido = rs.getString("nombre_procesos");
//               cbo_Procesos.addItem(makeObj(tmpStrObtenido));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     void LlenarComboboxAreas(){
 
        try {
            Conn = clsConecta.getConnection();
            String sql = "select nombre_area from area ORDER BY  id_area";
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            modeloCboAres.addElement("[ Elije un area ]");
            while (rs.next()) {
                modeloCboAres.addElement(rs.getString("nombre_area"));
                cbo_areas.setModel(modeloCboAres);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    private Object makeObj(final String item)  {
     return new Object() { public String toString() { return item; } };
   }
    
    private void btn_nuevoEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoEjecucionActionPerformed
        // TODO add your handling code here:
        txt_NumExpediente.setText("");
    }//GEN-LAST:event_btn_nuevoEjecucionActionPerformed

    private void btn_BuscarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarExpedienteActionPerformed
        // TODO add your handling code here:
        try {
            conectar = new clsConecta();
            //Conn = clsConecta.getConnection();
            String codBuscar = "";
            codBuscar = (txt_NumExpediente.getText()); 
            //codBuscar = JOptionPane.showInputDialog("Ingrese el codigo a Buscar: ");
            rs = conectar.consulta("select numero_expediente from documento");
            boolean encontro = false;

            while (rs.next()) {
                if (codBuscar.equals(rs.getObject("numero_expediente"))) {
                    encontro = true;
                    break;
                }
            }
//            String SQL = "SELECT id_documento,numero_expediente,asunto,fecha,destino,remitente FROM documento where numero_expediente = '" + codBuscar + "'";
            
            String SQL = "SELECT DISTINCT documento.numero_expediente, \n"
                    + "procesos.nombre_procesos,procesos.estado,\n"
                    + "actividad_por_proceso.posicion, actividad_por_proceso.descripcion, actividad_por_proceso.area_responsable, actividad_por_proceso.tiempo,\n"
                    + "restricciones_por_actividad.codigo_restriccion,restricciones_por_actividad.descripcion,\n"
                    + "encargado_actividad.nombre\n"
                    + "FROM procesos\n"
                    + "inner JOIN documento ON documento.id_procesos = procesos.id_procesos\n"
                    + "inner JOIN actividad_por_proceso ON actividad_por_proceso.id_actividad = procesos.id_actividad\n"
                    + "inner JOIN encargado_actividad ON actividad_por_proceso.id_actividad = actividad_por_proceso.id_actividad\n"
                    + "inner JOIN restricciones_por_actividad ON restricciones_por_actividad.id_restriccion = actividad_por_proceso.id_restriccion\n"
                    + "where numero_expediente = '" + codBuscar + "' ";

            model = conectar.retornarDatosTabla(SQL);
            tabla_EjecucionProceso.setModel(model);
            //jScrollPane2.getViewport().add(tabla_EjecucionProceso);
            if (encontro == false) {
                //JOptionPane.showMessageDialog(null, "no existe proceso Buscado");
            }
           //tabla_EjecucionProceso.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }
    }//GEN-LAST:event_btn_BuscarExpedienteActionPerformed

    private void btn_ModificarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ModificarHActionPerformed
    
    private void cbo_ProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ProcesosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formWindowOpened
    
    void llenarGrilla(){
    try {
            conectar = new clsConecta();
            String area = "";
            area = cbo_areas.getSelectedItem().toString();
            //Conn = clsConecta.getConnection();
            String codBuscar = "";
            codBuscar = (txt_NumExpediente.getText()); 
            //codBuscar = JOptionPane.showInputDialog("Ingrese el codigo a Buscar: ");
            rs = conectar.consulta("select numero_expediente from documento");

            boolean encontro = false;

            while (rs.next()) {
                if (codBuscar.equals(rs.getObject("numero_expediente"))) {
                    encontro = true;
                    break;
                }
            }
          
            String SQL = "select numero_doc2, asunto, fecha, proceso \n"
                    + "from  documento2 where siguiente = '" + area + "'";

            model = conectar.retornarDatosTabla(SQL);
            tabla_EjecucionProceso.setModel(model);
            //jScrollPane2.getViewport().add(tabla_EjecucionProceso);

            if (encontro == false) {
                //JOptionPane.showMessageDialog(null, "no existe proceso Buscado");
            }
            //tabla_EjecucionProceso.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }
    }
    //seleccion del fila del proceso y se carga las actividades de este
      void LlenarActividadporProceso2(String strProceso) {
        int numCol = 0, columBoolean = 0;

        try {
            Conn = clsConecta.getConnection();

            String[] titulos = {"Actividades", "Estado"};
            int i = tabla_EjecucionProceso.getSelectedRow();
            if (i != -1) {
                strProceso = tabla_EjecucionProceso.getValueAt(i, 3).toString().trim();
                String sql = "select id_proceso2 from proceso2 where nombre_proceso2 = '" + strProceso + "'";
                ResultSet rs = sent.executeQuery(sql);

                int id_pro = 0;

                while (rs.next()) {
                    id_pro = Integer.parseInt(rs.getString("id_proceso2"));
                }

                System.out.print(id_pro);

                sql = "select actividad, estado from actividades_proceso2 where id_proceso = '" + id_pro + "'";

                model = new DefaultTableModel(null, titulos);
                sent = Conn.createStatement();
                rs = sent.executeQuery(sql);
                Object[] filas = new Object[2];
                while (rs.next()) {

                    filas[0] = rs.getString("actividad");
                    filas[1] = Boolean.FALSE;
                    //fila[1] = rs.getString("estado");
                    model.addRow(filas);
                }
            }
            tabla_actividades.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
    void LlenarActividadporProceso(String strProceso){
        
        try {
            Conn = clsConecta.getConnection();

            String[] titulos = {"Actividades","Estado"};
            int i = tabla_EjecucionProceso.getSelectedRow();
            if (i != -1) {
                strProceso = tabla_EjecucionProceso.getValueAt(i,3).toString().trim();
                String sql = "select id_proceso2 from proceso2 where nombre_proceso2 = '" + strProceso + "'";
                ResultSet rs = sent.executeQuery(sql);
                
                int id_pro = 0;
                
                while (rs.next()) 
                {
                    id_pro = Integer.parseInt(rs.getString("id_proceso2"));
                }
                
                System.out.print(id_pro);
                                
                sql = "select actividad, estado from actividades_proceso2 where id_proceso = '" + id_pro + "' order by actividad";
 		
                DefaultTableModel modelo = (DefaultTableModel) tabla_actividades.getModel();

                sent = Conn.createStatement();
                rs = sent.executeQuery(sql);
                //Object[] filas = new Object[2];
                String fila[] = new String[2];
                while (rs.next()) {
                    
                    fila[0] = rs.getString("actividad");
                    fila[1] = rs.getString("estado");
                    modelo.addRow(new String[]{fila[0],fila[1]});
                }
            }
//            tabla_actividades.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void LlenarRestriccionesActividad() {

        try {
            Conn = clsConecta.getConnection();
            String strActividad = "";
            //codActividad = (txt_CodigoActividad.getText()); 
            String[] titulos = {"Restricciones", "Estado"};
            //int selectedIndex = lstPacientes.getSelectedIndex();
            int i = tabla_actividades.getSelectedRow();
            if (i != -1) {
                strActividad = tabla_actividades.getValueAt(i, 0).toString().trim();
                String sql = "select id_proceso from actividades_proceso2 where actividad = '" + strActividad + "'";
                ResultSet rs = sent.executeQuery(sql);
                int id_act = 0;

                while (rs.next()) {
                    id_act = Integer.parseInt(rs.getString("id_proceso"));
                }

                System.out.print(id_act);

                sql = "select descripcion, estado from restricciones_por_actividad where codigo_restriccion = '" + id_act + "'";

                model = new DefaultTableModel(null, titulos);
                sent = Conn.createStatement();
                rs = sent.executeQuery(sql);

                Object[] fila = new Object[2];

                while (rs.next()) {
                    //fila[0] = rs.getString("id_restriccion");
                    fila[0] = rs.getString("descripcion");
                    fila[1] = Boolean.FALSE;

                    model.addRow(fila);

                }
            }
            tabla_restricciones.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //selccion de la fila actividades y se carga sus restricciones 

    void llenarRestrccion(String restriccion) {
        try {
            Conn = clsConecta.getConnection();

            String[] titulos = {"Restricciones"};
            String sql = "select descripcion from restricciones_por_actividad where descripcion = '" + restriccion + "'";
            model = new DefaultTableModel(null, titulos);
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            String fila[] = new String[3];

            while (rs.next()) {
                //fila[0] = rs.getString("id_restriccion");
                fila[0] = rs.getString("descripcion");

                model.addRow(fila);

            }
            tabla_restricciones.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            conectar = new clsConecta();
            String codBuscar = "";
            codBuscar = (txt_NumExpediente.getText()); 
            rs = conectar.consulta("select numero_expediente from documento");
            boolean encontro = false;

            while (rs.next()) {
                if (codBuscar.equals(rs.getObject("numero_expediente"))) {
                    encontro = true;
                    break;
                }
            }
//            String SQL = "SELECT id_documento,numero_expediente,asunto,fecha,destino,remitente FROM documento where numero_expediente = '" + codBuscar + "'";
          
            String SQL = "select numero_doc2, asunto, fecha, proceso from  documento2";

            model = conectar.retornarDatosTabla(SQL);
            tabla_EjecucionProceso.setModel(model);
            //jScrollPane2.getViewport().add(tabla_EjecucionProceso);
            if (encontro == false) {
                //JOptionPane.showMessageDialog(null, "no existe proceso Buscado");
            }
           //tabla_EjecucionProceso.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbo_areasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_areasActionPerformed
        // TODO add your handling code here:
        llenarGrilla();
    }//GEN-LAST:event_cbo_areasActionPerformed

    private void tabla_EjecucionProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_EjecucionProcesoMouseClicked
        // TODO add your handling code here:
        int i = tabla_EjecucionProceso.getSelectedRow();
        String strProceso = "";
        TableModel model = tabla_EjecucionProceso.getModel();
        strProceso = model.getValueAt(i,3).toString().trim();
        System.out.println(strProceso);
        LlenarActividadporProceso(strProceso);
    }//GEN-LAST:event_tabla_EjecucionProcesoMouseClicked

    private void tabla_restriccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_restriccionesMouseClicked
        // TODO add your handling code here:
        int i = tabla_EjecucionProceso.getSelectedRow();
        String strActividad = "";
        TableModel model = tabla_restricciones.getModel();
        strActividad = model.getValueAt(i,0).toString().trim();
        System.out.println(strActividad);
    }//GEN-LAST:event_tabla_restriccionesMouseClicked

    private void tabla_actividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_actividadesMouseClicked
        // TODO add your handling code here:
         int i = tabla_actividades.getSelectedRow();
        String strActividad = "";
        TableModel model = tabla_actividades.getModel();
        strActividad = model.getValueAt(i,0).toString().trim();
        System.out.println(strActividad);
        LlenarRestriccionesActividad();
    }//GEN-LAST:event_tabla_actividadesMouseClicked

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
            java.util.logging.Logger.getLogger(FrmEjecucionProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjecucionProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjecucionProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjecucionProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjecucionProceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarExpediente;
    private javax.swing.JButton btn_ModificarH;
    private javax.swing.JButton btn_nuevoEjecucion;
    private javax.swing.JComboBox cbo_Procesos;
    private javax.swing.JComboBox<String> cbo_areas;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_EjecucionProceso;
    private javax.swing.JTable tabla_actividades;
    private javax.swing.JTable tabla_restricciones;
    private javax.swing.JTextField txt_NumExpediente;
    // End of variables declaration//GEN-END:variables
}
