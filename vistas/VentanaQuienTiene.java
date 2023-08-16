
package vistas;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.*;


public class VentanaQuienTiene extends javax.swing.JFrame {

    /**
     * Creates new form VentanaQuienTiene
     */
    public VentanaQuienTiene() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    public JLabel getPosesionLabel() {
        return posesionLabel;
    }

    public JPanel getPrimerPanel() {
        return primerPanel;
    }

    public JPanel getSegundoPanel() {
        return segundoPanel;
    }

    public JLabel getSeleccioneLabel() {
        return seleccioneLabel;
    }

    public JLabel getSocioLabel() {
        return socioLabel;
    }

    public JPanel getTercerPanel() {
        return tercerPanel;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }
    
    
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        primerPanel = new javax.swing.JPanel();
        seleccioneLabel = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        segundoPanel = new javax.swing.JPanel();
        posesionLabel = new javax.swing.JLabel();
        tercerPanel = new javax.swing.JPanel();
        socioLabel = new javax.swing.JLabel();
        volverBoton = new javax.swing.JButton();
        buscarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setText("¿Quien tiene el libro?");

        primerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        seleccioneLabel.setText("Seleccione el libro:");

        javax.swing.GroupLayout primerPanelLayout = new javax.swing.GroupLayout(primerPanel);
        primerPanel.setLayout(primerPanelLayout);
        primerPanelLayout.setHorizontalGroup(
            primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccioneLabel)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        primerPanelLayout.setVerticalGroup(
            primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seleccioneLabel)
                .addGap(18, 18, 18)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        segundoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        posesionLabel.setText("En posesion de:");

        javax.swing.GroupLayout segundoPanelLayout = new javax.swing.GroupLayout(segundoPanel);
        segundoPanel.setLayout(segundoPanelLayout);
        segundoPanelLayout.setHorizontalGroup(
            segundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(posesionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        segundoPanelLayout.setVerticalGroup(
            segundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, segundoPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(posesionLabel)
                .addContainerGap())
        );

        tercerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        socioLabel.setText(" ");

        javax.swing.GroupLayout tercerPanelLayout = new javax.swing.GroupLayout(tercerPanel);
        tercerPanel.setLayout(tercerPanelLayout);
        tercerPanelLayout.setHorizontalGroup(
            tercerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tercerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(socioLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tercerPanelLayout.setVerticalGroup(
            tercerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tercerPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(socioLabel)
                .addContainerGap())
        );

        volverBoton.setText("Volver");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });

        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(tituloLabel)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(segundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tercerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(volverBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBoton)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(primerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(segundoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tercerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverBoton)
                    .addComponent(buscarBoton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        QuienTieneController.botonVolver();
    }//GEN-LAST:event_volverBotonActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        QuienTieneController.botonBuscar();
    }//GEN-LAST:event_buscarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaQuienTiene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaQuienTiene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaQuienTiene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaQuienTiene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaQuienTiene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBoton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel posesionLabel;
    private javax.swing.JPanel primerPanel;
    private javax.swing.JPanel segundoPanel;
    private javax.swing.JLabel seleccioneLabel;
    private javax.swing.JLabel socioLabel;
    private javax.swing.JPanel tercerPanel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
