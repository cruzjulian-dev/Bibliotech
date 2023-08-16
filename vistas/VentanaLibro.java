
package vistas;

import controlador.LibroController;
import javax.swing.JTextField;


public class VentanaLibro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLibro
     */
    public VentanaLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JTextField getAnioField() {
        return anioField;
    }

    public JTextField getEdicionField() {
        return edicionField;
    }

    public JTextField getEditorialField() {
        return editorialField;
    }

    public JTextField getTituloField() {
        return tituloField;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVentanaLabel = new javax.swing.JLabel();
        tituloTxtLabel = new javax.swing.JLabel();
        edicionTxtLabel = new javax.swing.JLabel();
        editorialTxtLabel = new javax.swing.JLabel();
        anioTxtLabel = new javax.swing.JLabel();
        tituloField = new javax.swing.JTextField();
        edicionField = new javax.swing.JTextField();
        editorialField = new javax.swing.JTextField();
        anioField = new javax.swing.JTextField();
        agregarBoton = new javax.swing.JButton();
        volverBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloVentanaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloVentanaLabel.setText("Agregar Libro");

        tituloTxtLabel.setText("Titulo:");

        edicionTxtLabel.setText("Edicion:");

        editorialTxtLabel.setText("Editorial:");

        anioTxtLabel.setText("Anio:");

        tituloField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tituloFieldKeyTyped(evt);
            }
        });

        edicionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionFieldKeyTyped(evt);
            }
        });

        editorialField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorialFieldKeyTyped(evt);
            }
        });

        anioField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anioFieldKeyTyped(evt);
            }
        });

        agregarBoton.setText("Agregar");
        agregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBotonActionPerformed(evt);
            }
        });
        agregarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agregarBotonKeyPressed(evt);
            }
        });

        volverBoton.setText("Volver");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });
        volverBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                volverBotonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edicionTxtLabel)
                            .addComponent(tituloTxtLabel)
                            .addComponent(editorialTxtLabel)
                            .addComponent(anioTxtLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(tituloVentanaLabel)
                                .addGap(0, 112, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(edicionField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editorialField)
                                    .addComponent(anioField))))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloVentanaLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloTxtLabel)
                    .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edicionTxtLabel)
                    .addComponent(edicionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editorialTxtLabel)
                    .addComponent(editorialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioTxtLabel)
                    .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBoton)
                    .addComponent(volverBoton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBotonActionPerformed
        LibroController.botonAgregar();
    }//GEN-LAST:event_agregarBotonActionPerformed

    private void agregarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarBotonKeyPressed
        LibroController.botonAgregarEnter(evt);
    }//GEN-LAST:event_agregarBotonKeyPressed

    private void tituloFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tituloFieldKeyTyped
        //
    }//GEN-LAST:event_tituloFieldKeyTyped

    private void edicionFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionFieldKeyTyped
        LibroController.edicionFieldEvent(evt);
    }//GEN-LAST:event_edicionFieldKeyTyped

    private void editorialFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorialFieldKeyTyped
        //
    }//GEN-LAST:event_editorialFieldKeyTyped

    private void anioFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anioFieldKeyTyped
        LibroController.anioFieldEvent(evt);
    }//GEN-LAST:event_anioFieldKeyTyped

    private void volverBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_volverBotonKeyPressed
        LibroController.botonVolverEnter(evt);
    }//GEN-LAST:event_volverBotonKeyPressed

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        LibroController.botonVolver();
    }//GEN-LAST:event_volverBotonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBoton;
    private javax.swing.JTextField anioField;
    private javax.swing.JLabel anioTxtLabel;
    private javax.swing.JTextField edicionField;
    private javax.swing.JLabel edicionTxtLabel;
    private javax.swing.JTextField editorialField;
    private javax.swing.JLabel editorialTxtLabel;
    private javax.swing.JTextField tituloField;
    private javax.swing.JLabel tituloTxtLabel;
    private javax.swing.JLabel tituloVentanaLabel;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
