
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AgregarCliente extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cone = (Connection) con.getConnection();
    
    
    
    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente() {
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

        LBLTitulo = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        LBLApellidos = new javax.swing.JLabel();
        LBLIdentidad = new javax.swing.JLabel();
        LBLRtn = new javax.swing.JLabel();
        LBLCelular = new javax.swing.JLabel();
        TXTNombres = new javax.swing.JTextField();
        TXTApellidos = new javax.swing.JTextField();
        TXTIdentidad = new javax.swing.JTextField();
        TXTRtn = new javax.swing.JTextField();
        TXTCelular = new javax.swing.JTextField();
        BTNAgregar = new javax.swing.JButton();
        BTNRegresar = new javax.swing.JButton();
        BTNMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBLTitulo.setText("Agregar Clientes");

        LBLNombre.setText("Nombres:");

        LBLApellidos.setText("Apellidos:");

        LBLIdentidad.setText("Identidad:");

        LBLRtn.setText("RTN:");

        LBLCelular.setText("Celular:");

        TXTCelular.setText("jTextField5");

        BTNAgregar.setText("AGREGAR");
        BTNAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarActionPerformed(evt);
            }
        });

        BTNRegresar.setText("Regresar");
        BTNRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarActionPerformed(evt);
            }
        });

        BTNMenuPrincipal.setText("Menu Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(LBLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBLNombre)
                                .addGap(18, 18, 18)
                                .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBLIdentidad)
                                .addGap(18, 18, 18)
                                .addComponent(TXTIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBLApellidos)
                                .addGap(20, 20, 20)
                                .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBLRtn)
                                    .addComponent(LBLCelular))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTRtn, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(TXTCelular)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(BTNAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(BTNRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(BTNMenuPrincipal)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LBLTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLApellidos)
                    .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLIdentidad)
                    .addComponent(TXTIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLRtn)
                    .addComponent(TXTRtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular)
                    .addComponent(TXTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAgregar)
                    .addComponent(BTNRegresar)
                    .addComponent(BTNMenuPrincipal))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarActionPerformed
        try {
            // TODO add your handling code here:
            if(TXTNombres.getText().equals("") || TXTApellidos.getText().equals("") || TXTIdentidad.getText().equals("") || TXTRtn.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Hay campos vacios");
            }else{
                PreparedStatement pst = cone.prepareStatement("INSERT INTO cliente (nombre_cliente,apellido_cliente,id_cliente,rtn,celular) VALUES(?,?,?,?,?)");
                pst.setString(1, TXTNombres.getText());
                pst.setString(2, TXTApellidos.getText());
                pst.setString(3, TXTIdentidad.getText());
                pst.setString(4, TXTRtn.getText());
                pst.setString(5, TXTCelular.getText());            
                pst.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNAgregarActionPerformed

    private void BTNRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarActionPerformed
        // TODO add your handling code here:
        MenuClientes cliente =new   MenuClientes();
        cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregar;
    private javax.swing.JButton BTNMenuPrincipal;
    private javax.swing.JButton BTNRegresar;
    private javax.swing.JLabel LBLApellidos;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLIdentidad;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLRtn;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTCelular;
    private javax.swing.JTextField TXTIdentidad;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTRtn;
    // End of variables declaration//GEN-END:variables
    
}
