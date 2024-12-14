
package Principal;

import Datos.Computadora;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class VentanaComputadoras extends javax.swing.JDialog {
    
  
    Computadora computadora;
    private String procesador;
    private Object marca;

    
    public VentanaComputadoras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CampoModelo = new javax.swing.JTextField();
        CampoMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoProcesador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTNcancelar = new javax.swing.JButton();
        BTNguardar = new javax.swing.JButton();
        BTNeditar = new javax.swing.JButton();
        BTNborrar = new javax.swing.JButton();
        BTNbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion De Computadoras");
        setBackground(new java.awt.Color(18, 13, 53));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 248, 113));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPUTADORAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 46, 447, 47));

        jPanel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MARCA");

        CampoModelo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        CampoMarca.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PROCESADOR");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MODELO");

        CampoProcesador.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        CampoProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoProcesadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CampoProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 99, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 92, 138));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/escritorio (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 62, -1, 398));

        BTNcancelar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/cerrar.png"))); // NOI18N
        BTNcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 36));

        BTNguardar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/guardar-carpeta (1).png"))); // NOI18N
        BTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, 36));

        BTNeditar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/editar-informacion.png"))); // NOI18N
        BTNeditar.setEnabled(false);
        BTNeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeditarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, 36));

        BTNborrar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/papelera-de-reciclaje.png"))); // NOI18N
        BTNborrar.setEnabled(false);
        BTNborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 410, -1, 36));

        BTNbuscar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/icons8-buscar-48.png"))); // NOI18N
        BTNbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 410, 36, 36));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar?"
                ,"CONFIRMAR", JOptionPane.YES_NO_OPTION
                , JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION){
        this.dispose();
        }
        
        
    }//GEN-LAST:event_BTNcancelarActionPerformed

    private void BTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarActionPerformed
        //recuperar los datos en el formulario de usuario
        String marca = CampoMarca.getText();
        String modelo = CampoModelo.getText();
        String procesador = CampoProcesador.getText();
        
        //crear objeto(variable de tipo Usuario)
        Computadora u = new Computadora();
        u.marca = marca;
        u.modelo = modelo;
        u.procesador = procesador;
        
        //validar si el dicionario (map) existe
        if(computadora.computadoraBD == null){
            computadora.computadoraBD = new HashMap<String, Computadora>();
        }
        //validar si el esuario ya esta guardado en el dicionario
        if(computadora.computadoraBD.containsKey(marca)){
            String msj = "Ya Existe Una Marca Con Este ID"+marca;
            JOptionPane.showMessageDialog(this, msj);
        }
        //aqui se guarda el usuario en el diccionario si no existe
        else{
        computadora.computadoraBD.put(marca, u);// CORREGIR AQUI SI HAY ERROR
        //se obtiene el numero de usuarios guardados
        int cuentacomputadora = computadora.computadoraBD.size();
        String msj = "Este Equipo Fue Registrado Exitosamente\n"
                + "Existen " + cuentacomputadora +  "Equipos";
        JOptionPane.showMessageDialog(this, msj);
        limpiarCampos();
        }
        
      
    }//GEN-LAST:event_BTNguardarActionPerformed
    public void limpiarCampos(){
        CampoMarca.setText("");
        CampoModelo.setText("");
        CampoProcesador.setText("");
        BTNeditar.setEnabled(false);
        BTNborrar.setEnabled(false);
    
    
    
    }
    private void BTNeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeditarActionPerformed
        //BTNbuscarActionPerformed(evt)
        //se valida que el campo nombre tenga algun dato
        if(CampoMarca.getText() == null || CampoMarca.getText().isEmpty()){
            String msj = "Para editar primero debe buscar un Equipo";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }  
        if(CampoMarca.getText().equals(this.computadora.marca) != true){
            String msj = "La Marca no coincide con el consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        
        
        }
        //se obtiene el usario desde el diccionario
        Computadora u = computadora.computadoraBD.get(CampoMarca.getText());
        //obtenemos los nuevos valores ingresados
        String modelo = CampoModelo.getText();
        String prcesador = CampoProcesador.getText();
        
        //cambiar los datos por los nuevos ingresados en el formulario
        this.computadora.modelo = modelo;
        this.computadora.procesador = procesador;
        
        
        //se guarda el usuario con los nuevos datos
        computadora.computadoraBD.put(this.computadora.marca, computadora);
        //se muestra el mensaje
            String msj = "Equipo Editado Con Exito";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
        
        
    }//GEN-LAST:event_BTNeditarActionPerformed

    private void BTNborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarActionPerformed
        //se valida que el campo nombre tenga algun dato
        if(CampoMarca.getText() == null || CampoMarca.getText().isEmpty()){
            String msj = "Para editar primero debe buscar un equipo";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }  
        if(CampoMarca.getText().equals(this.computadora.marca) != true){
            String msj = "La Marca no coincide con el consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }
        String msj = "¿Seguro Que Deseas Eliminar Este Equipo?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj, "CONFIRMAR", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
        computadora.computadoraBD.remove(this.computadora.marca);
        int total = computadora.computadoraBD.size();
        String msj2 = "Equipo Eliminado Con Exito\nTOTAL: "+total;
        JOptionPane.showMessageDialog(this, msj2);
        limpiarCampos();
        }
    }//GEN-LAST:event_BTNborrarActionPerformed

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbuscarActionPerformed
        //recuperar el nombre del formulario
        String nombre = CampoMarca.getText();
        //verificar si existe o no
        if(computadora.computadoraBD == null || computadora.computadoraBD.isEmpty()){
            String msj = "No existen Equipos en la base de datos";
            JOptionPane.showMessageDialog(this, msj);
        }
        //buscar usuario por el nombre
        else{
            if(computadora.computadoraBD.containsKey(marca)){
            this.computadora = Computadora.computadoraBD.get(marca);
            CampoMarca.setText(this.computadora.marca);
            CampoModelo.setText(this.computadora.modelo);
            CampoProcesador.setText(this.computadora.procesador);
            
            BTNeditar.setEnabled(true);
            BTNborrar.setEnabled(true);
            }
            else{
            String msj = "No existen Computadoras con este ID"+nombre;
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            }
                
        }
        
    }//GEN-LAST:event_BTNbuscarActionPerformed

    private void CampoProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoProcesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoProcesadorActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaComputadoras dialog = new VentanaComputadoras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNborrar;
    private javax.swing.JButton BTNbuscar;
    private javax.swing.JButton BTNcancelar;
    private javax.swing.JButton BTNeditar;
    private javax.swing.JButton BTNguardar;
    private javax.swing.JTextField CampoMarca;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoProcesador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
