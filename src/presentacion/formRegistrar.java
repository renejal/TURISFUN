/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import static java.awt.SystemColor.control;
import javax.swing.JOptionPane;
import logica.clsControlador;

/**
 *
 * @author rene
 */
public class formRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form formRegistrar
     */
    public clsControlador control = clsControlador.getInstacia();
    public formRegistrar() {
        initComponents();
        this.Visibilidad(false);
        
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_identificacion = new javax.swing.JTextField();
        text_telefono = new javax.swing.JTextField();
        text_using = new javax.swing.JTextField();
        text_password = new javax.swing.JTextField();
        CBox_TipoUsuario = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbox_privilegios = new javax.swing.JComboBox<>();
        lbPrivilegios = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cBox_genero = new javax.swing.JComboBox<>();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar");

        jLabel2.setText("Nombre: ");

        jLabel4.setText("identificacion: ");

        jLabel5.setText("telefono:  ");

        jLabel6.setText("using: ");

        jLabel7.setText("password: ");

        CBox_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Socio", "Administrador"}));
        CBox_TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_TipoUsuarioActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbox_privilegios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto", "Medio", "Basico", "Bajo" }));

        lbPrivilegios.setText("privilegios");

        jLabel8.setText("Genero");

        cBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M","F" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrivilegios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbox_privilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(CBox_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_using, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(47, 47, 47)
                                .addComponent(btnCancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBox_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(text_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_using, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_privilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrivilegios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnCancelar))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Visibilidad(boolean parBoleano){
       
            this.cbox_privilegios.setVisible(parBoleano);
            this.lbPrivilegios.setVisible(parBoleano);
        
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
     private void mostrarMensaje(String parMensaje, String parTitulo){
        JOptionPane.showMessageDialog(null, parMensaje,parTitulo, JOptionPane.WARNING_MESSAGE);
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      if(this.CBox_TipoUsuario.getSelectedItem().toString().equals("Usuario")){
          control.crearUsuario(this.text_nombre.getText(),Long.parseLong(this.text_identificacion.getText()),Integer.parseInt(this.text_telefono.getText()),this.text_using.getText(),this.text_password.getText(),this.cBox_genero.getSelectedItem().toString().charAt(0));
          this.mostrarMensaje("se ha regsitrado Usuario!!", "registro");
      }else if(this.CBox_TipoUsuario.getSelectedItem().toString().equals("Administrador")){
          control.crearUsuario(this.text_nombre.getText(),Long.parseLong(this.text_identificacion.getText()),Integer.parseInt(this.text_telefono.getText()),this.text_using.getText(),this.text_password.getText(),this.cbox_privilegios.getSelectedItem().toString());
          this.mostrarMensaje("se ha regsitrado Administrador!!", "registro");
      }
      else{
          control.crearUsuario(this.text_nombre.getText(),Long.parseLong(this.text_identificacion.getText()),Integer.parseInt(this.text_telefono.getText()),this.text_using.getText(),this.text_password.getText());
          this.mostrarMensaje("se ha regsitrado Socio!!", "registro");
      }
      this.setVisible(false);
      index form1 = new index();
      form1.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void CBox_TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_TipoUsuarioActionPerformed
        if(this.CBox_TipoUsuario.getSelectedItem().toString().equals("Usuario")){
         this.Visibilidad(false);
      }else if(this.CBox_TipoUsuario.getSelectedItem().toString().equals("Administrador")){
          this.Visibilidad(true);
      }
      else{
          this.Visibilidad(false);
      }
    }//GEN-LAST:event_CBox_TipoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBox_TipoUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cBox_genero;
    private javax.swing.JComboBox<String> cbox_privilegios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbPrivilegios;
    private javax.swing.JTextField text_identificacion;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_password;
    private javax.swing.JTextField text_telefono;
    private javax.swing.JTextField text_using;
    // End of variables declaration//GEN-END:variables
}
