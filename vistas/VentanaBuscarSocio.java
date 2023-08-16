
package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.*;
import javax.swing.JTextField;


public class VentanaBuscarSocio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBuscarSocio
     */
    public VentanaBuscarSocio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JButton getBuscarBoton() {
        return buscarBoton;
    }

    public JTextField getDniField() {
        return dniField;
    }

    public JLabel getIngreseLabel() {
        return ingreseLabel;
    }

    public JPanel getPrimerPanel() {
        return primerPanel;
    }

    public JLabel getResuldoLabel() {
        return resuldoLabel;
    }

    public JPanel getSegundoPanel() {
        return segundoPanel;
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

    public JButton getVolverBoton() {
        return volverBoton;
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        primerPanel = new javax.swing.JPanel();
        ingreseLabel = new javax.swing.JLabel();
        dniField = new javax.swing.JTextField();
        segundoPanel = new javax.swing.JPanel();
        resuldoLabel = new javax.swing.JLabel();
        tercerPanel = new javax.swing.JPanel();
        socioLabel = new javax.swing.JLabel();
        buscarBoton = new javax.swing.JButton();
        volverBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setText("Buscar un Socio");

        primerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        ingreseLabel.setText("Ingrese DNI:");

        dniField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout primerPanelLayout = new javax.swing.GroupLayout(primerPanel);
        primerPanel.setLayout(primerPanelLayout);
        primerPanelLayout.setHorizontalGroup(
            primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingreseLabel)
                .addGap(18, 18, 18)
                .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        primerPanelLayout.setVerticalGroup(
            primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primerPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(primerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseLabel)
                    .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        segundoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        resuldoLabel.setText("Resultado de busqueda:");

        javax.swing.GroupLayout segundoPanelLayout = new javax.swing.GroupLayout(segundoPanel);
        segundoPanel.setLayout(segundoPanelLayout);
        segundoPanelLayout.setHorizontalGroup(
            segundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resuldoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        segundoPanelLayout.setVerticalGroup(
            segundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, segundoPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(resuldoLabel)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(socioLabel)
                .addContainerGap())
        );

        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        volverBoton.setText("Volver");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(volverBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBoton)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(tituloLabel)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(primerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tercerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloLabel)
                .addGap(33, 33, 33)
                .addComponent(primerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(segundoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tercerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBoton)
                    .addComponent(volverBoton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniFieldKeyTyped
        BuscarSocioController.dniFieldEvent(evt);
    }//GEN-LAST:event_dniFieldKeyTyped

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        BuscarSocioController.botonBuscar();
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        BuscarSocioController.botonVolver();
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
            java.util.logging.Logger.getLogger(VentanaBuscarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarSocio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBoton;
    private javax.swing.JTextField dniField;
    private javax.swing.JLabel ingreseLabel;
    private javax.swing.JPanel primerPanel;
    private javax.swing.JLabel resuldoLabel;
    private javax.swing.JPanel segundoPanel;
    private javax.swing.JLabel socioLabel;
    private javax.swing.JPanel tercerPanel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
