/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2.pkg2;

import ConexionDAO.Conexion;
import DTO.Datos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lecona
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    DefaultTableModel tablaModelo = new DefaultTableModel();
    List<Datos> listaDatos = new ArrayList<>();
    int vId = 0;
    
    public JFPrincipal() {
        initComponents();
        cargartitulos();
        cargar();
        btneliminar.setEnabled(false);
        btneditar.setEnabled(false);
        btngrabar.setEnabled(false);
        txtnombre.setEditable(false);
        txtedad.setEditable(false);
        txtcorreo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Correo");

        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(102, 255, 204));

        txtedad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtedad.setForeground(new java.awt.Color(102, 255, 204));

        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(102, 255, 204));

        btngrabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        tabladata.setForeground(new java.awt.Color(255, 153, 153));
        tabladata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Edad", "Correo"
            }
        ));
        tabladata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabladata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btneditar)
                                .addGap(18, 18, 18)
                                .addComponent(btngrabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneliminar)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo)
                    .addComponent(btneditar)
                    .addComponent(btngrabar)
                    .addComponent(btneliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        txtnombre.setText("");
        txtedad.setText("");
        txtcorreo.setText("");
        btneditar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnnuevo.setEnabled(false);
        btngrabar.setEnabled(true);
        txtnombre.setEditable(true);
        txtedad.setEditable(true);
        txtcorreo.setEditable(true);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
        //Aciiones de los datos mi pana XD
        Conexion conexion = new Conexion();
        Datos datos = new Datos();
        datos.setNombre(txtnombre.getText());
        datos.setEdad(Integer.valueOf(txtedad.getText()));
        datos.setCorreo(txtcorreo.getText());
        if(conexion.insertar(datos)){
            JOptionPane.showMessageDialog(this, "Se grabo correctamente...");
            tablaModelo = (DefaultTableModel) tabladata.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al grabar");
        }
        
        //Acciones de los botones
        btneditar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnnuevo.setEnabled(true);
        btngrabar.setEnabled(false);
        txtnombre.setEditable(false);
        txtedad.setEditable(false);
        txtcorreo.setEditable(false);
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        Conexion conexion = new Conexion();
        Datos datos = new Datos();
        
        datos.setId(vId);
        datos.setNombre(txtnombre.getText());
        datos.setEdad(Integer.valueOf(txtedad.getText()));
        datos.setCorreo(txtcorreo.getText());
        
        if (conexion.actualizar(datos)){
            JOptionPane.showMessageDialog(this, "Se edito correctamente...");
            tablaModelo = (DefaultTableModel) tabladata.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al editar");
        }
        //Acciones de los botones
        btneditar.setEnabled(false);
        btneliminar.setEnabled(true);
        btnnuevo.setEnabled(true);
        btngrabar.setEnabled(true);
        txtnombre.setEditable(false);
        txtedad.setEditable(false);
        txtcorreo.setEditable(false);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Datos datos = new Datos();
        Conexion conexion = new Conexion();
        
        datos.setId(vId);
        
        if (conexion.borrar(vId)){
            JOptionPane.showMessageDialog(this, "Se borro correctamente...");
            tablaModelo = (DefaultTableModel) tabladata.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al borrar");
        }
        //Acciones de los botones
        btneditar.setEnabled(true);
        btneliminar.setEnabled(false);
        btnnuevo.setEnabled(true);
        btngrabar.setEnabled(true);
        txtnombre.setEditable(false);
        txtedad.setEditable(false);
        txtcorreo.setEditable(false);
    }//GEN-LAST:event_btneliminarActionPerformed
   
    private void cargar(){
        Conexion conexion = new Conexion();
        if(conexion.consultartodos()){
            listaDatos = conexion.getListDatos();
        }else{
          JOptionPane.showMessageDialog(this, "Error a el cargar Datos");  
        }
        if(listaDatos.size() > 0 && listaDatos != null){
            cargarcontenido();
        }       
    }
    
    private void cargarcontenido(){
        Object[] filatabla = new Object[4];
        for (Datos datos : listaDatos){
            filatabla[0]=datos.getId();
            filatabla[1]=datos.getNombre();
            filatabla[2]=datos.getEdad();
            filatabla[3]=datos.getCorreo();
            tablaModelo.addRow(filatabla);
        }
        tabladata.setModel(tablaModelo);
    }
    
    public void cargartitulos(){
        tablaModelo.addColumn("Id");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Edad");
        tablaModelo.addColumn("Correo");
        tabladata.setModel(tablaModelo);
    }
    private void tabladataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladataMouseClicked
        // TODO add your handling code here:
        int nfilas = 0;
        int fila = 0;
        nfilas = tabladata.getSelectedRowCount();
        if (nfilas == 1){
            fila = tabladata.getSelectedRow();
            vId = (int)tabladata.getValueAt(fila, 0);
            txtnombre.setText((String)tabladata.getValueAt(fila, 1));
            txtedad.setText((String)tabladata.getValueAt(fila, 2));
            txtcorreo.setText((String)tabladata.getValueAt(fila, 3));
    }//GEN-LAST:event_tabladataMouseClicked

    
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabladata;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
