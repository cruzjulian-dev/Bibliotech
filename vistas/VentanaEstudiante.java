
package vistas;
import controlador.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaEstudiante extends javax.swing.JFrame {

    public VentanaEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JTextField getCarreraField() {
        return carreraField;
    }

    public JLabel getCarreraLabel() {
        return carreraLabel;
    }

    public JTextField getDniField() {
        return dniField;
    }

    public JLabel getDniLabel() {
        return dniLabel;
    }

    public JTextField getNombreField() {
        return nombreField;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public JButton getRegistrarButton() {
        return registrarButton;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public JButton getVolverButton() {
        return volverButton;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        dniField = new javax.swing.JTextField();
        carreraField = new javax.swing.JTextField();
        registrarButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nombreLabel.setText("Nombre:");

        dniLabel.setText("DNI:");

        carreraLabel.setText("Carrera:");

        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
        });

        dniField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniFieldKeyTyped(evt);
            }
        });

        carreraField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carreraFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carreraFieldKeyTyped(evt);
            }
        });

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });
        registrarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registrarButtonKeyPressed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });
        volverButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                volverButtonKeyPressed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setText("Registro de un nuevo socio Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreLabel)
                                    .addComponent(dniLabel)
                                    .addComponent(carreraLabel))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreField)
                                    .addComponent(dniField)
                                    .addComponent(carreraField, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                            .addComponent(tituloLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(volverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarButton)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carreraLabel)
                    .addComponent(carreraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarButton)
                    .addComponent(volverButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniFieldKeyTyped
        EstudianteController.dniFieldEvent(evt);
    }//GEN-LAST:event_dniFieldKeyTyped

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
        EstudianteController.nombreFieldEvent(evt);
    }//GEN-LAST:event_nombreFieldKeyTyped

    private void carreraFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreraFieldKeyTyped
        EstudianteController.carreraFieldEvent(evt);
    }//GEN-LAST:event_carreraFieldKeyTyped

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        EstudianteController.botonRegistrar();
        GestionBibliotecaController.botonActualizar();
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        EstudianteController.botonVolver();
    }//GEN-LAST:event_volverButtonActionPerformed

    private void registrarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarButtonKeyPressed
        EstudianteController.botonRegistrarEnter(evt);
        GestionBibliotecaController.botonActualizar();
    }//GEN-LAST:event_registrarButtonKeyPressed

    private void carreraFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreraFieldKeyPressed
        //
    }//GEN-LAST:event_carreraFieldKeyPressed

    private void volverButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_volverButtonKeyPressed
        EstudianteController.ocultar();
    }//GEN-LAST:event_volverButtonKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carreraField;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JTextField dniField;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton registrarButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
