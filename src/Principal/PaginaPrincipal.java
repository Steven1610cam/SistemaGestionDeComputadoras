
package Principal;


public class PaginaPrincipal extends javax.swing.JFrame {

    
    public PaginaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        ItemCrearU = new javax.swing.JMenuItem();
        ItemEditarU = new javax.swing.JMenuItem();
        ItemEliminarU = new javax.swing.JMenuItem();
        BTNComputadora = new javax.swing.JMenu();
        ItemCrearC = new javax.swing.JMenuItem();
        ItemEditarC = new javax.swing.JMenuItem();
        ItemEliminarC = new javax.swing.JMenuItem();
        BTNCrearSisOp = new javax.swing.JMenu();
        ItemCrearSO = new javax.swing.JMenuItem();
        ItemEditarSO = new javax.swing.JMenuItem();
        ItemEliminarOP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("..:: SISTEMA DE GESTION DE COMPUTADORAS ::..");

        jPanel1.setBackground(new java.awt.Color(18, 13, 53));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        MenuUsuario.setText("Usuarios");

        ItemCrearU.setText("Crear Usuario");
        ItemCrearU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCrearUActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemCrearU);

        ItemEditarU.setText("Editar Usuario");
        ItemEditarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEditarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemEditarU);

        ItemEliminarU.setText("Eliminar Usuario");
        ItemEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEliminarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemEliminarU);

        jMenuBar1.add(MenuUsuario);

        BTNComputadora.setText("Computadora");

        ItemCrearC.setText("Crear Computadora");
        ItemCrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCrearCActionPerformed(evt);
            }
        });
        BTNComputadora.add(ItemCrearC);

        ItemEditarC.setText("Editar Computadora");
        BTNComputadora.add(ItemEditarC);

        ItemEliminarC.setText("Eliminar Computadora");
        BTNComputadora.add(ItemEliminarC);

        jMenuBar1.add(BTNComputadora);

        BTNCrearSisOp.setText("Sistema Operativo");

        ItemCrearSO.setText("Crear SisOp");
        ItemCrearSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCrearSOActionPerformed(evt);
            }
        });
        BTNCrearSisOp.add(ItemCrearSO);

        ItemEditarSO.setText("Editar SisOp");
        BTNCrearSisOp.add(ItemEditarSO);

        ItemEliminarOP.setText("Eliminar SisOp");
        BTNCrearSisOp.add(ItemEliminarOP);

        jMenuBar1.add(BTNCrearSisOp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemCrearSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCrearSOActionPerformed
        
        
    }//GEN-LAST:event_ItemCrearSOActionPerformed

    private void ItemCrearUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCrearUActionPerformed
        
        VentanaUsuarios ventana = new VentanaUsuarios(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_ItemCrearUActionPerformed

    private void ItemCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCrearCActionPerformed
        
        VentanaComputadoras ventana = new VentanaComputadoras(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_ItemCrearCActionPerformed

    private void ItemEditarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEditarUActionPerformed
        
        VentanaUsuarios ventana = new VentanaUsuarios(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_ItemEditarUActionPerformed

    private void ItemEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEliminarUActionPerformed
        
        VentanaUsuarios ventana = new VentanaUsuarios(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_ItemEliminarUActionPerformed

    
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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
        paginaPrincipal.setVisible(true);
        //paginaPrincipal.setLocationRelativeTo(null); // vista centrada 7w7
        paginaPrincipal.setExtendedState(PaginaPrincipal.MAXIMIZED_BOTH);
    }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BTNComputadora;
    private javax.swing.JMenu BTNCrearSisOp;
    private javax.swing.JMenuItem ItemCrearC;
    private javax.swing.JMenuItem ItemCrearSO;
    private javax.swing.JMenuItem ItemCrearU;
    private javax.swing.JMenuItem ItemEditarC;
    private javax.swing.JMenuItem ItemEditarSO;
    private javax.swing.JMenuItem ItemEditarU;
    private javax.swing.JMenuItem ItemEliminarC;
    private javax.swing.JMenuItem ItemEliminarOP;
    private javax.swing.JMenuItem ItemEliminarU;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
