
package Principal;

import Datos.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class VentanaUsuarios extends javax.swing.JDialog {
    
    //GUARA ARCHIVOS .TXT
    private void guardarUsuarioEnArchivo(Usuario u) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(u.nombre + "," + u.correo + "," + u.contraseña);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el usuario en el archivo: " + e.getMessage());
        }
    }
    Usuario usuario;

    
    public VentanaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        CampoNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        BTNcancelar = new javax.swing.JButton();
        BTNguardar = new javax.swing.JButton();
        BTNeditar = new javax.swing.JButton();
        BTNborrar = new javax.swing.JButton();
        BTNbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion De Usuario");
        setBackground(new java.awt.Color(0, 92, 138));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(741, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 248, 113));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIO");

        jPanel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRE");

        CampoCorreo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        CampoNombre.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CONTRASEÑA");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CORREO");

        CampoContraseña.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
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
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(0, 92, 138));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/login (1).png"))); // NOI18N

        BTNcancelar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/cerrar.png"))); // NOI18N
        BTNcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcancelarActionPerformed(evt);
            }
        });

        BTNguardar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/guardar-carpeta (1).png"))); // NOI18N
        BTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarActionPerformed(evt);
            }
        });

        BTNeditar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/editar-informacion.png"))); // NOI18N
        BTNeditar.setEnabled(false);
        BTNeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeditarActionPerformed(evt);
            }
        });

        BTNborrar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/papelera-de-reciclaje.png"))); // NOI18N
        BTNborrar.setEnabled(false);
        BTNborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarActionPerformed(evt);
            }
        });

        BTNbuscar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BTNbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Recursos/icons8-buscar-48.png"))); // NOI18N
        BTNbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(BTNborrar)
                        .addGap(44, 44, 44)
                        .addComponent(BTNbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNeditar)
                        .addGap(52, 52, 52)
                        .addComponent(BTNguardar)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNcancelar)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNeditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNborrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

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

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContraseñaActionPerformed

    private void BTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarActionPerformed
        //recuperar los datos en el formulario de usuario
        String nombre = CampoNombre.getText();
        String correo = CampoCorreo.getText();
        char[] contraseña = CampoContraseña.getPassword();
        //crear objeto(variable de tipo Usuario)
        Usuario u = new Usuario();
        u.nombre = nombre;
        u.correo = correo;
        String contraseña2 = String.valueOf(contraseña);
        u.contraseña = contraseña2;
        //validar si el dicionario (map) existe
        if(Usuario.usuarioBD == null){
            Usuario.usuarioBD = new HashMap<String, Usuario>();
        }
        //validar si el esuario ya esta guardado en el dicionario
        if(Usuario.usuarioBD.containsKey(nombre)){
            String msj = "Ya Existe Un Usuario Con Este Nombre"+nombre;
            JOptionPane.showMessageDialog(this, msj);
        }
        //aqui se guarda el usuario en el diccionario si no existe
        else{
        Usuario.usuarioBD.put(nombre, u);// CORREGIR AQUI SI HAY ERROR
        //se obtiene el numero de usuarios guardados
        int cuentaUsuarios = Usuario.usuarioBD.size();
        String msj = "Este Usuario Fue Guardado Exitosamente\n"
                + "Existen " + cuentaUsuarios +  "usuarios";
        JOptionPane.showMessageDialog(this, msj);
        limpiarCampos();
        }
        
      
    }//GEN-LAST:event_BTNguardarActionPerformed
    public void limpiarCampos(){
        CampoNombre.setText("");
        CampoCorreo.setText("");
        CampoContraseña.setText("");
        BTNeditar.setEnabled(false);
        BTNborrar.setEnabled(false);
    
    
    
    }
    private void BTNeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeditarActionPerformed
        //BTNbuscarActionPerformed(evt)
        //se valida que el campo nombre tenga algun dato
        if(CampoNombre.getText() == null || CampoNombre.getText().isEmpty()){
            String msj = "Para editar primero debe buscar un usuario";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }  
        if(CampoNombre.getText().equals(this.usuario.nombre) != true){
            String msj = "El Nombre no coincide con el consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        
        
        }
        //se obtiene el usario desde el diccionario
        Usuario u = Usuario.usuarioBD.get(CampoNombre.getText());
        //obtenemos los nuevos valores ingresados
        String correo = CampoCorreo.getText();
        char[] contraseña = CampoContraseña.getPassword();
        //cambiar los datos por los nuevos ingresados en el formulario
        this.usuario.correo = correo;
        this.usuario.contraseña = String.valueOf(contraseña);
        
        //se guarda el usuario con los nuevos datos
        Usuario.usuarioBD.put(this.usuario.nombre, usuario);
        //se muestra el mensaje
            String msj = "Usuario Editado Con Exito";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
        
        
    }//GEN-LAST:event_BTNeditarActionPerformed

    private void BTNborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarActionPerformed
        //se valida que el campo nombre tenga algun dato
        if(CampoNombre.getText() == null || CampoNombre.getText().isEmpty()){
            String msj = "Para editar primero debe buscar un usuario";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }  
        if(CampoNombre.getText().equals(this.usuario.nombre) != true){
            String msj = "El Nombre no coincide con el consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return ;
        }
        String msj = "¿Seguro Que Deseas Eliminar Este Usuario?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj, "CONFIRMAR", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
        Usuario.usuarioBD.remove(this.usuario.nombre);
        int total = Usuario.usuarioBD.size();
        String msj2 = "Usuario Eliminado Con Exito\nTOTAL: "+total;
        JOptionPane.showMessageDialog(this, msj2);
        limpiarCampos();
        }
    }//GEN-LAST:event_BTNborrarActionPerformed

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbuscarActionPerformed
        //recuperar el nombre del formulario
        String nombre = CampoNombre.getText();
        //verificar si existe o no
        if(Usuario.usuarioBD == null || Usuario.usuarioBD.isEmpty()){
            String msj = "No existen Usuarios en la base de datos";
            JOptionPane.showMessageDialog(this, msj);
        }
        //buscar usuario por el nombre
        else{
            if(Usuario.usuarioBD.containsKey(nombre)){
            this.usuario = Usuario.usuarioBD.get(nombre);
            CampoNombre.setText(this.usuario.nombre);
            CampoCorreo.setText(this.usuario.correo);
            CampoContraseña.setText(usuario.contraseña);
            BTNeditar.setEnabled(true);
            BTNborrar.setEnabled(true);
            }
            else{
            String msj = "No existen Usuarios con nombre"+nombre;
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            }
                
        }
        
    }//GEN-LAST:event_BTNbuscarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaUsuarios dialog = new VentanaUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
